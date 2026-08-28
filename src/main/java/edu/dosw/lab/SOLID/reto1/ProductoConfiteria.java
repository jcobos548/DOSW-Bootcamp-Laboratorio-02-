package edu.dosw.lab.SOLID.reto1;


public final class ProductoConfiteria implements ItemOrden {
    private final String nombre;
    private final double precioUnitario;

    public ProductoConfiteria(String nombre, double precioUnitario) {
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
