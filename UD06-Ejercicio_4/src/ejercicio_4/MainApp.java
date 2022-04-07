package ejercicio_4;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * @author Octavio Bernal
		 * @version 0.0.0.1
		 * 
		 * Flujo del programa
		 * 1. Introducción número por teclado para calcular el factorial.
		 * 2. Método para crear el factorial del número recibido por parámetro.
		 */

		String factorial = JOptionPane.showInputDialog("Introduce un número para generar factorial");
		int factorialInt = Integer.parseInt(factorial);
		generarFactorial(factorialInt);
		
	}

	public static void generarFactorial (int numeroFactorial) {
		
		int numBase = 1;
		for (int i = 1; i <= numeroFactorial; i++)
		{
			numBase *= i;
		}
		
		JOptionPane.showMessageDialog(null, "El factorial es: " + numBase);
		}
}
	

