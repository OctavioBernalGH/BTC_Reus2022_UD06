package ejercicio_11;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 10/04/2022
		 * 
		 * @version 0.0.0.1
		 */

		/*
		 * 1. Crea un array de números con tamaño definido por teclado. 
		 * El array contendrá números aleatorios del 1 al 300 y mostrará
		 * aquellos que acaben en un dígito que nosotros indiquemos por teclado. 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = sc.nextInt();
		
		System.out.print("Filtra números que acaben en: ");
		int filtro = sc.nextInt();
		
		int [] arr = new int[tamaño];

		generarArr(arr,filtro);
	}
	
	public static void generarArr(int [] arr, int filtro) {

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()* 300);
			
			
			if(arr[i] % 10 == filtro) {
				System.out.println("Posición " + i + " valor " + arr[i]);
			}

		}
	}
}
