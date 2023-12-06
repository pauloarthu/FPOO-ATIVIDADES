package Aula2308;

public class CaixaEletronico { // serviço 24 horas 
	//atributos
	//construtores
	//get e set
	//metodos especiais
	public void sacar(double valor) {
		valor = valor + 0.5; //taxa cobrada pela transação
		System.out.println("O seu saque no caixa eletronico foi = " +  valor);
	}

}
