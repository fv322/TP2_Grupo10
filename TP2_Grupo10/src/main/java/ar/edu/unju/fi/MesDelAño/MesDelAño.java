package ar.edu.unju.fi.MesDelAño;

import java.util.Scanner;

public class MesDelAño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean band=true;
		while (band ) {
			System.out.println("Ingrese numero: ");
			Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();
			
			if (numero > 0 && numero <= 12 ) {
				System.out.println("El numero ingresado corresponde a un mes del año");
			}else {
				System.out.println("No existe ese mes");
				band = false;
		}
		}
	
	}

}
