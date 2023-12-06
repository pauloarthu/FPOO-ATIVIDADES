package Aula_0208;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Atividade_paulo_arthur_Q5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		double resutado;
		do {
			exibirMenu();    //metodo (ação)
		    opcao = entrada.nextInt();
			switch (opcao) {
			case 1: 
				System.out.println("acao");
				System.out.println("opsao 1 selecionada");
				double num1 = entrada.nextDouble();
				System.out.println("digite o 2° numero: ");
				double num2 = entrada.nextDouble();
				resutado = num1 + num2; 
				System.out.println("resultado =" + resutado);
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
		
		
		
	}
	
	
	public static void exibirMenu() {
		System.out.println("selecione uma opção");
		System.out.println("1 - opção 1");
		System.out.println("2 - opção 2");
		System.out.println("3 - opção 3");
		System.out.println("0 - sair");
	}

}
