package atividades_Paulo_Arthur;

import java.util.Scanner;

public class TesteCasa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
 		String s;
		int i;
		float f;
		int tv;
		casa c1 = new casa();
  		casa c2 = new casa();
  		Comodo c =new Comodo();
		
  		System.out.println("coloque o nome do comodo");
  		s = entrada.next();
  		c.setNome(s);
  		System.out.println("coloque o numero de camas");
  		i = entrada.nextInt();
  		c1.setNumeroCamas(i);
  		System.out.println("tem Tv?" + "\n1 - sim" + "\n0 - nao");
  		tv = entrada.nextInt();
  		System.out.println("escreva a cor");
  		s = entrada.next();
  		c1.setCor(s);
  		System.out.println("digite o preco");
  		f = entrada.nextFloat();
  		c1.setPreco(f);
  		System.out.println("digite a metragem da casa");
  		f = entrada.nextFloat();
  		c1.setMatragem(f);
  		
  		System.out.println("------------------------------------------------------");
  		System.out.println("exibindo as informacoes da casa");
  		System.out.println("nome: " + c.getNome());
  		System.out.println("numero de camas: " + c1.getNumeroCamas());
  		if (tv == 1) {
			System.out.println("tem tv");
		} else {
			System.out.println("nao tem tv");
		}
  		System.out.println("cor: " + c1.getCor());
  		System.out.println("preco: " + c1.getPreco());
  		System.out.println("metragem da casa: " + c1.getMatragem());
  		
	}

}
