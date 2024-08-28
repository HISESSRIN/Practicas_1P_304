package by.skriom;

import java.util.Scanner;

public class Pitagoras {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A, B, C;
		A = teclado.nextDouble();
		System.out.print("\n");
		B = teclado.nextDouble();
		C = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));
		System.out.printf("%.3f", C);
	}
}
