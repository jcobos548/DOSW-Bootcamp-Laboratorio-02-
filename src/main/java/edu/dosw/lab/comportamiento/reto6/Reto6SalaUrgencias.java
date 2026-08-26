package edu.dosw.lab.comportamiento.reto6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto6SalaUrgencias {

    public static void ejecutar() {

        Profesional enfermero = new Enfermero();
        Profesional medicoGeneral = new MedicoGeneral();
        Profesional especialista = new Especialista();

        enfermero.establecerSiguiente(medicoGeneral);
        medicoGeneral.establecerSiguiente(especialista);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sala de Urgencias");
        System.out.print("¿Cuántos pacientes? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        List<Paciente> pacientes = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {

            System.out.print("P" + (i + 1) + " síntoma: ");
            String sintoma = scanner.nextLine();

            System.out.print("Nivel (LEVE, MODERADO, GRAVE, CRITICO): ");
            Nivel nivel = Nivel.valueOf(scanner.nextLine().toUpperCase());

            System.out.print("Prioridad (BAJA, MEDIA, ALTA): ");
            Prioridad prioridad =
                    Prioridad.valueOf(scanner.nextLine().toUpperCase());

            pacientes.add(new Paciente(sintoma, nivel, prioridad));
        }

        List<Paciente> atendidos = new ArrayList<>();

        for (int i = 0; i < pacientes.size(); i++) {
            System.out.print("P" + (i + 1) + ": ");

            if (enfermero.atender(pacientes.get(i))) {
                atendidos.add(pacientes.get(i));
            }
        }

        long leves = atendidos.stream()
                .filter(p -> p.getNivel() == Nivel.LEVE)
                .count();

        long moderados = atendidos.stream()
                .filter(p -> p.getNivel() == Nivel.MODERADO)
                .count();

        long graves = atendidos.stream()
                .filter(p -> p.getNivel() == Nivel.GRAVE)
                .count();

        long remitidos = pacientes.stream()
                .filter(p -> !atendidos.contains(p))
                .count();

        double promedioPrioridad = atendidos.stream()
                .mapToInt(p -> p.getPrioridad().getValor())
                .average()
                .orElse(0.0);

        System.out.println();
        System.out.println("--- Estadísticas ---");
        System.out.println(
                "Atendidos - Leve: " + leves
                        + " Moderado: " + moderados
                        + " Grave: " + graves
        );
        System.out.println("Remitidos a otra institución: " + remitidos);
        System.out.println(
                "Promedio prioridad atendidos: " + promedioPrioridad
        );
    }

    public static void main(String[] args) {
        ejecutar();
    }
}