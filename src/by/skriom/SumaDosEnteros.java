package by.skriom;

import java.util.Scanner;

public class SumaDosEnteros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, suma;
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();
		suma = num1 + num2;
		System.out.println(suma);
	}
}
