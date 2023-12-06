package Aula2308;

public class Cachorro extends Animal1{
	//construtor
	public Cachorro(String nome) {
		super(nome);//pegando atributo nome da super classe Animal1
	}
	public void emiteSom() {
		System.out.println("o cachorro esta latindo...");
	}
	
	
	
}
