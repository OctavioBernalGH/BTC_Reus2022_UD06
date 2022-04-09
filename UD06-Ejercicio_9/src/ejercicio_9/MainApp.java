package ejercicio_9;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 09/04/2022
		 * 
		 * @version 0.0.0.1
		 */

		/*
		 * Flujo del programa
		 * 1. Crear un array , le pasaremos por teclado el tamaño.
		 * 2. Crear un método para llenarlo con números aleatorios.
		 * 3. Crear otro método para recorrerlo y mostrar los valores.
		 * 4. Dentro del método anterior sumaremos los valores.
		 */

		crearArray();
	}
	
	public static void crearArray() {
		System.out.print("Introduce el tamaño del array: ");
		Scanner sc = new Scanner(System.in);
		int tamaño = sc.nextInt();
		int [] basicArray = new int [tamaño];
		
		for(int i=0; i<basicArray.length;i++) {
			basicArray[i]= (int) (Math.random()*10);
		}
		
		recorrerArray(basicArray);
	}
	
	public static void recorrerArray(int[]arrNumerico) {
		int totalizador = 0;
		for(int i=0; i<arrNumerico.length; i++) {
			System.out.println("Posición " + i + " valor " + arrNumerico[i]);
			totalizador += arrNumerico[i];
		}
		System.out.println("La suma de todos es: " + totalizador);
	}
}
