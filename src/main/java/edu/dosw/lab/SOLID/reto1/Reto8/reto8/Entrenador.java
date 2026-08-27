package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

import java.util.ArrayList;
import java.util.List;


public class Entrenador {
    private final String nombre;
    private int edad;
    private final String especialidad;
    private final List<JugadorInfo> jugadoresAsignados = new ArrayList<>();

    public Entrenador(String nombre, int edad, String especialidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<JugadorInfo> getJugadoresAsignados() {
        return jugadoresAsignados;
    }

    public void asignarJugador(JugadorInfo jugador) {
        jugadoresAsignados.add(jugador);
    }

    public void dirigir(JugadorInfo jugador) {
        System.out.println(nombre + " dirige a " + jugador.getNombre() + ".");
    }

    public void evaluar(JugadorInfo jugador) {
        System.out.println(nombre + " evalúa a " + jugador.getNombre()
                + ": estado físico " + jugador.getEstadoFisico() + ".");
    }

    public void planearSesion(JugadorInfo jugador) {
        System.out.println(nombre + " planea una sesión de " + especialidad
                + " para " + jugador.getNombre() + ".");
    }
}
