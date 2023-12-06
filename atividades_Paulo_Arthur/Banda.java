package atividades_Paulo_Arthur;

import java.util.List;

public class Banda {
	private String nome;
	private List<Banda> membros;
	
	public Banda() {
		
	}
	public Banda(String nome) {
		this.setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Banda> getMembros() {
		return membros;
	}
	public void setMembros(List<Banda> membros) {
		this.membros = membros;
	}
	public void realizarS() {
		System.out.println("realizando Show");
	}
}
