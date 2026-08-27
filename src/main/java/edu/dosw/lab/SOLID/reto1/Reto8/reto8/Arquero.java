package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

public class Arquero extends JugadorBase {

    public Arquero(String nombre, int edad, int dorsal, String pieHabil,
                    double peso, double altura, String estadoFisico, String categoria) {
        super(nombre, edad, dorsal, pieHabil, peso, altura, estadoFisico, categoria);
    }

    @Override
    public String getPosicion() {
        return "Arquero";
    }

    @Override
    public void patear() {
        System.out.println(getNombre() + " (Arquero) despeja el balón con fuerza desde el fondo.");
    }
}
