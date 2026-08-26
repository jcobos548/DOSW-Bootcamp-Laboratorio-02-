package edu.dosw.lab.comportamiento.reto6;

public class Enfermero extends Profesional {

    @Override
    protected boolean puedeAtender(Paciente paciente) {
        return paciente.getNivel() == Nivel.LEVE;
    }

    @Override
    protected void atenderPaciente(Paciente paciente) {
        System.out.println("Enfermero atendió.");
    }
}