package Aula_0409;

public class Banco {
	private String nome;
	
	public Banco() {
		
	}
	public Banco(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void seNome(String nome) {
		this.nome = nome;
	}
}
