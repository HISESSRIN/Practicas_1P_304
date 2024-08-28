package by.skriom;

import java.util.Scanner;

public class DFD_MayoríaDeEdad {
	public static void main(String[] arg) {
		Scanner sca = new Scanner(System.in);
		int edad = sca.nextInt();
		if (edad < 18) {
			System.out.println("MENOR DE EDAD");
		} else {
			System.out.println("MAYOR DE EDAD");
		}

	}
}
