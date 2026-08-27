package edu.dosw.lab.SOLID.reto1;


public final class Boleta implements ItemOrden {
    private final String nombre;
    private final double precioUnitario;

    public Boleta(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
