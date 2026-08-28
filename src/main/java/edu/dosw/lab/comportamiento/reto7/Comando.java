package edu.dosw.lab.comportamiento.reto7;

public interface Comando {

    void ejecutar();

    void deshacer();

    String obtenerDescripcion();

    String obtenerOperador();

    String obtenerDescripcionDeshacer();
}