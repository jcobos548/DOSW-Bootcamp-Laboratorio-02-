package edu.dosw.lab.creacionales.reto3;


public enum ModeloInstrumento {
    GUITARRA("Guitarra", "Cuerda", 800000),
    VIOLIN("Violín", "Cuerda", 1600000),
    BAJO("Bajo", "Cuerda", 1200000),
    SAXOFON("Saxofón", "Viento", 2500000),
    FLAUTA("Flauta", "Viento", 700000),
    TROMPETA("Trompeta", "Viento", 1500000),
    BATERIA("Batería", "Percusión", 1800000),
    CAJON("Cajón", "Percusión", 350000),
    TIMBAL("Timbal", "Percusión", 600000);

    private final String nombre;
    private final String familia;
    private final double precioBase;

    ModeloInstrumento(String nombre, String familia, double precioBase) {
        this.nombre = nombre;
        this.familia = familia;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
