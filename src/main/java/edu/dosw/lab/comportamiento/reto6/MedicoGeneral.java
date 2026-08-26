package edu.dosw.lab.comportamiento.reto6;

public class MedicoGeneral extends Profesional {

    @Override
    protected boolean puedeAtender(Paciente paciente) {
        return paciente.getNivel() == Nivel.MODERADO;
    }

    @Override
    protected void atenderPaciente(Paciente paciente) {
        System.out.println("Médico General atendió.");
    }
}