package by.skriom;

import java.util.Scanner;

public class Adulto {
	public static void main(String[] arg) {
		Scanner sca = new Scanner(System.in);
		int edad = sca.nextInt();
		if (edad < 18) {
			System.out.println("joven");
		} else {
			System.out.println("adulto");
		}

	}
}
