package edu.dosw.lab.estructurales.reto5;

public class PinturaMateNegro extends DecoradorMoto {

    public PinturaMateNegro(Moto moto) {
        super(moto);
    }

    @Override
    public String getDescripcion() {
        return moto.getDescripcion() + " + Pintura mate negro";
    }

    @Override
    public double getPrecio() {
        return moto.getPrecio() + 900000;
    }
}