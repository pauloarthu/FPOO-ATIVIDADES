package Aula_0409;

public class Pessoa {
	public String cargo;
	public String nome;
	public int idade;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String cargo, String nome, int idade) {
		this.cargo = cargo;
		this.nome = nome;
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
