package edu.dosw.lab.estructurales.reto4;

public class Balanza {

    public Pesaje pesar(double cantidad, UnidadPeso unidad) {
        return new Pesaje(cantidad, unidad);
    }
}