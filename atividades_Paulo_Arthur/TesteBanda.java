package atividades_Paulo_Arthur;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<MembrosBanda> l = new ArrayList<MembrosBanda>();
		Banda banda2 = new Banda();
		
		
		
		
		System.out.println("coloque o nome da banda");
		String s = entrada.next();
		Banda  banda1 = new Banda(s);
		System.out.println("nome do Vocalista");
		s = entrada.next();
		Vocalista v1 = new Vocalista(s);
		System.out.println("nome do Baixista");
		s= entrada.next();
		Baixista b1 = new Baixista(s);
		System.out.println("nome do baterista");
		s = entrada.next();
		Baterista ba1 = new Baterista(s);
		System.out.println("nome do guitarrista");
		s = entrada.next();
		Guitarrista g1 = new Guitarrista(s);
		
		l.add(v1);
		l.add(b1);
		l.add(ba1);
		l.add(g1);
		
		System.out.println("Nome da banda: " + banda1.getNome());
		for (MembrosBanda olho : l) {
			System.out.println("Os menbros da banda sao: " + olho.getNome());
		}
		
		banda1.realizarS();
		v1.tocar();
		b1.tocar();
		ba1.tocar();
		g1.tocar();
		
		
		
		
		
		
	}

}
