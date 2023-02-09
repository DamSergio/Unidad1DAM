package actividades;

public class ActividadesUT1 {

	public static void main(String[] args) {
		
		// EJERCICIO 1
		
		// Variable entera (numero entero)
		int x=1+2;
		System.out.println(x);
		// Creo e inicializo la variable hola
		String hola="";
		System.out.println(hola);
		// Cambio el valor de la variable hola
		hola="Hola, que tal estas?";
		System.out.println(hola);
		
		// EJERCICIO 2
		
		System.out.println("Hello"); // imprimo Hello
		int z=10, y=20; // declaro e inicializo las variable z, y
		System.out.println("z"); // imprimo z
		System.out.println(z); // imprimo la variable z
		System.out.println("Hello"+z); // imprimo Hello y le añado la variable z
		System.out.println(z+y); // imprimo la suma de z + y
		System.out.println(z+y+"Hello"); // imprimo la suma de z + y y le saludo en ingles
		
		// EJERCICIO 7
		
		int p=6+12/6*2-1;
		System.out.println(p);
		
		p=(6+12)/6*2-1;
		System.out.println(p);
		
		p=6+12/6*(2-1);
		System.out.println(p);
		
		p=6+12/(6*2)-1;
		System.out.println(p);
	}

}
