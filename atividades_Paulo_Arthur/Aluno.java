package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Aluno extends Pessoa {
	Scanner entrada = new Scanner(System.in);
	private String curso;
	private float nota1;
	private float nota2;
	public float resu;
	
	//construtor
	public Aluno() {
		super();
	}
	public Aluno(float nota1, float nota2) {
		super();
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public float getNota1() {
		return nota1;
	}
	public void setNota1(float nota1) {
		System.out.println("coloque sua primeira nota");
		nota1 = entrada.nextFloat();
		this.nota1 = nota1;
	}
	public float getNota2() {
		return nota2;
	}
	public void setNota2(float nota2) {
		System.out.println("coloque sua segunda nota");
		nota2 = entrada.nextFloat();
		this.nota2 = nota2;
	}
	
	//metodo especial

	
	
}
