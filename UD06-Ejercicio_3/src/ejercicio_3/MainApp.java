package ejercicio_3;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * @author Octavio Bernal
		 * 
		 * @fecha 07/04/2022
		 * 
		 * @version 0.0.0.1
		 * 
		 * Un número primo es un número natural que tiene solo dos divisores o factores:
		 * 1 y el mismo número. Es decir, es primo aquel número que se puede dividir por
		 * uno y por el mismo número.
		 */

		/*
		 * FLUJO DEL PROGRAMA 1. Crear un método que indique si un número obtenido por
		 * parámetro es primo o no. El número lo introduciremos por consola o por
		 * JOptionPane y se lo pasaremos por parámetro al método.
		 */

		String numeroPrimoStr = JOptionPane.showInputDialog("Introduce un número: ");
		int numeroPrimo = Integer.parseInt(numeroPrimoStr);

		detectorPrimos(numeroPrimo);
	}

	public static void detectorPrimos(int numeroPrimo) {

		if (((numeroPrimo % 2 == 0) && (numeroPrimo != 2)) || (numeroPrimo % 3 == 0) && (numeroPrimo != 3)
				|| (numeroPrimo == 1)) {
			JOptionPane.showMessageDialog(null, "El número " + numeroPrimo + " no es primo.");
		} else if ((numeroPrimo == 2) || (numeroPrimo == 3)) {
			JOptionPane.showMessageDialog(null, "El número " + numeroPrimo + " es primo.");
		} else {
			JOptionPane.showMessageDialog(null, "El número " + numeroPrimo + " es primo.");
		}

	}

}
