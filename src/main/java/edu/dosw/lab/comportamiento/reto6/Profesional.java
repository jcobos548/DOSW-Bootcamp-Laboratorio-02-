package edu.dosw.lab.comportamiento.reto6;

public abstract class Profesional {

    private Profesional siguiente;

    public void establecerSiguiente(Profesional siguiente) {
        this.siguiente = siguiente;
    }

    public boolean atender(Paciente paciente) {
        if (puedeAtender(paciente)) {
            atenderPaciente(paciente);
            return true;
        }

        if (siguiente != null) {
            return siguiente.atender(paciente);
        }

        System.out.println("Sin profesional disponible.");
        System.out.println("Paciente remitido a otra institución.");
        return false;
    }

    protected abstract boolean puedeAtender(Paciente paciente);

    protected abstract void atenderPaciente(Paciente paciente);
}