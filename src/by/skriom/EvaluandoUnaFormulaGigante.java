package by.skriom;

import java.util.Scanner;

public class EvaluandoUnaFormulaGigante {
	public static void main(String[] args) {
		Scanner tec=new Scanner (System.in);
		Float res3,res2,res,x,y,z;
		x=tec.nextFloat();
		y=tec.nextFloat();
		z=tec.nextFloat();
		
		res=(float) (((2*x+y)/z)*(Math.pow(y,3)-z));
		res2=(float) (((x+2*y+3*z)/(z-2*y-3*x))+Math.pow(x,2)+Math.pow(z,2));
		res3=res/res2;
		System.out.println(res3);

	}
}
