package atividades_Paulo_Arthur;

public class Guitarrista extends MembrosBanda{
	public Guitarrista(String nome) {
		this.setNome(nome);
	}
	@Override
	public void tocar() {
		System.out.println("tocando a guitarra");
	}
}
