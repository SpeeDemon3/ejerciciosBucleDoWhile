package ejerciciosBucleDoWhile;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio2 {

	/*
	 * EJERCICIO 2
	 * 
	 * Resolver la serie de Fibonacci con do-while
	 */
	
	public static void main(String[] args) {

		// Variable origen donde empezara la sucesion
		int first = 0;
		// Variable para continuar la sucesion
		int second = 1;
		
		// Variable para controlar las iteraciones que realizara el bucle
		int count = 0;
		
		System.out.println("Sucesión de Fibonacci:");
		
		do {
			// La variable next sera igual a la suma de las 2 variables principales
			int next = first + second;
			
			// Imprimo el valor de next
			System.out.println(next);
			
			// La variable first sera igual a la variable second
			first = second;
			
			// La variable second sera igual a la variable next
			second = next;
			
			// Sumo una a la variable count en cada iteracion
			count ++;
			
		} while (count != 15); // Mientras la variable contador no sea igual a 15 el bucle seguira iterando
		
	}

}
