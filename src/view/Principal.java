package view;

import javax.swing.JOptionPane;

import controller.StringInvertida;

public class Principal {

	public static void main(String[] args) {
		StringInvertida si = new StringInvertida();
		String string = JOptionPane.showInputDialog(null, "Insira uma String");
		
		String resultado = si.inverter(string, string.length());
		System.out.println(resultado);
	}
	
}