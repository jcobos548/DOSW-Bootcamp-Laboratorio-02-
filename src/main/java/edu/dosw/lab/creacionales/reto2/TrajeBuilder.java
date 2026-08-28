package edu.dosw.lab.creacionales.reto2;


public class TrajeBuilder {
    PiezaTraje tela;
    PiezaTraje saco;
    PiezaTraje pantalon;
    PiezaTraje chaleco;
    PiezaTraje forro;
    PiezaTraje bordado;

    public TrajeBuilder tela(String descripcion, double precio) {
        this.tela = new PiezaTraje("Tela", descripcion, precio);
        return this;
    }

    public TrajeBuilder saco(String descripcion, double precio) {
        this.saco = new PiezaTraje("Saco", descripcion, precio);
        return this;
    }

    public TrajeBuilder pantalon(String descripcion, double precio) {
        this.pantalon = new PiezaTraje("Pantalón", descripcion, precio);
        return this;
    }

    public TrajeBuilder chaleco(String descripcion, double precio) {
        this.chaleco = new PiezaTraje("Chaleco", descripcion, precio);
        return this;
    }

    public TrajeBuilder forro(String descripcion, double precio) {
        this.forro = new PiezaTraje("Forro", descripcion, precio);
        return this;
    }

    public TrajeBuilder bordado(String descripcion, double precio) {
        this.bordado = new PiezaTraje("Bordado", descripcion, precio);
        return this;
    }

    public Traje build() {
        if (tela == null || saco == null || pantalon == null) {
            throw new IllegalStateException(
                    "Tela, saco y pantalón son obligatorios para construir el traje.");
        }
        return new Traje(this);
    }
}
