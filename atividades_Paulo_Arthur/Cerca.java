package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Cerca {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("numero de postes");
		int n = entrada.nextInt();
		int substituir = 0;
		int consertados = 0;
		
		for (int i = 0; i < n; i++) {
			int x = entrada.nextInt();
			if (x < 50) {
				substituir++;
			}
			if (50 <= x && x < 85) {
				consertados++;
			}
		}
		System.out.println("subistituidos " + substituir + "consertar" + consertados);
	}

}


