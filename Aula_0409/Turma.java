package Aula_0409;

import java.util.List;

public class Turma {
	public String nome;
	private List<Estudante> estudantes;
	
	public Turma() {
		
	}
	public Turma(String nome, List<Estudante> estudantes) {
		this.nome = nome;
		this.estudantes = estudantes;
	}
	public List<Estudante> getEstudantes() {
		return (List<Estudante>) estudantes;
	}
	public List<Estudante> setEstudantes() {
		return estudantes;
	}
	
	
}
