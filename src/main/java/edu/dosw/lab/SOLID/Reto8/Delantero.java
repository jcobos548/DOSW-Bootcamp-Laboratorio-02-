package edu.dosw.lab.SOLID.Reto8;

public class Delantero extends JugadorBase {

    public Delantero(String nombre, int edad, int dorsal, String pieHabil,
                      double peso, double altura, String estadoFisico, String categoria) {
        super(nombre, edad, dorsal, pieHabil, peso, altura, estadoFisico, categoria);
    }

    @Override
    public String getPosicion() {
        return "Delantero";
    }

    @Override
    public void patear() {
        System.out.println(getNombre() + " (Delantero) dispara a gol con potencia.");
    }
}
