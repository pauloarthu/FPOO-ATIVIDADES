package Aula_1206;

import javax.swing.JOptionPane;

public interface Soma { //nome da classe é Soma
	public static void main(String []args) {
		String primeiroNumero;
		String segundoNumero;
		
		int numero1;
		int numero2;
		int soma;
		
		primeiroNumero = JOptionPane.showInputDialog("entre com o 1° numero");
		segundoNumero = JOptionPane.showInputDialog("entre com o 2° numero");
		//conversão de tipos (parse)
		numero1 = Integer.parseInt(primeiroNumero);
		numero2 = Integer.parseInt(segundoNumero);
		
		soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A some é" + soma, "Resutado da soma" , JOptionPane.PLAIN_MESSAGE);
		System.out.println("a soma é" + soma);
	}
}