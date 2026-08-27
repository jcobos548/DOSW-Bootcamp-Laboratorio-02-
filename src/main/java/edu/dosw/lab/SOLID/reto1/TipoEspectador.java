package edu.dosw.lab.SOLID.reto1;


public interface TipoEspectador {
    double factorDescuento(); // 0.0 = sin descuento, 0.15 = 15%, etc.
    String getNombre();
}
