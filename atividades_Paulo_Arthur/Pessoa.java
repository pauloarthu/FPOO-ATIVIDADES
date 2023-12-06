package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Pessoa {
	Scanner entrada = new Scanner(System.in);
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	
	//construtor
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome( String nome) {
		System.out.println("digite o seu nome");
		nome = entrada.next();
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		System.out.println("digite o seu endereco");
		endereco = entrada.next();
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		System.out.println("digite seu telefone");
		telefone = entrada.nextInt();
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		System.out.println("digite seu cpf");
		cpf = entrada.nextInt();
		this.cpf = cpf;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		System.out.println("celular");
		celular = entrada.nextInt();
		this.celular = celular;
	}
	
	
	
	
}
