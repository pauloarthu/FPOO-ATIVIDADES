package Aula_2108;

public abstract class ClassePai {
	public String senha;
	protected String nome = "rock";
	private int idade = 50;
	//construtor
	public ClassePai() {
		System.out.println("chamando construtor padrao da ClassePai" + nome);
	}	
		public void metodoImprimir() {
			System.out.println("imprimir na ClassePai");
	}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getIdade() {
			return idade;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
	
}
