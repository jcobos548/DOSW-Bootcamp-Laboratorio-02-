package edu.dosw.lab;

import edu.dosw.lab.estructurales.reto4.Reto4BalanzaTrucada;
import edu.dosw.lab.estructurales.reto5.Reto5MotoPersonalizada;
import edu.dosw.lab.comportamiento.reto6.Reto6SalaUrgencias;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println();
			System.out.println("===== LABORATORIO 02 =====");
			System.out.println("1. Reto 4 - Balanza Trucada");
			System.out.println("2. Reto 5 - Moto Personalizada");
			System.out.println("3. Reto 6 - Sala de Urgencias");
			System.out.println("0. Salir");
			System.out.print("Seleccione un reto: ");

			opcion = scanner.nextInt();
			System.out.println();

			switch (opcion) {
				case 1:
					Reto4BalanzaTrucada.ejecutar();
					break;
				case 2:
					Reto5MotoPersonalizada.ejecutar();
					break;
				case 3:
					Reto6SalaUrgencias.ejecutar();
					break;
				case 0:
					System.out.println("Fin del laboratorio.");
					break;
				default:
					System.out.println("Opción no válida.");
			}

		} while (opcion != 0);
	}
}