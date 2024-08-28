package by.skriom;

import java.util.Scanner;

public class DFD_AceptadoRechazado {
	public static void main(String[] arg) {
		Scanner sca = new Scanner(System.in);
		float edad;
		edad = sca.nextFloat();
		if (edad > 1.70) {
			System.out.print("Aceptado");
		} else {
			System.out.print("Rechazado");
		}

	}
}
