package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

public class Defensa extends JugadorBase {

    public Defensa(String nombre, int edad, int dorsal, String pieHabil,
                    double peso, double altura, String estadoFisico, String categoria) {
        super(nombre, edad, dorsal, pieHabil, peso, altura, estadoFisico, categoria);
    }

    @Override
    public String getPosicion() {
        return "Defensa";
    }

    @Override
    public void patear() {
        System.out.println(getNombre() + " (Defensa) despeja el balón lejos del área.");
    }
}
