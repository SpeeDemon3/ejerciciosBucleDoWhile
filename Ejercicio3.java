package ejerciciosBucleDoWhile;
/**
 * 
 * @author speedemon
 *
 */
public class Ejercicio3 {

	/*
	 * EJERCICIO 3
	 * 
	 * Calcular la suma de los números pares comprendidos entre 10 y 50
	 * 
	 */
	
	public static void main(String[] args) {
		// Variable que utilizare para iniciar el recorrido por todos los numeros desde el 10 al 50
		int number = 10;
		// Variable donde guardare el resultado de sumar todos los numeros pares
		int result = 0;
		
		do {
			// Si number modulo 2 es igual a 0 significara que es un numero par
			if (number % 2 == 0) {
				// Lo sumo a la variable result
				result += number;
			}
			// Sumo 1 en cada iteracion a la variable number
			number ++;
			
		} while (number != 50); // Mientras number no sea igual a 50 el bucle seguira iterando
		
		// Imprimo el resultado
		System.out.println(result);
		
	}
	
}
