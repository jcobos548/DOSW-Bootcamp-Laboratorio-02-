package edu.dosw.lab.estructurales.reto4;

public class PesajeSolicitud {

    private final Pesaje pesaje;
    private final UnidadPeso destino;

    public PesajeSolicitud(Pesaje pesaje, UnidadPeso destino) {
        this.pesaje = pesaje;
        this.destino = destino;
    }

    public Pesaje getPesaje() {
        return pesaje;
    }

    public UnidadPeso getDestino() {
        return destino;
    }
}