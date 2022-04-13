package ar.edu.unju.fi.SwitchMesDelAño;

import java.util.Scanner;

public class SwitchMesDelAño {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		boolean band = true;
		
		while (band) {
			System.out.println("Ingrese numero: ");
			Scanner entrada = new Scanner(System.in);
			int numero = entrada.nextInt();
		switch (numero) {
			case 1:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 2:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 3:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 4:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 5:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 6:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 7:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 8:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 9:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 10:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 11:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			case 12:System.out.println("El numero ingresado corresponde a un mes del año");
				break;
			default:System.out.println("No existe ese mes");
				band=false;
				break;
		}
		}
	}

}
