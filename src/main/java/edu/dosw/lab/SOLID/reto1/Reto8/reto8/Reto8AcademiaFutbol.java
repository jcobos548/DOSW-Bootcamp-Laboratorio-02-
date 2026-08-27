package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

import java.util.List;

public class Reto8AcademiaFutbol {

    public static void ejecutar() {
        System.out.println("=== Reto 8: La Academia de Fútbol de los UML ===");

        JugadorInfo arquero = new Arquero("Kevin Mier", 27, 1, "Derecho", 82, 1.88, "Óptimo", "Profesional");
        JugadorInfo defensa = new Defensa("Yerry Mina", 30, 3, "Derecho", 79, 1.91, "Óptimo", "Profesional");
        JugadorInfo delantero = new Delantero("Luis Díaz", 28, 7, "Izquierdo", 73, 1.75, "Óptimo", "Profesional");

        // Decorator: se agregan atributos dinámicos sin tocar JugadorBase ni Delantero
        JugadorInfo delanteroCompleto = new ValorMercadoDecorator(
                new PaisOrigenDecorator(
                        new PosicionSecundariaDecorator(delantero, "Extremo izquierdo"),
                        "Colombia"),
                45000000);

        Entrenador entrenador = new Entrenador("Néstor Lorenzo", 55, "Táctica ofensiva");
        entrenador.asignarJugador(arquero);
        entrenador.asignarJugador(defensa);
        entrenador.asignarJugador(delanteroCompleto);

        Hincha hincha = new Hincha("Camila", 24);
        hincha.agregarFavorito(delanteroCompleto);

        entrenador.dirigir(delanteroCompleto);
        entrenador.evaluar(delanteroCompleto);
        entrenador.planearSesion(delanteroCompleto);

        hincha.animar(delanteroCompleto);
        hincha.pedirAutografo(entrenador);
        hincha.publicarFoto(delanteroCompleto);

        System.out.println();
        arquero.patear();
        defensa.patear();
        delanteroCompleto.patear(); // polimorfismo: sigue ejecutando el patear() del Delantero real

        System.out.println();
        System.out.println("Ficha completa: " + delanteroCompleto.descripcionCompleta());

        List<JugadorInfo> plantilla = List.of(arquero, defensa, delanteroCompleto);
        long profesionales = plantilla.stream()
                .filter(j -> j.getCategoria().equals("Profesional"))
                .count();
        System.out.println("Jugadores en categoría Profesional: " + profesionales);
        System.out.println();
    }
}
