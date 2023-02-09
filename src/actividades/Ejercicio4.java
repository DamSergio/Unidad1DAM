package actividades;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Dame un numero");
		int n1=s.nextInt();
		
		System.out.println("Dame otro numero");
		int n2=s.nextInt();
		
		int suma=0;
		int resta=0;
		int mult=0;
		float div=0.0f;
		
		suma=n1+n2;
		resta=n1-n2;
		mult=n1*n2;
		div=(float)n1/n2;
		
		System.out.println("El primer numero es: "+n1);
		System.out.println("El segundo numero es: "+n2);
		
		System.out.println("la suma es: "+suma);
		System.out.println("la resta es: "+resta);
		System.out.println("la multiplicacion es: "+mult);
		System.out.println("la division es: "+div);
		
		s.close();
	}

}
