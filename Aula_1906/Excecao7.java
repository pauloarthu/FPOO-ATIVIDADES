package Aula_1906;

import java.util.Scanner;

public class Excecao7 {

	public static void main(String[] args) {
		String cpf;
		Scanner entrada = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("digite o cpf");
				cpf = entrada.nextLine();
				if(!validarCPF(cpf)) {
					throw new IllegalArgumentException("CPF invalido" + "digite novamente");
				}
				break;
			}catch (IllegalArgumentException e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
		System.out.println("CPF valido" + cpf);
		entrada.close();
	}
		
		//criar validação para validar CPF
		public static boolean validarCPF(String cpf) { //boolean porque ou digitou certo ou digitou errado
			//ele determina caracters especiais ç ã
			cpf = cpf.replace("\\D", "");
			if(cpf.length() != 11) {
		    return false;
			}
			//validar se os digitos são iguais
			if (cpf.matches("\\d\\1(10)")) {
				return false;
			}
			return true;
		}
}