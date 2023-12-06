package Aula_0409;

public class TesteEmpregado {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("gerente", "tia leila", 55);
		Empregado1 e1 = new Empregado1();
		Empregado1 e2 = new Empregado1(15000, p1);
		System.out.println("cargo: " + p1.cargo + "\nsalario: " + e2.getSalario());

	}

}
