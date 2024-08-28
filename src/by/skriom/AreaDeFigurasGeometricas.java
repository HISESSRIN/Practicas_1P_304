package by.skriom;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaDeFigurasGeometricas {
	public static void main(String[] arg) {
		Scanner sca = new Scanner(System.in);
		double a, b, c, r;
		int n;
		DecimalFormat df = new DecimalFormat("#.000");
		/*
		 * System.out.println("que figura" ); System.out.println(" 0 trapecion ");
		 * System.out.println("1 triangulo "); System.out.println("2 cuadrado ");
		 * System.out.println("3 rectangulo "); System.out.println("4 circulo ");
		 */
		n = sca.nextInt();
		switch (n) {
		case 0:
			// System.out.println("base menor ");
			a = sca.nextDouble();
			// System.out.println("base mayor ");
			b = sca.nextDouble();
			// System.out.println("altura ");
			c = sca.nextDouble();
			r = ((b + a) * c);
			r = r / 2;
			System.out.println("Trapecio");
			System.out.println(df.format(r));

			break;
		case 1:
			// System.out.println("base ");
			a = sca.nextDouble();
			// System.out.println("altura ");
			b = sca.nextDouble();
			r = b * a;
			r = r / 2;
			System.out.println("Triangulo");
			System.out.println(df.format(r));

			break;
		case 2:
			// System.out.println("lado ");
			a = sca.nextDouble();
			r = a * a;
			System.out.println("Cuadrado");
			System.out.println(df.format(r));
			break;
		case 3:
			// System.out.println("base ");
			a = sca.nextDouble();
			// System.out.println("altura ");
			b = sca.nextDouble();
			r = b * a;
			System.out.println("Rectangulo");
			System.out.println(df.format(r));
			break;
		case 4:
			// System.out.println("radio ");
			a = sca.nextDouble();
			r = (a * a) * 3.1416;
			System.out.println("Circulo");
			System.out.println(df.format(r));
			break;
		default:
			System.out.println("Figura no valida");
		}
	}
}
