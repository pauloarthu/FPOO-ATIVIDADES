package Aula2308;

public class Caixa extends CaixaEletronico{  //caixa economico federal
	//metodo
	@Override
	public void sacar(double valor) {
		valor = valor + 0.9; //taxa cobrada pela transação
		System.out.println("O seu saque no caixa economico federal foi = " +  valor);
	}

	
	
	
}
