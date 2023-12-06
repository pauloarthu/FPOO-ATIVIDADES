package Aula_1206;

import javax.swing.JOptionPane;

public class cardapio {

		public static void main(String[] args) {
			String numero;
			int n1;
			numero = JOptionPane.showInputDialog("coloque um numero");
			n1 = Integer.parseInt(numero);
			switch (n1) {
			case (1):
				System.out.println("lanche");
				JOptionPane.showMessageDialog(null, "lanche");
				break;
			case (2):
				System.out.println("bebida");
				JOptionPane.showMessageDialog(null, "bebida");
				break;
			case (3):
				System.out.println("sobremesa");
				JOptionPane.showMessageDialog(null, "sobremesa");
				break;
			default:
				System.out.println("nenhum pedido valido");
				JOptionPane.showMessageDialog(null, "nenhum pedido valido");
				break;
			}
		}
}
