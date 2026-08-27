package edu.dosw.lab;

import edu.dosw.lab.SOLID.reto1.Reto1BoleteriaAstor;
import edu.dosw.lab.creacionales.reto2.Reto2SastreMedida;
import edu.dosw.lab.creacionales.reto3.Reto3FabricaInstrumentos;
import edu.dosw.lab.estructurales.reto4.Reto4BalanzaTrucada;
import edu.dosw.lab.estructurales.reto5.Reto5MotoPersonalizada;
import edu.dosw.lab.comportamiento.reto6.Reto6SalaUrgencias;
import edu.dosw.lab.comportamiento.reto7.Reto7RoverExplorador;
import edu.dosw.lab.SOLID.reto8.Reto8AcademiaFutbol;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println();
			System.out.println("===== LABORATORIO 02 =====");
			System.out.println("1. Reto 1 - Boletería Cine Astor");
			System.out.println("2. Reto 2 - Sastre a la Medida");
			System.out.println("3. Reto 3 - Fábrica de Instrumentos");
			System.out.println("4. Reto 4 - Balanza Trucada");
			System.out.println("5. Reto 5 - Moto Personalizada");
			System.out.println("6. Reto 6 - Sala de Urgencias");
			System.out.println("7. Reto 7 - Rover Explorador de Marte");
			System.out.println("8. Reto 8 - Academia de Fútbol");
			System.out.println("0. Salir");
			System.out.print("Seleccione un reto: ");

			opcion = scanner.nextInt();
			System.out.println();

			switch (opcion) {
				case 1:
					Reto1BoleteriaAstor.ejecutar();
					break;
				case 2:
					Reto2SastreMedida.ejecutar();
					break;
				case 3:
					Reto3FabricaInstrumentos.ejecutar();
					break;
				case 4:
					Reto4BalanzaTrucada.ejecutar();
					break;
				case 5:
					Reto5MotoPersonalizada.ejecutar();
					break;
				case 6:
					Reto6SalaUrgencias.ejecutar();
					break;
				case 7:
					Reto7RoverExplorador.ejecutar();
					break;
				case 8:
					Reto8AcademiaFutbol.ejecutar();
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