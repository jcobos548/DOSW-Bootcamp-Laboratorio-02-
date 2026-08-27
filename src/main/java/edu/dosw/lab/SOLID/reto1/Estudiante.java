package edu.dosw.lab.SOLID.reto1;

public class Estudiante implements TipoEspectador {
    @Override
    public double factorDescuento() {
        return 0.15;
    }

    @Override
    public String getNombre() {
        return "Estudiante";
    }
}
