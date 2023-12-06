package atividades_Paulo_Arthur;

import java.util.Scanner;

import Aula_1206.While;

public class q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_aleatorio = (int) (Math.random()*30) + 1;
		int tentativas;
		int contador = 0;
		System.out.println("start");
		do {
			System.out.println("dogote um numero de 1 a 30");
			tentativas = entrada.nextInt();
			contador++;
			if (tentativas < num_aleatorio) {
				System.out.println("digite um numero MAIOR");
			}else {
				System.out.println("acertou");
			}
		}while (tentativas != num_aleatorio);
		System.out.println("voute sempre");
	   }
}
