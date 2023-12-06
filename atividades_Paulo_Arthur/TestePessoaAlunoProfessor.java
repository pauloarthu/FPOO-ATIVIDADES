package atividades_Paulo_Arthur;

import java.util.Scanner;

public class TestePessoaAlunoProfessor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa pe = new Pessoa();
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Professor pr1 = new Professor();
		Professor pr2 = new Professor();
		float media;
		
		a1.setNome(null);
		a1.setEndereco(null);
		a1.setTelefone(0);
		a1.setCpf(0);
		a1.setCelular(0);
		a1.setNota1(0);
		a1.setNota2(0);
		media = (a1.getNota1() + a1.getNota2()) / 2;
		if (media >= 7) {
			System.out.println("sua nota e: " + media + "\n voce esta na media");
		} else {
			System.out.println("sua nota e: " + media + "\n voce esta abaixo da media");
		}

	}

}
