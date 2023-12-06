package atividades_Paulo_Arthur;

public class SpeedBike implements Veiculo{
	public int velocidade;
	public int marcha;
	public int v = 0;
	public int m = 1;
	
	public SpeedBike() {
		super();
	}
	


	@Override
	public void diminuirMarcha() {
		m = m - 1;
		System.out.println("sua marcha atual e de: " + m);
	}


	@Override
	public void aumentarMarcha() {
		m = m + 1;
		System.out.println("sua marcha atual e de: " + m);
	}


	@Override
	public void acelerar() {
		v = v + 5;
		System.out.println("sua velocidade atual é de: " + v);
		
	}


	@Override
	public void frear() {
		v = v - 5;
		System.out.println("sua velocidade atual é de: " + v);
		
	}


	
}
