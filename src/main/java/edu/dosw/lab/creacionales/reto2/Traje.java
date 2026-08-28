package edu.dosw.lab.creacionales.reto2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public final class Traje {
    private final PiezaTraje tela;
    private final PiezaTraje saco;
    private final PiezaTraje pantalon;
    private final PiezaTraje chaleco; // opcional, puede ser null
    private final PiezaTraje forro;   // opcional, puede ser null
    private final PiezaTraje bordado; // opcional, puede ser null

    Traje(TrajeBuilder builder) {
        this.tela = builder.tela;
        this.saco = builder.saco;
        this.pantalon = builder.pantalon;
        this.chaleco = builder.chaleco;
        this.forro = builder.forro;
        this.bordado = builder.bordado;
    }

    private List<PiezaTraje> piezas() {
        return Stream.of(tela, saco, pantalon, chaleco, forro, bordado)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    public double total() {
        return piezas().stream()
                .mapToDouble(PiezaTraje::getPrecio)
                .sum();
    }

    public void mostrar() {
        System.out.println("-------- Tu Traje --------");
        piezas().forEach(p -> System.out.printf("%-10s %-14s $%,.0f%n",
                p.getTipo() + ":", p.getDescripcion(), p.getPrecio()));
        System.out.printf("%nTotal: $%,.0f%n", total());
        System.out.println("¡Lo esperamos en la prueba!");
    }
}
