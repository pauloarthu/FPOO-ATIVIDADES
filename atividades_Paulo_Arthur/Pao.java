package atividades_Paulo_Arthur;

public class Pao extends ProdutoPadaria{
	
	public Pao() {
		super();
		System.out.println("Pao de forma" + "  R$5");
	}
	public Pao(String a, int b) {
		System.out.println(a + " R$" + b);
	}

	public void assar() {
		System.out.println("assando....");
	}
}
