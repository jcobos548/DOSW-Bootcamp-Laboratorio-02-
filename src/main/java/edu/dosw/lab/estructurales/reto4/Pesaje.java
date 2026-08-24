package edu.dosw.lab.estructurales.reto4;

public class Pesaje {

    private final double cantidad;
    private final UnidadPeso unidad;

    public Pesaje(double cantidad, UnidadPeso unidad) {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public UnidadPeso getUnidad() {
        return unidad;
    }
}