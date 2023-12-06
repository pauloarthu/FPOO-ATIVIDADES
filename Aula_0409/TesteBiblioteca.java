package Aula_0409;

import java.util.ArrayList;
import java.util.List;

public class TesteBiblioteca {

	public static void main(String[] args) {
		//instancia de obj
		Livro v1 = new Livro("programacao em java", "deitel");
		Livro v2 = new Livro("UML", "Bezerra");
		List<Livro> lista_livro = new ArrayList<Livro>();
		lista_livro.add(v1);
		lista_livro.add(v2);
		
		for (Livro ver_lista : lista_livro) {
			System.out.println("livros na lista: " + ver_lista.titulo + ver_lista.autor);
		}
		
		
		//instancia da biblioteca
		//a lista faz parte da biblioteca (composição)
		Biblioteca b1 = new Biblioteca(lista_livro);
		List<Livro> li = b1.getTotalLivrosBiblioteca();
		for (Livro livr : li) {
			System.out.println("titulo: " + livr.titulo + "\nautor: " + livr.autor);
		}
		
		
	}

}
