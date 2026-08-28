package edu.dosw.lab.comportamiento.reto7;

public class ComandoTaladro implements Comando {

    private final Rover rover;
    private final String operador;
    private final String accion;
    private final int profundidad;

    public ComandoTaladro(
            Rover rover,
            String operador,
            String accion,
            int profundidad) {

        if (!accion.equals("Perforar") && !accion.equals("Retraer")) {
            throw new IllegalArgumentException("Acción de taladro no válida.");
        }

        if (profundidad < 0) {
            throw new IllegalArgumentException(
                    "La profundidad no puede ser negativa.");
        }

        this.rover = rover;
        this.operador = operador;
        this.accion = accion;
        this.profundidad = profundidad;
    }

    @Override
    public void ejecutar() {

        if (accion.equals("Perforar")) {
            System.out.println(rover.perforar(profundidad));
        } else {
            System.out.println(rover.retraerTaladro());
        }
    }

    @Override
    public void deshacer() {

        if (accion.equals("Perforar")) {
            rover.retraerTaladro();
        } else {
            rover.perforar(profundidad);
        }
    }

    @Override
    public String obtenerDescripcion() {

        if (accion.equals("Perforar")) {
            return "Taladro Perforar(" + profundidad + "cm)";
        }

        return "Taladro Retraer";
    }

    @Override
    public String obtenerOperador() {
        return operador;
    }

    @Override
    public String obtenerDescripcionDeshacer() {

        if (accion.equals("Perforar")) {
            return "Taladro se retrae.";
        }

        return "Taladro perfora " + profundidad + " cm.";
    }
}