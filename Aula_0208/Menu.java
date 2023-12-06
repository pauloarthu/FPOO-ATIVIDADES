package Aula_0208;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		do {
			exibirMenu();    //metodo (ação)
		    opcao = entrada.nextInt();
			switch (opcao) {
			case 1: 
				System.out.println("opsao 1 selecionada");
				break;
			case 2: 
				System.out.println("opsao 2 selecionada");
				break;
			case 3: 
				System.out.println("opsao 3 selecionada");
				break;
				default:
					System.out.println("escolha as opsoes de 1 a 3");
					break;
			}
			System.out.println();
			
		}while(opcao != 0);
		
		
	} //fim mein

		public static void exibirMenu() {
			System.out.println("selecione uma opção");
			System.out.println("1 - opção 1");
			System.out.println("2 - opção 2");
			System.out.println("3 - opção 3");
			System.out.println("0 - sair");
		}
	
	
}// fim classe
