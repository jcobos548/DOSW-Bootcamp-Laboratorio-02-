package edu.dosw.lab.comportamiento.reto7;

public class ComandoMotor implements Comando {

    private final Rover rover;
    private final String operador;
    private final String accion;
    private final int metros;

    public ComandoMotor(Rover rover, String operador, String accion, int metros) {

        if (!accion.equals("Avanzar") && !accion.equals("Retroceder")) {
            throw new IllegalArgumentException("Acción de motor no válida.");
        }

        if (metros < 0) {
            throw new IllegalArgumentException("Los metros no pueden ser negativos.");
        }

        this.rover = rover;
        this.operador = operador;
        this.accion = accion;
        this.metros = metros;
    }

    @Override
    public void ejecutar() {

        if (accion.equals("Avanzar")) {
            System.out.println(rover.avanzar(metros));
        } else {
            System.out.println(rover.retroceder(metros));
        }
    }

    @Override
    public void deshacer() {

        if (accion.equals("Avanzar")) {
            rover.retroceder(metros);
        } else {
            rover.avanzar(metros);
        }
    }

    @Override
    public String obtenerDescripcion() {
        return "Motor " + accion + "(" + metros + "m)";
    }

    @Override
    public String obtenerOperador() {
        return operador;
    }

    @Override
    public String obtenerDescripcionDeshacer() {

        if (accion.equals("Avanzar")) {
            return "Motor Retroceder(" + metros + "m)";
        }

        return "Motor Avanzar(" + metros + "m)";
    }
}