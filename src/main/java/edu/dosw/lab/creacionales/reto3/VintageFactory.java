package edu.dosw.lab.creacionales.reto3;

public class VintageFactory implements GamaFactory {
    private static final double FACTOR = 5.0;
    private static final int AFINACION_HZ = 442;

    @Override
    public Instrumento crearInstrumento(ModeloInstrumento modelo) {
        return new Instrumento(modelo, getNombreGama(), AFINACION_HZ, modelo.getPrecioBase() * FACTOR);
    }

    @Override
    public String getNombreGama() {
        return "Vintage";
    }
}
