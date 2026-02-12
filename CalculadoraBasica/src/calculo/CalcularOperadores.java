package calculo;

import javax.swing.JOptionPane;

public class CalcularOperadores extends Calculadora {
	public CalcularOperadores(){
		
	}
	public String calcular(String expresion) {
	    try {
	        if (expresion.contains("+")) {
	            String[] partes = expresion.split("\\+"); // El \\ es necesario para el +
	            return String.valueOf(Double.parseDouble(partes[0]) + Double.parseDouble(partes[1]));
	        } else if (expresion.contains("-")) {
	            String[] partes = expresion.split("-");
	            return String.valueOf(Double.parseDouble(partes[0]) - Double.parseDouble(partes[1]));
	        } else if (expresion.contains("*")) {
	            String[] partes = expresion.split("\\*");
	            return String.valueOf(Double.parseDouble(partes[0]) * Double.parseDouble(partes[1]));
	        } else if (expresion.contains("/")) {
	            String[] partes = expresion.split("/");
	            return String.valueOf(Double.parseDouble(partes[0]) / Double.parseDouble(partes[1]));
	        }
	    } catch (Exception e) {
	       JOptionPane.showMessageDialog(ventana, "Ingrese valores correctos","!!!!!",JOptionPane.WARNING_MESSAGE);

	    }
	    return expresion;
	}
}
