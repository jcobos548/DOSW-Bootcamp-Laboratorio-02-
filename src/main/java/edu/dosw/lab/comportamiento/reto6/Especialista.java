package edu.dosw.lab.comportamiento.reto6;

public class Especialista extends Profesional {

    @Override
    protected boolean puedeAtender(Paciente paciente) {
        return paciente.getNivel() == Nivel.GRAVE;
    }

    @Override
    protected void atenderPaciente(Paciente paciente) {
        System.out.println("Especialista atendió.");
    }
}