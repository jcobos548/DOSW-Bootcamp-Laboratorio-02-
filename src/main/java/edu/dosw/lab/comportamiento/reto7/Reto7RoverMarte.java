package edu.dosw.lab.comportamiento.reto7;

public class Reto7RoverMarte {

    public static void ejecutar() {

        Rover rover = new Rover();
        Historial historial = new Historial();

        Comando accion1 =
                new ComandoMotor(
                        rover,
                        "Camila",
                        "Avanzar",
                        12
                );

        Comando accion2 =
                new ComandoCamara(
                        rover,
                        "Camila",
                        "Grabar",
                        30
                );

        Comando accion3 =
                new ComandoTaladro(
                        rover,
                        "Camila",
                        "Perforar",
                        15
                );

        Comando accion4 =
                new ComandoBrazo(
                        rover,
                        "Julián",
                        "Recoger"
                );

        Comando accion5 =
                new ComandoMotor(
                        rover,
                        "Julián",
                        "Retroceder",
                        4
                );

        historial.registrar(accion1);
        historial.registrar(accion2);
        historial.registrar(accion3);
        historial.registrar(accion4);
        historial.registrar(accion5);

        accion1.ejecutar();
        accion2.ejecutar();
        accion3.ejecutar();
        accion4.ejecutar();
        accion5.ejecutar();

        historial.deshacer(3);

        System.out.println(
                "Acción deshecha: "
                        + accion3.obtenerDescripcionDeshacer()
        );

        historial.mostrar();
    }

    public static void main(String[] args) {
        ejecutar();
    }
}