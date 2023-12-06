package atividades_Paulo_Arthur;

public class Visitante {
	private String nome;
	private int idade;
	private double altura;
	public String trocarNome;
	public int trocarIdade;
	public double trocarAltura;
	public String exibirInfo;
	
	public String setNome() {
		System.out.println(nome);
		return nome;
	}
	public int setIdade() {
		
		return idade;
	}
	public double setaltura() {
		
		return altura;
	}
	
	
	public void trocarNome(String nom) {
		this.nome = nom;
	}
	public void trocarIdade(int id) {
		this.idade = id;
	}
	public void trocarAltura(double al) {
		this.altura = al;
	}
	public String getExibirInfo() {
		System.out.println(trocarNome + trocarIdade + trocarAltura);
		return exibirInfo;
	}
	
		
		
}
