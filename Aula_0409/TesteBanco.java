package Aula_0409;

public class TesteBanco {

	public static void main(String[] args) {
		Banco b1 = new Banco("bb");
		Empregado emp1 = new Empregado("juka");
		System.out.println("o " + emp1.getNome() + "é empregado do " + b1.getNome());

	}

}
