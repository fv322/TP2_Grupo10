package ar.edu.unju.fi.Bisiesto;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese año: ");
		
		Scanner entrada = new Scanner(System.in);
		int año = entrada.nextInt();
		
		if ( año % 4 == 0 && ( año % 100 != 0 || año % 400 == 0 ) ) {
			System.out.println("El año "+año+" es bisiesto");
		}else {
			System.out.println("El año "+año+" no es bisiesto");
		}
		

	}

}
