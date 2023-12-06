package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Cobra {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		Scanner entrada = new Scanner(System.in);
		System.out.println("coloque os 4 valores");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		if (a == c || b == d) {
			System.out.println("a cobra e verdadeira");
		} else {
			System.out.println("a cobre e falsa");
		}
	}

}
