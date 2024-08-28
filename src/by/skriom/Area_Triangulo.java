package by.skriom;

import java.util.Scanner;

public class Area_Triangulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double area, base, altura;
		base = tec.nextDouble();
		altura = tec.nextDouble();
		area = (base * altura) / 2;
		System.out.printf("%.3f", area);

	}
}
