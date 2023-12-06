package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Contas2 {

	public static void main(String[] args) {
		int V, A, P, F;
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe");
		V = entrada.nextInt();
		System.out.println("primeira conta");
		A = entrada.nextInt();
		System.out.println("segunda conta");
		F = entrada.nextInt();
		System.out.println("terceira conta");
		P = entrada.nextInt();
		
		if (V >= (A + F + P)) {
			System.out.println("3");
		}else if (V >= (A + F) || V >= (A + P)) {
			System.out.println("2");
		}
	}

}
