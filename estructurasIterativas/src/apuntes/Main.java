package apuntes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// BUCLE ITERATIVO WHILE

		System.out.println("Inicio del Programa");
		int numero = 10;

		while (numero <= 15) {
			System.out.println(numero);
			numero++;
		}

		System.out.println("Fin del Programa");

		//

		// BUCLE ITERATIVO DO WHILE

		System.out.println("Inicio del Programa");
		int numero2 = 100;

		do {
			System.out.println(numero2);
			numero2++;
		} while (numero2 <= 110);

		System.out.println("Fin del Programa");

		//

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo del alumno: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido del alumno: ");
		String apellido = scanner.next();
		System.out.println("Ingrese el nombre del alumno: ");
		String nombre = scanner.next();

		Alumno alumno = new Alumno(legajo, apellido, nombre);

		System.out.println(alumno.toString());

		int numMaterias = 1;

		while (numMaterias <= 4) {
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();

			Materia materia = new Materia(codigoMateria, nombreMateria);
			System.out.println(materia.toString());

			System.out.println("Ingrese el codigo de registro de la nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float notaFinal = scanner.nextFloat();

			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, notaFinal);

			System.out.println(registroNota.toString());

		}
	}

}
