package Aula2308;

public class Santander extends CaixaEletronico{

	@Override
	public void sacar(double valor) {
		valor = valor + 3.2; //taxa cobrada pela transação
		System.out.println("O seu saque no caixa santander foi = " +  valor);
	}

}
