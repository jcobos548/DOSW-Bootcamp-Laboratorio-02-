package edu.dosw.lab.comportamiento.reto7;

public class ComandoBrazo implements Comando {

    private final Rover rover;
    private final String operador;
    private final String accion;

    public ComandoBrazo(Rover rover, String operador, String accion) {

        if (!accion.equals("Recoger") && !accion.equals("Soltar")) {
            throw new IllegalArgumentException("Acción de brazo no válida.");
        }

        this.rover = rover;
        this.operador = operador;
        this.accion = accion;
    }

    @Override
    public void ejecutar() {

        if (accion.equals("Recoger")) {
            System.out.println(rover.recoger());
        } else {
            System.out.println(rover.soltar());
        }
    }

    @Override
    public void deshacer() {

        if (accion.equals("Recoger")) {
            rover.soltar();
        } else {
            rover.recoger();
        }
    }

    @Override
    public String obtenerDescripcion() {
        return "Brazo " + accion;
    }

    @Override
    public String obtenerOperador() {
        return operador;
    }

    @Override
    public String obtenerDescripcionDeshacer() {

        if (accion.equals("Recoger")) {
            return "Brazo Soltar";
        }

        return "Brazo Recoger";
    }
}