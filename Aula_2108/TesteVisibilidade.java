package Aula_2108;

import br.org.sesisp.java.paulo.ClasseExterna;

public class TesteVisibilidade {

	public static void main(String[] args) {
		//instancia de objetos
		SubClasse1 sub1 = new SubClasse1();
		System.out.println("senha vista pela subClasse1" + sub1.senha);
		
		SubClasse2 sub2 = new SubClasse2();
		System.out.println("senha vista pela subClasse2" + sub2.senha);
		
		//objeto da classe externa
		ClasseExterna cx = new ClasseExterna();
		System.out.println("senha vista pela classe externa" + cx.getSenha());
		
		//instanciando uma classe abstrata
		//naoooo podemos!!!
		/*ClassePai cp = new ClassePai() {
			cp.nome = "sei la";*/

	}

}
