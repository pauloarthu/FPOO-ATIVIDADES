package Aula2308;

public class TesteSobrecarga {

	public static void main(String[] args) {
		//instancia de objeto
		Sobrecarga sob = new Sobrecarga();
		System.out.println(sob.soma(1.5, 2.8));
		System.out.println(sob.soma(5, 9));
		System.out.println(sob.soma("ola", "turma"));
		sob.soma(2, 5, 7);
	}

}
