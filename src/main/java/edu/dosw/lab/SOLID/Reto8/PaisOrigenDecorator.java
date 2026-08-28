package edu.dosw.lab.SOLID.Reto8;

public class PaisOrigenDecorator extends JugadorDecorator {
    private final String paisOrigen;

    public PaisOrigenDecorator(JugadorInfo jugador, String paisOrigen) {
        super(jugador);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String descripcionCompleta() {
        return jugador.descripcionCompleta() + " | País: " + paisOrigen;
    }
}
