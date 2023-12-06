package Aula_1206;

import javax.swing.JOptionPane;

public class paridade {

	public static void main(String[] args) {
		String numero;
		int n1;
		numero = JOptionPane.showInputDialog("coloque um numero");
		n1 = Integer.parseInt(numero);
		if (n1 <= -1) {
			System.out.println("numero negativo");
			JOptionPane.showMessageDialog(null, "numero negativo");
		}
		else if (n1 >= 1) {
			System.out.println("numero positivo");
			JOptionPane.showMessageDialog(null, "numero positivo");
		}
		else {
			System.out.println("zero");
			JOptionPane.showMessageDialog(null, "zero");
		}                                       
                                       /*mod = %
                                         and = &
                                         or = ||
                                         not = ~  */
	}

}                            
