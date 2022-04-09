package ejercicio_7;

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
		 * 1. Introducir por teclado la cantidad de euros. 
		 * 2. Elegir por teclado la moneda a convertir. 
		 * 3. Recibir por parámetro la cantidad y el tipo de moneda. 
		 * 4. Mostrar por pantalla la conversión sin devolver (void).
		 */
		
		double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a convertir "));
		String moneda = JOptionPane.showInputDialog("Introduzca:\n L si desea el cambio a libras. "
				+ "\n D si desea el cambio a dolares. " + "\n Y si desea el cambio a Yenes. ").toUpperCase();
		
		conversorDivisas(cantidad,moneda);
	}
	
	public static void conversorDivisas(double cantidad, String moneda) {
		
		double total = 0;
		
		if(moneda.charAt(0) == 'L') {
			total = cantidad * 0.86;
			JOptionPane.showMessageDialog(null, cantidad + "€ corresponde a " + total + " libras.");
		} else if(moneda.charAt(0) == 'D') {
			total = cantidad * 1.28611;
			JOptionPane.showMessageDialog(null, cantidad + "€ corresponde a " + total + " dolares.");
		} else if(moneda.charAt(0) == 'Y') {
			total = cantidad * 129.852;
			JOptionPane.showMessageDialog(null, cantidad + "€ corresponde a " + total + " yenes.");
		}
	}

}
