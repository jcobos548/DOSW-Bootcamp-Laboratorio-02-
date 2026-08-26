package edu.dosw.lab.comportamiento.reto6;

public class Paciente {

    private final String sintoma;
    private final Nivel nivel;
    private final Prioridad prioridad;

    public Paciente(String sintoma, Nivel nivel, Prioridad prioridad) {
        this.sintoma = sintoma;
        this.nivel = nivel;
        this.prioridad = prioridad;
    }

    public String getSintoma() {
        return sintoma;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}