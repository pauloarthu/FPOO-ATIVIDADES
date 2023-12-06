package Aula_1408;


public class Carro {
	//atributos
	public String modelo;
	private float potencia;
	public boolean parado;
	//construtor padrao (defult)
	public Carro() {
		System.out.println("defult");
	}
	public Carro(String mod, float pot) {
		this.modelo = mod;
		this.potencia = pot;
		System.out.println(mod + pot);
	}
	//metodos get e set 
	public String getModelo() {
		return modelo;
		
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPotencia() {
		return potencia;
	}
	public void setPotencia(float p) {
		this.potencia = p;
	}
	
	//metodos especiais
	
	public boolean getAcelerar() {
		if (parado == true) {
			System.out.println("sem movimento");
		} else {
			System.out.println("acelerando");
		}
		return parado;
	}
	public boolean getFrear() {
		if (parado == true) {
			System.out.println("sem movimento ..... acione o freio");
		} else {
			System.out.println("esta em movimento....socorro!");
		}
		return parado;
	}
	
	
	public boolean isParado() {   //testa o estado que o veiculo esta
		return parado;
	}
	public void setParado(boolean pa) { //muda o estado que o veiculo esta
		this.parado = pa;
	}
	
	
	
}
