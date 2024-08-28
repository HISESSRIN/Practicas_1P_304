package by.skriom;

import java.util.Scanner;
import java.util.Iterator;

public class CalculandoLasTablas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N, A;
		N = teclado.nextInt();
		int x = 0;
		while (x <= 10) {
			A = x * N;
			System.out.println(A);
			x++;
		}
	}
}
