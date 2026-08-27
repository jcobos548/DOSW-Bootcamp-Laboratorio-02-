package edu.dosw.lab.SOLID.reto1.Reto8.reto8;

public class ValorMercadoDecorator extends JugadorDecorator {
    private final double valorMercado;

    public ValorMercadoDecorator(JugadorInfo jugador, double valorMercado) {
        super(jugador);
        this.valorMercado = valorMercado;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    @Override
    public String descripcionCompleta() {
        return jugador.descripcionCompleta() + String.format(" | Valor: $%,.0f", valorMercado);
    }
}
