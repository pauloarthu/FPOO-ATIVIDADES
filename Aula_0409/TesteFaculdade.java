package Aula_0409;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteFaculdade {

	public static void main(String[] args) {
		Estudante e1 = new Estudante("joao", 10, "TI");
		Estudante e2 = new Estudante("maria", 20, "TIB");
		Estudante e3 = new Estudante("pedro", 100, "EE");
		Estudante e4 = new Estudante("ana", 200, "ECP");
		//criando a lista de estudantes 
		List<Estudante> eTI = new ArrayList<Estudante>();
		//adicionar os alinos criados na lista
		eTI.add(e1);
		eTI.add(e2);
		eTI.add(e3);
		eTI.add(e4);
		//mostrando os alunos na lista
		int i2 = 0;
		for (Estudante estudante : eTI) {
			System.out.printf("\nPosicao %d-%s %d %s",i2, estudante.nome, estudante.ra, estudante.curso);
			i2++;
		}
		//vamos adicionar os alunos e3 e e4 na lista nova
		List<Estudante> eEE = new ArrayList<>();
		eEE.add(e3);
		eEE.add(e4);
		//instancia da classe Turma
		Turma tia = new Turma("TI", eEE);
		Turma EE = new Turma("engE", eEE);
		//agora criei uma lista de turmas para adicionar os alunos nela
		List<Turma> tur = new ArrayList<>();
		tur.add(tia);
		tur.add(EE);
		//ler a lista e ver quais alunos estao nela 
		for (int i = 0; i < tur.size(); i++) {
			System.out.println("nome dos turmas: " + tur.get(i).nome);
		}
		//instancia da classe faculdade
		
		Faculdade senai = new Faculdade("SENAI", tur);
		System.out.println("total de estudantes da faculdade: " + senai.getTotalEstudantes());
 		
		
		
	}

}
