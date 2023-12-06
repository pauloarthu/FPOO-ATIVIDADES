package Aula_3008;

public class testeInterface {

	public static void main(String[] args) {
		//instancia do obijeto
		//não posso instanciar um obijeto de interface, e sim da classe"""
		interfacePai obj1 = new usoInterface();
		obj1.metodo1();
		obj1.metodo2();
		obj1.somar(1, 4);
		

	}

}
