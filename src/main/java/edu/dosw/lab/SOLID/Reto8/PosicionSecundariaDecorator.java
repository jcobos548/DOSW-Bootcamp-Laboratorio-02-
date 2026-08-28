package edu.dosw.lab.SOLID.Reto8;

public class PosicionSecundariaDecorator extends JugadorDecorator {
    private final String posicionSecundaria;

    public PosicionSecundariaDecorator(JugadorInfo jugador, String posicionSecundaria) {
        super(jugador);
        this.posicionSecundaria = posicionSecundaria;
    }

    public String getPosicionSecundaria() {
        return posicionSecundaria;
    }

    @Override
    public String descripcionCompleta() {
        return jugador.descripcionCompleta() + " | Pos. secundaria: " + posicionSecundaria;
    }
}
