package atividades_Paulo_Arthur;

import java.util.Scanner;

public class TesteBrinVisi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-------MENU-------");
		Brinquedo b1 = new Brinquedo();
		Visitante v1 = new Visitante();
		int opicao;
		do {
			opicao = entrada.nextInt();
			switch (opicao) {
			case 1:
				
				System.out.println("digite nome do usuario");
				v1.trocarNome = entrada.next();
				System.out.println("digite a idade do usuario");
				v1.trocarIdade = entrada.nextInt();
				System.out.println("digite a altura do usuario");
				v1.trocarAltura = entrada.nextDouble();
				if (v1.trocarIdade < 10 || v1.trocarAltura < 1.50 || v1.trocarAltura > 1.90) {
					System.out.println("nao pode brincar nesse brinquedo");
				} else {
					System.out.println("pode brincar");
				}
				break;
				
			case 2: 
				
				System.out.println("digite nome do usuario");
				v1.trocarNome = entrada.next();
				System.out.println("digite a idade do usuario");
				v1.trocarIdade = entrada.nextInt();
				System.out.println("digite a altura do usuario");
				v1.trocarAltura = entrada.nextDouble();
				if (v1.trocarIdade < 6 || v1.trocarAltura < 1.10 || v1.trocarAltura > 1.80) {
					System.out.println("nao pode brincar");
				} else {
					System.out.println("pode brincar");
				}
				System.out.println(v1.getExibirInfo());
				break;
			}
				
		} while (opicao < 0);

	}

}
