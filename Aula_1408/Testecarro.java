package Aula_1408;

public class Testecarro {

	public static void main(String[] args) {
		//instanciando obijetos da classe carro
		Carro c1 = new Carro();		
		c1.modelo = "gol g5";
		System.out.println("o modelo é: " + c1.modelo);
		c1.setPotencia(1000);
		System.out.println("a potencia é: " + c1.getPotencia() + "freiar");
		c1.getAcelerar();
		c1.getFrear();
		
		
		//instancia do carro c2 
		Carro c2 = new Carro();
		
		//instancia do carro c3
		Carro c3 = new Carro("gol g3 \n", 1.6f);
		
		//c4
		//Carro c4 = new Carro("BMW", 2.0f);
		
	}

}
