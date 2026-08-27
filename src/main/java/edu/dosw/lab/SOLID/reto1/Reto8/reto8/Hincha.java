package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

import java.util.ArrayList;
import java.util.List;


public class Hincha {
    private final String nombre;
    private int edad;
    private final List<JugadorInfo> jugadoresFavoritos = new ArrayList<>();
    private int camisetas;

    public Hincha(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    public int getCamisetas() {
        return camisetas;
    }

    public void setCamisetas(int camisetas) {
        this.camisetas = camisetas;
    }

    public List<JugadorInfo> getJugadoresFavoritos() {
        return jugadoresFavoritos;
    }

    public void agregarFavorito(JugadorInfo jugador) {
        jugadoresFavoritos.add(jugador);
    }

    public void animar(JugadorInfo jugador) {
        System.out.println(nombre + " anima a " + jugador.getNombre() + ": ¡Vamos!");
    }

    public void pedirAutografo(Entrenador entrenador) {
        System.out.println(nombre + " le pide un autógrafo a " + entrenador.getNombre() + ".");
    }

    public void publicarFoto(JugadorInfo jugador) {
        System.out.println(nombre + " publica una foto con " + jugador.getNombre() + ".");
    }
}
