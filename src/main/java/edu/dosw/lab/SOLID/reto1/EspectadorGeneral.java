package edu.dosw.lab.SOLID.reto1;

public class EspectadorGeneral implements TipoEspectador {
    @Override
    public double factorDescuento() {
        return 0.0;
    }

    @Override
    public String getNombre() {
        return "General";
    }
}
