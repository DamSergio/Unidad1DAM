package actividades;

import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// System.out.println("Hola Mundo");
		// Entrada estandar=teclado
		Scanner teclado=new Scanner(System.in);
		// Pido el nombre por teclado
		System.out.println("Dime tu nombre");
		String nombre=teclado.next();
		System.out.println("Hola "+nombre);
		teclado.close();
	}

}
