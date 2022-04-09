package ejercicio_5;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 07/04/2022
		 * 
		 * @version 0.0.0.2
		 * 
		 * Flujo del programa 1. Crear un método que convierta un número base decimal a
		 * binario. Le pasaremos una variable entera como parámetro y nos devolverá un
		 * String.
		 * 
		 */

		/*
		 * Mediante un selector podremos realizar la conversión mediante una función
		 * corta o mediante bucles for.
		 */

		String selector = JOptionPane.showInputDialog("Introduce A para conversión mediante método .toBinary "
				+ "\nIntroduce B para conversión mediante bucles").toUpperCase();

		/* Introducción número base decimal */
		String datoDecimalStr = JOptionPane.showInputDialog("Introduce un número base decimal ");
		int datoDecimalInt = Integer.parseInt(datoDecimalStr);

		/* Aplicación selector */
		if (selector.charAt(0) == 'A') {
			devolverBinario(datoDecimalInt);
		} else if (selector.charAt(0) == 'B') {
			devolverBinarioFor(datoDecimalInt);
		}

	}

	/* Conversión mediante función corta */
	public static void devolverBinario(int datoDecimalInt) {

		String binario = Integer.toBinaryString(datoDecimalInt);
		JOptionPane.showMessageDialog(null, binario);

	}

	/* Conversión mediante bucle for */
	public static void devolverBinarioFor(int datoDecimalIntFor) {

		String numeroBinario = "";

		/* String sin invertir */
		while (datoDecimalIntFor > 0) {
			numeroBinario += datoDecimalIntFor % 2;
			datoDecimalIntFor = datoDecimalIntFor / 2;
		}

		/* String correcto */
		String variableInvertida = "";
		for (int i = numeroBinario.length() - 1; i >= 0; i--) {
			variableInvertida += numeroBinario.charAt(i);
		}
		JOptionPane.showMessageDialog(null, variableInvertida);
	}
}
