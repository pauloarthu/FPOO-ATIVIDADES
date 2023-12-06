package Aula2308;

public class Gato extends Animal{ //herança
	//atributos
	public String raca;
	public float peso;
	public int idade;
	//metodo construtor
	public Gato() {
		super();
		System.out.println("acabei de nascer e sou um gato sem caracteristicas");
	}
	public Gato(String raca) {  //metodo construtor com parametro
		super();
		this.raca = raca;
		System.out.println("\n acabei de nascer sou um gato com raça");
	}
	public Gato(float peso, int idade) {
		super();
		this.peso = peso;
		this.idade = idade;
		System.out.println("\n acabei de nascer sou um gato com raca peso e idade");
	}
	//metodos 
	public void som() {
		System.out.println("som da classe gato");
		super.som();  //som da classe animal
	}
	
	
	
	
	
}
