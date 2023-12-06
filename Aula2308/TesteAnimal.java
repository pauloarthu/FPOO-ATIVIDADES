package Aula2308;

public class TesteAnimal {

	public static void main(String[] args) {
		//instancia de objeto da classe animal
		Animal ani1 = new Animal();
		ani1.nome = "pica pal";
		System.out.println("animal criado" + ani1.nome);
	//instancia de objeto da classe gato
		System.out.println("----------------inicio gato1---------------------");
		Gato gato1 = new Gato();
		gato1.nome = "theo";
		System.out.println("nome " + gato1.nome);
		gato1.brincar();
		System.out.println("----------------fim gato1---------------------");
		
		System.out.println("----------------inicio gato2---------------------");
		Gato gato2 = new Gato("persa");
		gato2.som();
		
		System.out.println("----------------fim gato2---------------------");
		
		System.out.println("----------------inicio gato3---------------------");
		Gato gato3 = new Gato(2.5f , 8);
		System.out.println("----------------fim gato3---------------------");
	}
}
