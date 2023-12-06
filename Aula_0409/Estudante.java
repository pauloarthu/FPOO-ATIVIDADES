package Aula_0409;

public class Estudante {
	public String nome;
	public int ra;
	public String curso;
	
	public Estudante() {
		
	}
	public Estudante(String nome, int ra, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
