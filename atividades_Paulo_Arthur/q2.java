package atividades_Paulo_Arthur;

import java.util.Scanner;


public class q2 {

	public static void main(String[] args) {
		int numero;
		int menor = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite um numero positivo e negativo");
		boolean primeiro_numero = true;
		while(true) {
			numero = entrada.nextInt();
			if (numero == 0) {
				break;
			}	
			if (primeiro_numero) {
				menor = numero;
				primeiro_numero = false;
			}else if (numero < menor) {
				menor = numero;
			}
			if (primeiro_numero) {
				System.out.println("nenhum numero foi digitado");
			} else {
				System.out.println("o menor numero digitado foi: " + menor);
			}
		}
	}
}
