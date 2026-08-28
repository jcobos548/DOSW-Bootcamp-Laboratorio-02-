package edu.dosw.lab.comportamiento.reto7;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    private final List<Comando> comandos;
    private final List<Boolean> deshechos;

    public Historial() {
        comandos = new ArrayList<>();
        deshechos = new ArrayList<>();
    }

    public void registrar(Comando comando) {
        comandos.add(comando);
        deshechos.add(false);
    }

    public void deshacer(int numeroAccion) {

        int indice = numeroAccion - 1;

        if (indice < 0 || indice >= comandos.size()) {
            return;
        }

        if (deshechos.get(indice)) {
            return;
        }

        comandos.get(indice).deshacer();
        deshechos.set(indice, true);
    }

    public void mostrar() {

        System.out.println("--- Historial ---");

        for (int i = 0; i < comandos.size(); i++) {

            Comando comando = comandos.get(i);

            String descripcion = comando.obtenerDescripcion();

            if (deshechos.get(i)) {
                descripcion = descripcion.split(" ")[0];
                System.out.println(
                        "#" + (i + 1)
                                + " [DESHECHO] "
                                + descripcion
                                + " - "
                                + comando.obtenerOperador()
                );
            } else {
                System.out.println(
                        "#" + (i + 1)
                                + " "
                                + descripcion
                                + " - "
                                + comando.obtenerOperador()
                );
            }
        }
    }
}