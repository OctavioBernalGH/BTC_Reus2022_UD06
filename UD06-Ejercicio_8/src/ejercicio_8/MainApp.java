package ejercicio_8;

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
		 * 1. Crear un array de 10 posiciones.
		 * 2. Crear un método para llenarlo por teclado.
		 * 3. Crear otro método para recorrerlo.
		 * 4. Mostrar por consola "key-value".
		 */
		
		rellenarArray();

	}
	
	public static void rellenarArray() {
		int [] arrNumerico = new int [10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<arrNumerico.length; i++) {
			System.out.print("\nIntroduce número para posición " + i + " :");
			arrNumerico[i] = sc.nextInt();
		}
		
		recorrerArray(arrNumerico);
	}
	
	public static void recorrerArray(int [] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("Posición " + i + " valor " +arr[i]);
		}
	}

}
