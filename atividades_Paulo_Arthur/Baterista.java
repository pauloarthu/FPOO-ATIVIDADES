package atividades_Paulo_Arthur;

public class Baterista extends MembrosBanda{
	public Baterista(String nome) {
		this.setNome(nome);
	}
	@Override
	public void tocar() {
		System.out.println("tocando a bateria");
	}
}
