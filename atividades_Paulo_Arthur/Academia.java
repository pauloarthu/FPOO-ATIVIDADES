package atividades_Paulo_Arthur;

public class Academia {
	public String cpf;
	public String nome;
	public double telefone;
	public int idade;
	public float altura;
	public int peso;
	public double imc;
	public float desejavel;
	
	
	public double setImc() {
		if (peso / (altura * altura) < 18.5) {
			System.out.println("magro");
			System.out.println(peso / (altura * altura));
		}else if (peso / (altura * altura) >= 18.5 && peso / (altura * altura) <= 24.9) {
			System.out.println("normal");
			System.out.println(peso / (altura * altura));
		}else if (peso / (altura * altura) >= 25 && peso / (altura * altura) <= 29.9) {
			System.out.println("sobrepeso");
			System.out.println(peso / (altura * altura));
		}
		return imc;
	}
	public float setDesejavel() {
		if (desejavel >= 0) {
			float resu = (peso - desejavel);
			System.out.println("diferença para peso desejaval " + resu);
			return peso - desejavel;
		}else
		return peso - desejavel;
	}
}
