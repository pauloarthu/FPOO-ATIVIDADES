package Aula2308;

public class VasoDecorado extends Vaso{
	//metodo
	private String decoracao;
	//construtor
	public VasoDecorado() {
		super.getCor();
		super.getMaterial();
		super.getTamanho();
	}
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	
	
	
	
	
	
}
