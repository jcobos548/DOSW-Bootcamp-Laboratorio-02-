package edu.dosw.lab.creacionales.reto2;


public final class PiezaTraje {
    private final String tipo;         // "Tela", "Saco", "Chaleco"...
    private final String descripcion;  // "Lana italiana", "Cruzado"...
    private final double precio;

    public PiezaTraje(String tipo, String descripcion, double precio) {
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
