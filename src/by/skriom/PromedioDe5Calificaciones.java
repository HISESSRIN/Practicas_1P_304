package by.skriom;

import java.util.Scanner;

public class PromedioDe5Calificaciones {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A = 0, B = 0, C = 0, D = 0, E = 0, promedio;
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		D = teclado.nextDouble();
		E = teclado.nextDouble();
		promedio = (A + B + C + D + E) / 5;
		System.out.println(promedio);
	}
}
