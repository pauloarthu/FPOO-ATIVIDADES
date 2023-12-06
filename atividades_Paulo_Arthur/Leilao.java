package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Leilao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("lanches");
		int numero = entrada.nextInt();
		int V = 0;
		int [] n= {V};
		String c= null;
		String []n1 = {c};
		for (int i = 0; i < numero ; i++) {
			System.out.println("nome");
			String c1= entrada.next();
			System.out.println("lanche");
			int lanche = entrada.nextInt();
			if (lanche > n[0]) {
				n[0] = lanche;
				n1[0] = c1;
			}
		}
		System.out.print(n1[0]);
		System.out.println(n[0]);

	}

}
