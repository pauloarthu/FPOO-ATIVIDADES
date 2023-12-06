package Aula_3008;

public class usoInterface implements interfacePai{
	//permite atributos
	
	public String at1;
	//preciso realizar a sobreescrita de metodos!
	
	@Override
	public void metodo1() {
		System.out.println("teste metodo 1");
		
	}

	@Override
	public void metodo2() {
		System.out.println("teste metodo 2");
		
	}

	@Override
	public void somar(int a, int b) {
		int r = a + b;
		System.out.println("o resultado da soma é de: " + r);
	}
	//metodo 3 é da propia clsse 
	
	public void metodo3() {
		System.out.println("esse é o metodo 3 da propia classe");
	}


}
