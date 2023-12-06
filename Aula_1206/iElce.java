package Aula_1206;

import javax.swing.JOptionPane;

public class iElce {

	public static void main(String[] args) {
		String anos;
		
		int idade;
		anos = JOptionPane.showInputDialog("coloque sua idade:");
		idade = Integer.parseInt(anos);
		if (idade <= 15) {
			System.out.println("nao podera votar");
			JOptionPane.showMessageDialog(null, "Não poderá votar");
		}
		else if (idade >= 16 && idade <= 18) {
			System.out.println("poderá votar");
			JOptionPane.showMessageDialog(null, "poderá votar");
		}
		else if (idade >= 19) {
			System.out.println("obrigação de votar");
			JOptionPane.showMessageDialog(null, "obrigação de votar");
		}
	}

}
