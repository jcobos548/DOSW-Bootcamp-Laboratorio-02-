package edu.dosw.lab.SOLID.reto1;

public class TerceraEdad implements TipoEspectador {
    @Override
    public double factorDescuento() {
        return 0.25;
    }

    @Override
    public String getNombre() {
        return "Tercera edad";
    }
}
