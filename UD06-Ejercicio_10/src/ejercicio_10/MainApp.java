package ejercicio_10;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
		 * 2. Generar números aleatorios primos y almacenarlos en el array.
		 * 3. Crear un método que comprobará si el número es primo o no.
		 */

		creaArray();
	}
	
	public static void creaArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el tamaño del array: ");
		int tamaño = sc.nextInt();
		int [] arrNumerico = new int [tamaño];
		int numeroAleatorio;
		int cantidad = 0;
		
		while(cantidad < arrNumerico.length) {
			
			numeroAleatorio = (int) (Math.random()*100);
			
			if(detectorPrimos(numeroAleatorio) == true) {
				arrNumerico[cantidad] = numeroAleatorio;
				System.out.println("Numero: "+ arrNumerico[cantidad]);
				cantidad++;
			}
		}
	}
	
	public static boolean detectorPrimos(int numeroPrimo) {
		int salida = 0;
		boolean primo = true;
		
		while(salida < 1) {
			
		if (((numeroPrimo % 2 == 0) && (numeroPrimo != 2)) || (numeroPrimo % 3 == 0) && (numeroPrimo != 3)
				|| (numeroPrimo == 1)) {
			primo = false;
			salida = 2;
			break;
		} else if ((numeroPrimo == 2) || (numeroPrimo == 3)) {
			primo = true;
			salida = 2;
		} else {
			salida = 2;
			primo = true;
		}
		}
		
		return primo;
	}
}
