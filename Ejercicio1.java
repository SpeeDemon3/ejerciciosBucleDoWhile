package ejerciciosBucleDoWhile;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio1 {

	/*
	 * 
	 * EJERCICIO 1
	 * Resolver la potencia de 2 elevado a 8 con do-while
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Guardo el valor de la base
		int base = 2;
		
		// Guardo el valor del exponente
		int exponent = 8;
		
		// Variable que contendra el resultado
		int result = 2;
		
		do {
			// Multiplico el valor de result por la variable base
			result *= base;
			// Resto 1 a la variable exponent en cada iteracion
			exponent --;
			
		} while(exponent != 1); // Mientras exponent no sea igual a 1 el bucle seguira iterando
		
		// Imprimo el resultado
		System.out.println(result);
		
	}
}
