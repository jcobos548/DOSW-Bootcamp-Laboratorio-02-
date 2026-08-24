package edu.dosw.lab.estructurales.reto4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto4BalanzaTrucada {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        Balanza balanza = new Balanza();
        ConvertidorPeso adaptador = new AdaptadorBalanza(balanza);

        System.out.println("Balanza Honesta del Mercado");
        System.out.print("¿Cuántos pesajes? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        List<PesajeSolicitud> solicitudes = new ArrayList<>();

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("P " + i + ": ");

            String linea = scanner.nextLine().trim();
            String[] partes = linea.split("\\s+");

            double valor = Double.parseDouble(
                    partes[0].replace(".", "").replace(",", ".")
            );

            UnidadPeso origen = leerUnidad(partes[1]);
            UnidadPeso destino = leerUnidad(partes[3]);

            solicitudes.add(
                    new PesajeSolicitud(
                            balanza.pesar(valor, origen),
                            destino
                    )
            );
        }

        System.out.println();

        solicitudes.stream()
                .forEach((solicitud) -> {
                    Pesaje pesaje = solicitud.getPesaje();

                    double resultado = adaptador.convertir(
                            pesaje.getCantidad(),
                            pesaje.getUnidad(),
                            solicitud.getDestino()
                    );

                    System.out.printf(
                            "P %d: %s %s = %s %s%n",
                            solicitudes.indexOf(solicitud) + 1,
                            formatearOriginal(pesaje.getCantidad()),
                            simbolo(pesaje.getUnidad()),
                            formatearResultado(resultado),
                            simbolo(solicitud.getDestino())
                    );
                });

        double totalKg = solicitudes.stream()
                .mapToDouble(solicitud -> {
                    Pesaje pesaje = solicitud.getPesaje();

                    return adaptador.convertir(
                            pesaje.getCantidad(),
                            pesaje.getUnidad(),
                            UnidadPeso.KG
                    );
                })
                .sum();

        System.out.println("--- Resumen ---");
        System.out.printf(
                "Total kg equivalente: %s kg%n",
                formatearResultado(totalKg)
        );

        System.out.println("¡Gracias por comprar en la plaza!");
    }

    private static UnidadPeso leerUnidad(String unidad) {
        return switch (unidad.toLowerCase()) {
            case "g" -> UnidadPeso.G;
            case "kg" -> UnidadPeso.KG;
            case "lb" -> UnidadPeso.LB;
            case "@" -> UnidadPeso.ARROBA;
            default -> throw new IllegalArgumentException(
                    "Unidad no válida: " + unidad
            );
        };
    }

    private static String simbolo(UnidadPeso unidad) {
        return switch (unidad) {
            case G -> "g";
            case KG -> "kg";
            case LB -> "lb";
            case ARROBA -> "@";
        };
    }

    private static String formatearOriginal(double valor) {
        if (valor == (long) valor) {
            return String.format("%,d", (long) valor);
        }

        return String.valueOf(valor).replace(".", ",");
    }

    private static String formatearResultado(double valor) {
        if (valor == (long) valor) {
            return String.format("%,d", (long) valor);
        }

        String resultado = String.format("%.3f", valor)
                .replace(".", ",");

        while (resultado.endsWith("0")) {
            resultado = resultado.substring(0, resultado.length() - 1);
        }

        return resultado;
    }

    public static void main(String[] args) {
        ejecutar();
    }
}