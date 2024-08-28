package by.skriom;

import java.util.Scanner;

public class DiferenciaDeProductos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0, diferencia;
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		diferencia = (A * B - C * D);
		System.out.println(diferencia);

	}
}
