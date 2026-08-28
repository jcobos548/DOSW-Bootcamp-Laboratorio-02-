package edu.dosw.lab.SOLID.reto1;


public class LineaOrden {
    private final ItemOrden item;
    private int cantidad;

    public LineaOrden(ItemOrden item, int cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }

    public ItemOrden getItem() {
        return item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        // Polimorfismo: no importa si item es Boleta o ProductoConfiteria,
        // ambos responden a getPrecioUnitario().
        return item.getPrecioUnitario() * cantidad;
    }
}
