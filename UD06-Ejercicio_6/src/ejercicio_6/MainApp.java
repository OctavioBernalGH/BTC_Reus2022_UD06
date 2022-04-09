package ejercicio_6;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 07/04/2022
		 * 
		 * @version 0.0.0.1
		 */
		
		/*
		 * Flujo del programa
		 * 1. Introducir un número por teclado.
		 * 2. Mediante un método contaremos las cifras que tiene ese número
		 */
		
		int numeroIntroducido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		int numeroCifras = contadorCifras(numeroIntroducido);
		
		JOptionPane.showMessageDialog(null, "El número " + numeroIntroducido + " tiene " + numeroCifras + " cifras.");
	}
	
	public static int contadorCifras(int numeroIntroducido) {
		
		int contador = 0;
		
		while(numeroIntroducido != 0) {
			numeroIntroducido = numeroIntroducido / 10;
			contador++;
		}
		return contador;
	}

}
