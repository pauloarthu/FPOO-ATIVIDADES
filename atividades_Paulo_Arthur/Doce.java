package atividades_Paulo_Arthur;

public class Doce extends ProdutoPadaria{
	public Doce() {
		super();
		System.out.println("Chocolate " + "R$3");
	}
	
	public Doce(String a, int b) {
		System.out.println(a + " R$" + b);
	}
	public void misturar() {
		System.out.println("misturando....");
	}

}
