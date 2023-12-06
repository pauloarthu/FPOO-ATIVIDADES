package atividades_Paulo_Arthur;

public class MembrosBanda {
	private String nome;
	
	public MembrosBanda() {
		super();
	}
	public MembrosBanda(String nome) {
		this.setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void tocar() {
		System.out.println("banda esta tocando");
		
	}
}
