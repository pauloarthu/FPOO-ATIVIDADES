package atividades_Paulo_Arthur;

public class Bolo extends ProdutoPadaria{
	public Bolo() {
		super();
		System.out.println("Bolo de chocolate  " + "R$10");
	}
	public Bolo(String a, int b) {
		System.out.println(a + "  R$" + b);
	}
	
	public void assar() {
		System.out.println("assando....");
	}
}
