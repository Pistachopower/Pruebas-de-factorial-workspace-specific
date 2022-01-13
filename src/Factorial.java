import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]) {
		
		/**
		 * https://www.youtube.com/watch?v=ZYHrvgTOB4Q por métodos
		 * https://www.youtube.com/watch?v=lRESFiclLxk en una misma clase se hace la funcion 
		 * 
		 */
		
		
		Scanner sc= new Scanner(System.in);
		
		//pide entrada
		System.out.println("Introduzca el numero: ");
		int num= sc.nextInt();
		
		//mostramos el resultado
		System.out.println("El factorial de: " + num+ " es: "+ factorial (num));
		
	}
	

	/*
	 * Se crea la función 
	 * Se define double porque es el tipo de datos mas grande
	 * en java. No se usa long porque no funciona de la manera 
	 * que se espera. 
	 */
	public static double factorial(int n) {
	double aux= 1;
	
	for (int i= 2; i<= n; i++ ) {
		aux *=i;
	}
	return aux;
	
	}

	
	

}
