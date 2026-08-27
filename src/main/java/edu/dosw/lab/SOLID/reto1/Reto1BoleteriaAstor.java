package edu.dosw.lab.SOLID.reto1;

public class Reto1BoleteriaAstor {

    public static void ejecutar() {
        System.out.println("=== Reto 1: La Boletería del Cine Astor ===");
        System.out.println("Bienvenido al Cine Astor!");
        System.out.println("Espectador: Estudiante\n");

        Boleta boleta2D = new Boleta("Boleta 2D", 14000);
        Boleta boleta3D = new Boleta("Boleta 3D", 22000);
        ProductoConfiteria crispetas = new ProductoConfiteria("Crispetas", 9000);
        ProductoConfiteria gaseosa = new ProductoConfiteria("Gaseosa", 4500);

        Orden orden = new Orden(new Estudiante());
        orden.agregarItem(boleta3D, 2);
        orden.agregarItem(crispetas, 1);
        orden.agregarItem(gaseosa, 2);

        System.out.println();
        orden.imprimirFactura();
        System.out.println();
    }
}
