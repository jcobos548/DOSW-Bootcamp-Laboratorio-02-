package edu.dosw.lab.SOLID.Reto8;


public abstract class JugadorBase implements JugadorInfo {
    private final String nombre;
    private final int edad;
    private final int dorsal;
    private final String pieHabil;
    private double peso;
    private double altura;
    private String estadoFisico;
    private final String categoria;

    protected JugadorBase(String nombre, int edad, int dorsal, String pieHabil,
                           double peso, double altura, String estadoFisico, String categoria) {
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
        this.pieHabil = pieHabil;
        this.peso = peso;
        this.altura = altura;
        this.estadoFisico = estadoFisico;
        this.categoria = categoria;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public int getDorsal() {
        return dorsal;
    }

    @Override
    public String getPieHabil() {
        return pieHabil;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(String estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " está entrenando.");
    }

    // patear() y getPosicion() quedan abstractos: cada posición decide (polimorfismo)
    @Override
    public abstract String getPosicion();

    @Override
    public abstract void patear();

    @Override
    public String descripcionCompleta() {
        return getPosicion() + " " + nombre + " (#" + dorsal + ")";
    }
}
