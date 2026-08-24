package edu.dosw.lab.estructurales.reto5;

public class EscapeDeportivo extends DecoradorMoto {

    public EscapeDeportivo(Moto moto) {
        super(moto);
    }

    @Override
    public String getDescripcion() {
        return moto.getDescripcion() + " + Escape deportivo";
    }

    @Override
    public double getPrecio() {
        return moto.getPrecio() + 1400000;
    }
}