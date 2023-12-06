package Aula_0409;

import java.util.List;

public class Biblioteca {
	private List<Livro> livros;
	
	public Biblioteca() {
		
	}
	public Biblioteca(List<Livro> livros) {
		this.livros = livros;
	}
	//metodo especial 
	public List<Livro> getTotalLivrosBiblioteca() {
		
		return livros;
	}
}
