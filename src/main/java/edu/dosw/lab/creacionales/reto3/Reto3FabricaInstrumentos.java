package edu.dosw.lab.creacionales.reto3;

import java.util.ArrayList;
import java.util.List;

public class Reto3FabricaInstrumentos {

    public static void ejecutar() {
        System.out.println("=== Reto 3: La Fábrica de Instrumentos ===");
        System.out.println("Bienvenido a Armonía Andina\n");

        List<Instrumento> pedido = new ArrayList<>();

        // El cliente solo interactúa con la fábrica de la gama elegida,
        // nunca instancia Instrumento directamente ni conoce sus reglas.
        pedido.add(new ProfesionalFactory().crearInstrumento(ModeloInstrumento.VIOLIN));
        pedido.add(new VintageFactory().crearInstrumento(ModeloInstrumento.SAXOFON));

        for (int i = 0; i < pedido.size(); i++) {
            Instrumento ins = pedido.get(i);
            System.out.println("Instrumento " + (i + 1) + ": " + ins.getModelo().getNombre() + " " + ins.getGama());
            System.out.println("  Afinación: " + ins.getAfinacionHz() + " Hz");
            System.out.printf("  Precio: $%,.0f%n%n", ins.getPrecio());
        }

        double total = pedido.stream()
                .mapToDouble(Instrumento::getPrecio)
                .sum();

        System.out.printf("Total a pagar: $%,.0f%n", total);
        System.out.println("¡Gracias por su pedido!");
        System.out.println();
    }
}
