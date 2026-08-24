package edu.dosw.lab.estructurales.reto5;

public class Reto5MotoPersonalizada {

    public static void ejecutar() {

        Moto moto = new MotoBase();

        System.out.println("Taller Turbo Andes");
        System.out.println("Moto base: " + moto.getDescripcion());
        System.out.printf("Precio base: $%,.0f%n", moto.getPrecio());

        moto = new EscapeDeportivo(moto);
        moto = new PinturaMateNegro(moto);
        moto = new BaulTrasero(moto);

        System.out.println();
        System.out.println("--- Tu Moto ---");
        System.out.println(moto.getDescripcion());

        System.out.println();
        System.out.println("Descripción:");
        System.out.println("Naked 250 con escape deportivo,");
        System.out.println("pintura mate negro y baúl trasero");

        System.out.printf("%nPrecio base: $%,.0f%n", 9800000.0);
        System.out.printf("Mejoras: $%,.0f%n", moto.getPrecio() - 9800000);
        System.out.printf("Total: $%,.0f%n", moto.getPrecio());

        System.out.println("¡Buen viaje!");
    }

    public static void main(String[] args) {
        ejecutar();
    }
}