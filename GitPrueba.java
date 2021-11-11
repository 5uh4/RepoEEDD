package gitIntento;

import java.util.Scanner;

public class GitPrueba {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Dime dos numeros enteros para la suma: ");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int resultadoSuma = (num1 + num2);
		System.out.println("El resultado de la suma es: " + resultadoSuma);

		boolean esPrimo;
		for (int i = 2; i < resultadoSuma / 2; i++) {
			if ((resultadoSuma % i) == 0) {
				esPrimo = false;
				System.out.println("El numero no es primo");
			} else {
				esPrimo = true; 
				System.out.println("El número es primo");
			}
		}

		s.close();
	}

}
