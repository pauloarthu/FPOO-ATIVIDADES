package atividades_Paulo_Arthur;

import java.util.Scanner;

public class testeAcademia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Academia c1 = new Academia();
		System.out.println("digite o seu peso: ");
		c1.peso = entrada.nextInt();
		System.out.println("digite a sua altura: ");
		c1.altura = entrada.nextFloat();
		System.out.println(c1.setImc());
		System.out.println("digite o seu peso desejavel: ");
		c1.desejavel = entrada.nextFloat();
		System.out.println(c1.setDesejavel());
		System.out.println("nome: ");
		c1.nome = entrada.next();
		System.out.println("seu nome é: " + c1.nome);
		System.out.println("digite seu cpf");
		c1.cpf = entrada.next();
		System.out.println("seu cpf é: " + c1.cpf);
		System.out.println("digite o seu telefone");
		c1.telefone = entrada.nextDouble();
		System.out.println("seu telefone é: " + c1.telefone);
		System.out.println("digite sua idade");
		c1.idade = entrada.nextInt();
		System.out.println("sua idade é: " + c1.idade);
	}

}
