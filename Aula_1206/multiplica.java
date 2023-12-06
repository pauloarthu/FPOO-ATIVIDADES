package Aula_1206;

import javax.swing.JOptionPane;

public class multiplica {
	public static void main(String []args) {
		String primeiroNumero;
		String segundoNumero;
		
		float numero1;
		float numero2;
		float mult;
		
		primeiroNumero = JOptionPane.showInputDialog("entre com o 1° numero");
		segundoNumero = JOptionPane.showInputDialog("entre com o 2° numero");
		//conversão de tipos (parse)
		numero1 = Float.parseFloat(primeiroNumero);
		numero2 = Float.parseFloat(segundoNumero);
		
		mult = numero1 * numero2;
		
		JOptionPane.showMessageDialog(null, "A multiplicacao é" + mult, "Resutado da multiplicacao" , JOptionPane.PLAIN_MESSAGE);
		System.out.println("a multiplicacao é" + mult);
	}
}

