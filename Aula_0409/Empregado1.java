package Aula_0409;

public class Empregado1 {
	//atributos
	private int salario;
	private Pessoa funcionario; //conposicao muda o tipo do atributo
	
	
	
	//construtor
	public Empregado1() {
		
	}
	public Empregado1(int salario, Pessoa funcionario) {
		this.salario = salario;
		this.funcionario = funcionario;
	}
	
	
	
	//get e set
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Pessoa getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Pessoa funci) {
		this.funcionario = funci;
	}
	
	
}
