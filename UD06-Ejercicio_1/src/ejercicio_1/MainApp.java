package ejercicio_1;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {
		
		/* Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo.
		 * Pediremos que figura queremos calcular, y según lo introducido los valores
		 * necesarios para su cálculo. Crea un método para cada figura. Este devolverá
		 * un número real. Muestra el resultado por pantalla.
		 */
	
	/* Mediante toUpperCase paso el contenido a Mayusculas*/
	String selectorFigura = seleccionFigura().toUpperCase();

	/* Selecciono el primer caracter como filtro para evitar algún error*/
	char caracter = selectorFigura.charAt(0);
	
	/* Comparo el contenido de la variable caracter con la letra correspondiente */
	if (caracter == ('C')) {
		double resultado = calculoCirculo();
		JOptionPane.showMessageDialog(null, "El área del circulo es: " + resultado);
	} else if(caracter == ('Q')) {
		double resultado = calculoCuadrado();
		JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + resultado);
	} else if(caracter == ('T')) {
		double resultado = calculoTriangulo();
		JOptionPane.showMessageDialog(null, "El área del triangulo es: " + resultado);
	} else {
		JOptionPane.showMessageDialog(null, "Error en la introducción de datos");
	}
	}
	
	/*
	 * 
	 *  MÉTODOS
	 * 
	 */
	
	/* Selector de figura con JOptionPane */
	public static String seleccionFigura() {
		String seleccion = JOptionPane.showInputDialog("Figura a calcular área, introduce: \nC = Circulo\nQ = Cuadrado \nT = Triangulo");
		return seleccion;
	}
	
	/* Cálculo del área del circulo */
	public static double calculoCirculo() {
		String radioStr = JOptionPane.showInputDialog("Introduce radio");
		double resultado = (Math.pow(Double.parseDouble(radioStr), 2)) * 3.1415;
		return resultado;
	}
	
	/* Cálculo del área del cuadrado */
	public static double calculoCuadrado() {
		String ladoStr = JOptionPane.showInputDialog("Introduce longitud del lado");
		double resultado = (Double.parseDouble(ladoStr) * Double.parseDouble(ladoStr));
		return resultado;
	}
	
	/* Cálculo del área del triangulo */
	public static double calculoTriangulo() {
		String baseStr = JOptionPane.showInputDialog("Introduce la base");
		String alturaStr = JOptionPane.showInputDialog("Introduce la altura");
		double resultado = (Double.parseDouble(baseStr)*Double.parseDouble(alturaStr) / (2));
		return resultado;
	}

}
