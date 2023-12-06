package Aula2308;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteAnimal1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//criei minha lista de animais vazia
		ArrayList<Animal1> animais = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			System.out.println("digite o nome do animal " + (i + 1) + ": ");
			String nome = entrada.nextLine();
			System.out.println("escolha o tipo ne animal: cao ou gato");
			String tipo = entrada.nextLine();
			Animal1 animal;
			if(tipo.equalsIgnoreCase("cachorro")) {
				animal = new Cachorro(nome);
			}else if(tipo.equalsIgnoreCase("gato")) {
				animal = new Gato1(nome);
			} else {
			System.out.println("animal invalido");
			animal = new Animal1(nome);	
			}
			animais.add(animal);
			//animais.add(animal);
			//animais.add(animal);
		}
		for (Animal1 animal : animais) {
		System.out.println("nome do animal: " + animal.getNome());
		animal.emitirSom();;
		}
		
		
	}

}
