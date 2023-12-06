package atividades_Paulo_Arthur;

import java.util.Iterator;
import java.util.Scanner;

public class Album {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("quantidade de spacos");
		int n = entrada.nextInt(); //quantidade de espaços no album
		System.out.println("quantidade de figurinhas");
		int m = entrada.nextInt(); //quantidade de figurinha
		boolean[] jatenho = new boolean[3];
		int x = 0;
		//varrer vetor
		for (int i = 0; i < n; i++) {
			jatenho[1] = false;
		}
			//fig que ja temos
		for(int i = 0; i < m; i++) {
			x = entrada.nextInt();
			jatenho[x] = true; 
		}
		int repetidas = 0;
		//marcar s repetidas
		for(int i = 0; i < n; i++)
			if(jatenho[i])
				repetidas = repetidas + 1; //ou repetidas++
		//vamos contar a quiantidade de fig repetidas
		System.out.println("quantidade de fig repetidas = " + (n - repetidas));
		System.out.println("quantidade de fig repetidas = " + repetidas);
		System.out.println(n);
		System.out.println(m);
		
		
		
	} 
}
