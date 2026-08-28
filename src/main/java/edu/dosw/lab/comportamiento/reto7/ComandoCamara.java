package edu.dosw.lab.comportamiento.reto7;

public class ComandoCamara implements Comando {

    private final Rover rover;
    private final String operador;
    private final String accion;
    private final int segundos;

    public ComandoCamara(
            Rover rover,
            String operador,
            String accion,
            int segundos) {

        if (!accion.equals("Grabar") && !accion.equals("Detener")) {
            throw new IllegalArgumentException("Acción de cámara no válida.");
        }

        if (segundos < 0 || segundos > 120) {
            throw new IllegalArgumentException(
                    "Los segundos deben estar entre 0 y 120.");
        }

        this.rover = rover;
        this.operador = operador;
        this.accion = accion;
        this.segundos = segundos;
    }

    @Override
    public void ejecutar() {

        if (accion.equals("Grabar")) {
            System.out.println(rover.grabar(segundos));
        } else {
            System.out.println(rover.detenerCamara());
        }
    }

    @Override
    public void deshacer() {

        if (accion.equals("Grabar")) {
            rover.detenerCamara();
        } else {
            rover.grabar(segundos);
        }
    }

    @Override
    public String obtenerDescripcion() {

        if (accion.equals("Grabar")) {
            return "Cámara Grabar(" + segundos + "s)";
        }

        return "Cámara Detener";
    }

    @Override
    public String obtenerOperador() {
        return operador;
    }

    @Override
    public String obtenerDescripcionDeshacer() {

        if (accion.equals("Grabar")) {
            return "Cámara Detener";
        }

        return "Cámara Grabar(" + segundos + "s)";
    }
}