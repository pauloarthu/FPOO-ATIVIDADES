package atividades_Paulo_Arthur;

public class Vocalista extends MembrosBanda{
	
	public String tocar;
	
	public Vocalista() {
		
	}
	
	public Vocalista(String nome) {
		this.setNome(nome);
	}
	@Override
	public void tocar() {
		System.out.println("esta cantando");
	}
}
