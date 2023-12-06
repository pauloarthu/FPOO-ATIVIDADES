package atividades_Paulo_Arthur;

public class Brinquedo {
	private String nome;
	private int idade1;
	private double alturaMinima1;
	private double alturaMaxima1;
	private int idade2;
	private double alturaMinima2;
	private double alturaMaxima2;
	
	public double GetAlturaMinima1() {
		
		return alturaMinima1;
	}
	public Brinquedo() {
		System.out.println("1 - carrinho \n espesificacoes ( nome: carrinho, idade minima e de 10 anos, altura minima para andar e de 1,50 e maxima e de 1,90 )");
		System.out.println("2 - pula pula \n espesificacoes ( nome: pula pula, idade minima e de 6 anos , a altura minima para brincar e de 1,10 e a maxima e de 1,80  )");
	}

	
}
