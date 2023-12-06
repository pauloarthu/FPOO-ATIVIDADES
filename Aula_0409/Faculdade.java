package Aula_0409;

import java.util.List;

public class Faculdade {
	public String nomeFacul;
	private List<Turma> cursos;
	
	public Faculdade() {
		
	}
	
	public Faculdade(String nomeFacul, List<Turma> curso) {
		this.nomeFacul = nomeFacul;
		this.cursos = curso;
	}
	
	public int getTotalEstudantes() {
		int nEstudantes = 0;
		List<Estudante> estudante;
		for (Turma cur : cursos) {
			estudante = cur.getEstudantes();
			for (Estudante s : estudante) {
				nEstudantes++;
			}
		}
		return nEstudantes;
		
	}
	
	
}
