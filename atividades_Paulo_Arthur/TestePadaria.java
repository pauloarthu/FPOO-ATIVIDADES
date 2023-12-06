package atividades_Paulo_Arthur;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int opicao;

				do {
					System.out.println("------------------MENU------------------");
					System.out.println("1 - mostrar estoque");
					System.out.println("2 - comprar produtos");
					opicao = entrada.nextInt();
					switch (opicao) {
					case 1:
						System.out.println("-------------pao-------------");
						Pao p1 = new Pao();
						Pao p2 = new Pao("Pao com presunto", 2);
						p1.assar();
				System.out.println("-------------bolo-------------");
						Bolo b1 = new Bolo();
						Bolo b2 = new Bolo("Bolo de cenoura" , 12);
						b1.assar();
				System.out.println("-------------doce-------------");
						Doce d1 = new Doce();
						Doce d2 = new Doce("Morango ", 4 );
						d1.misturar();
						System.out.println("---------------------------------------------------");
						System.out.println("9 - voltar para menu");
						opicao = entrada.nextInt();
						break;
					case 2:
						PessoaPadaria p = new PessoaPadaria();
						System.out.println("digite o seu nome");
						p.nome = entrada.next();
						System.out.println("digite sua idade");
						p.idade = entrada.nextInt();
						
						//                     pao 
						System.out.println("---------------------------------------------------");
						System.out.println("4 - comprar Pao com presunto" + "\n3 - comprar Pao de forma" + "\n2 - Comprar os dois" + "\n1 - nao comprar pao");
						p.pao = entrada.nextInt();
						if (p.pao == 4) {
							System.out.println("comprou um pao com presunto");
						} else if (p.pao == 3){
							System.out.println("Comprou pao de forma");
						} else if (p.pao == 2) {
							System.out.println("Comprou os dois");
						} else if (p.pao == 1) {
							System.out.println("nao comprou pao");
						}
						//                       bolo
						System.out.println("---------------------------------------------------");
						System.out.println("4 - comprar um bolo de chocolate" + "\n3 - comprar bolo de cenoura" + "\n2 - comprar os dois" + "\n1 - nao comprar bolo");
						p.bolo = entrada.nextInt();
						if (p.bolo == 4) {
							System.out.println("comprou um bolo de chocolate");
						} else if (p.bolo == 3){
							System.out.println("comprou bolo de cenoura");
						} else if (p.bolo == 2) {
							System.out.println("comprou os dois");
						} else if (p.bolo == 1) {
							System.out.println("nao comprou bolo");
						}
						
						//                       doce
						System.out.println("---------------------------------------------------");
						System.out.println("4 - comprar doce de morango" + "\n3 - comprar doce de chocolate  " + "\n2 - comprar os dois doces" + "\n1 - nao comprar doce");
						p.doce = entrada.nextInt();
						if (p.doce == 4) {
							System.out.println("comprou doce de morango ");
						} else if (p.doce == 3) {
							System.out.println("comprou doce de chocolate");
						} else if (p.doce == 2) {
							System.out.println("comprou os dois");
						} else if (p.doce == 1) {
							System.out.println("nao comprou doce");
						}
						break;
						
					default:
						break;
					}
				} while (opicao == 9);

	}

}
