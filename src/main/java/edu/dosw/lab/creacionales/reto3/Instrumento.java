package edu.dosw.lab.creacionales.reto3;

public final class Instrumento {
    private final ModeloInstrumento modelo;
    private final String gama;
    private final int afinacionHz;
    private final double precio;

    public Instrumento(ModeloInstrumento modelo, String gama, int afinacionHz, double precio) {
        this.modelo = modelo;
        this.gama = gama;
        this.afinacionHz = afinacionHz;
        this.precio = precio;
    }

    public ModeloInstrumento getModelo() {
        return modelo;
    }

    public String getGama() {
        return gama;
    }

    public int getAfinacionHz() {
        return afinacionHz;
    }

    public double getPrecio() {
        return precio;
    }
}
