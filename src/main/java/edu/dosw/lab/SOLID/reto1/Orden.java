package edu.dosw.lab.SOLID.reto1;

import java.util.ArrayList;
import java.util.List;


public class Orden {
    private final TipoEspectador tipoEspectador;
    private final List<LineaOrden> lineas = new ArrayList<>();

    public Orden(TipoEspectador tipoEspectador) {
        this.tipoEspectador = tipoEspectador;
    }

    public void agregarItem(ItemOrden item, int cantidad) {
        lineas.add(new LineaOrden(item, cantidad));
        System.out.println(item.getNombre() + ": " + cantidad + " unidad(es) agregada(s) a la orden.");
    }

    public double calcularSubtotal() {
        // Stream + map + reduce (a través de mapToDouble/sum)
        return lineas.stream()
                .mapToDouble(LineaOrden::getSubtotal)
                .reduce(0.0, Double::sum);
    }

    public double calcularDescuento() {
        return calcularSubtotal() * tipoEspectador.factorDescuento();
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();
    }

    public void imprimirFactura() {
        System.out.println("------ FACTURA DE TAQUILLA -----");
        System.out.println("Espectador: " + tipoEspectador.getNombre());
        System.out.println("Ítems:");

        // Stream + forEach para imprimir cada línea
        lineas.forEach(l -> System.out.printf("  %-12s - $%,.0f%n",
                l.getItem().getNombre(), l.getSubtotal()));

        System.out.printf("Subtotal:        $%,.0f%n", calcularSubtotal());
        if (tipoEspectador.factorDescuento() > 0) {
            System.out.printf("Descuento (%.0f%%): $%,.0f%n",
                    tipoEspectador.factorDescuento() * 100, calcularDescuento());
        }
        System.out.printf("Total a pagar:   $%,.0f%n", calcularTotal());
        System.out.println("--------------------------------");
        System.out.println("¡Disfrute la función!");
    }
}
