package by.skriom;

import java.util.Scanner;

public class IMC {
	public static void main(String[] arg) {

		Scanner sca = new Scanner(System.in);

		int x;

		double y, r;

		y = sca.nextDouble();

		x = sca.nextInt();

		r = x / Math.pow(y, 2);

		System.out.printf("%.2f \n", r);

		if (r <= 18.49) {

			System.out.println("infra peso ");

		} else if (r <= 24.99) {

			System.out.println("peso normal ");

		} else if (r <= 29.99) {

			System.out.println("sobre peso ");

		} else if (r <= 34.99) {

			System.out.println("obesidad leve ");

		} else if (r <= 39.99) {

			System.out.println("obesidad media");

		} else if (r >= 40) {

			System.out.println("obesidad morbida");

		}

	}

}
