package edu.dosw.lab.SOLID.Reto8;


public interface JugadorInfo {
    String getNombre();
    int getEdad();
    int getDorsal();
    String getPosicion();
    String getPieHabil();
    double getPeso();
    double getAltura();
    String getEstadoFisico();
    String getCategoria();

    void patear();
    void entrenar();

    String descripcionCompleta();
}
