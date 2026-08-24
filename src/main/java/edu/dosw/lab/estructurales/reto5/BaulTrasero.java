package edu.dosw.lab.estructurales.reto5;

public class BaulTrasero extends DecoradorMoto {

    public BaulTrasero(Moto moto) {
        super(moto);
    }

    @Override
    public String getDescripcion() {
        return moto.getDescripcion() + " + Baúl trasero";
    }

    @Override
    public double getPrecio() {
        return moto.getPrecio() + 550000;
    }
}