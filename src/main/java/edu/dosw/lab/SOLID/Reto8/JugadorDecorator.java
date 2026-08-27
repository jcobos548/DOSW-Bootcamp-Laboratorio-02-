package edu.dosw.lab.SOLID.Reto8;


public abstract class JugadorDecorator implements JugadorInfo {
    protected final JugadorInfo jugador;

    protected JugadorDecorator(JugadorInfo jugador) {
        this.jugador = jugador;
    }

    @Override
    public String getNombre() {
        return jugador.getNombre();
    }

    @Override
    public int getEdad() {
        return jugador.getEdad();
    }

    @Override
    public int getDorsal() {
        return jugador.getDorsal();
    }

    @Override
    public String getPosicion() {
        return jugador.getPosicion();
    }

    @Override
    public String getPieHabil() {
        return jugador.getPieHabil();
    }

    @Override
    public double getPeso() {
        return jugador.getPeso();
    }

    @Override
    public double getAltura() {
        return jugador.getAltura();
    }

    @Override
    public String getEstadoFisico() {
        return jugador.getEstadoFisico();
    }

    @Override
    public String getCategoria() {
        return jugador.getCategoria();
    }

    @Override
    public void patear() {
        jugador.patear();
    }

    @Override
    public void entrenar() {
        jugador.entrenar();
    }

    @Override
    public String descripcionCompleta() {
        return jugador.descripcionCompleta();
    }
}
