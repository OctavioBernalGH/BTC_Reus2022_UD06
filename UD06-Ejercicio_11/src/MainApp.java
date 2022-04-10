import java.util.Arrays;
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
		 * Flujo del programa
		 * 1. Crea dos arrays de números con la dimensión pasada por teclado.
		 * 2. Uno de ellos estará rellenado con números aleatorios y el otro apuntará al anterior
		 * reasignará los valores del segundo array con valores aleatorios.
		 */
		System.out.print("Introduce la dimensión: ");
		Scanner sc = new Scanner(System.in);
		int tamaño = sc.nextInt();
		int [] arr1 = new int[tamaño];
		
		rellenarArr(arr1,tamaño);

	}
	
	public static void rellenarArr(int[]arr1,int tamaño) {
		
		/* Primero relleno el array 1 mediante Math.random y lo casteo a integer. */
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (int)(Math.random()*10);
		}
		
		/* Mediante copyof de la clase Arrays clono arr1 en arr2 */
		int [] arr2 = Arrays.copyOf(arr1, arr1.length);

		/* Relleno el arr2 con otros valores*/
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = (int)(Math.random()*10);
		}
			
		multiplcarArr(arr1, arr2, tamaño);
		}
	
	public static void multiplcarArr(int [] arr1, int [] arr2, int tamaño) {
		int [] arrResult = new int [tamaño];
		/* Muestro el resultado de la multiplicación  de 2 arrays*/
		System.out.println("MULTIPLICO 2 ARRAYS DE ENTEROS");
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("Arr1-Posición " + i + " valor " + arr1[i]);
		}
		System.out.println("----- Fin array 1 -----");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("Arr2-Posición " + i + " valor " + arr2[i]);
		}
		System.out.println("----- Fin array 2 -----");
		for(int i=0; i<arr1.length; i++) {
			arrResult[i] = arr1[i] * arr2[i];
			System.out.println("ArrResultado-posición " + i + " valor " + arrResult[i]);
		}
		System.out.println("----- Fin arrResult -----");
		
	}

}
