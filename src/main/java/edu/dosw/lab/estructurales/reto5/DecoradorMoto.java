package edu.dosw.lab.estructurales.reto5;

public abstract class DecoradorMoto implements Moto {

    protected final Moto moto;

    protected DecoradorMoto(Moto moto) {
        this.moto = moto;
    }
}
