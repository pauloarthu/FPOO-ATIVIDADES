package atividades_Paulo_Arthur;

public class casa {
	private String cor;
	private float preco;
	private float matragem;
	public int numeroCamas;
	public Sala temTv;
	public String mostrarDetales;
	public int temTV;
	
	public casa() {
		
	}
	public casa(String cor, float preco, float metragem) {
		
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMatragem() {
		return matragem;
	}
	public void setMatragem(float matragem) {
		this.matragem = matragem;
	}

	public Sala getTemTv() {
		System.out.println("sim, temTv");
		return temTv;
	}
	public void setTemTV(Sala temTv) {
		this.temTv = temTv;
	}
	public int getNumeroCamas() {
		return numeroCamas;
	}
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}
	public boolean temTV() {
		return true;
		
	}


}
