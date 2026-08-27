package edu.dosw.lab.creacionales.reto2;

public class Reto2SastreMedida {

    public static void ejecutar() {
        System.out.println("=== Reto 2: El Sastre a la Medida ===");
        System.out.println("Bienvenido al Taller del Sastre\n");

        Traje traje = new TrajeBuilder()
                .tela("Lana ital.", 320000)
                .saco("Cruzado", 250000)
                .pantalon("Slim", 180000)
                .chaleco("Clásico", 90000)
                .bordado("Iniciales", 35000)
                .build();

        traje.mostrar();
        System.out.println();
    }
}
