package edu.dosw.lab.estructurales.reto4;

public class AdaptadorBalanza implements ConvertidorPeso {

    private final Balanza balanza;

    public AdaptadorBalanza(Balanza balanza) {
        this.balanza = balanza;
    }

    @Override
    public double convertir(double cantidad, UnidadPeso origen, UnidadPeso destino) {
        double kilogramos = aKilogramos(cantidad, origen);
        return desdeKilogramos(kilogramos, destino);
    }

    private double aKilogramos(double cantidad, UnidadPeso unidad) {
        return switch (unidad) {
            case G -> cantidad / 1000.0;
            case KG -> cantidad;
            case LB -> cantidad / 2.2046;
            case ARROBA -> cantidad / 0.08;
        };
    }

    private double desdeKilogramos(double kilogramos, UnidadPeso unidad) {
        return switch (unidad) {
            case G -> kilogramos * 1000.0;
            case KG -> kilogramos;
            case LB -> kilogramos * 2.2046;
            case ARROBA -> kilogramos * 0.08;
        };
    }
}