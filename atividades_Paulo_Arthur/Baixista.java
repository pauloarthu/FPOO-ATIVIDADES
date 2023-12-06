package atividades_Paulo_Arthur;

public class Baixista extends MembrosBanda{
	public Baixista(String nome) {
		this.setNome(nome);
	}
	@Override
	public void tocar() {
		System.out.println("tocando baixo");
	}
}
