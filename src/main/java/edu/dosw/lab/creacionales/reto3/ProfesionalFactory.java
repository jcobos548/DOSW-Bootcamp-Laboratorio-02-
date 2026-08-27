package edu.dosw.lab.creacionales.reto3;

public class ProfesionalFactory implements GamaFactory {
    private static final double FACTOR = 3.0;
    private static final int AFINACION_HZ = 440;

    @Override
    public Instrumento crearInstrumento(ModeloInstrumento modelo) {
        return new Instrumento(modelo, getNombreGama(), AFINACION_HZ, modelo.getPrecioBase() * FACTOR);
    }

    @Override
    public String getNombreGama() {
        return "Profesional";
    }
}
