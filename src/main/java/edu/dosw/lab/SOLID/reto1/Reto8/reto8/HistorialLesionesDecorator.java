package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

import java.util.ArrayList;
import java.util.List;

public class HistorialLesionesDecorator extends JugadorDecorator {
    private final List<String> lesiones = new ArrayList<>();

    public HistorialLesionesDecorator(JugadorInfo jugador, List<String> lesiones) {
        super(jugador);
        this.lesiones.addAll(lesiones);
    }

    public List<String> getLesiones() {
        return lesiones;
    }

    @Override
    public String descripcionCompleta() {
        return jugador.descripcionCompleta() + " | Lesiones registradas: " + lesiones.size();
    }
}
