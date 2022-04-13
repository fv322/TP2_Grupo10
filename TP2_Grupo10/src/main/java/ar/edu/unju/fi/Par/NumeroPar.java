package ar.edu.unju.fi.Par;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese numero: ");
			Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();
			if (numero % 2 == 0) {
				System.out.println("El numero " + numero + " es par");
			} else {
				System.out.println("El numero " + numero + " no es par");
			}
		}
	}

}
