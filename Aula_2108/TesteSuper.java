package Aula_2108;

public class TesteSuper {

	public static void main(String[] args) {
		//instanciar objeto das 2 classes
		SuperClasse sc = new SuperClasse();
		SubClasse sb = new SubClasse();
		
		sb.a = 85;
		sb.b = 10;
		sb.c = 20;
		sb.d = 30;
		System.out.println(sb.toString());
		System.out.println(sb.a);
		System.out.println(sb.b);
		System.out.println(sb.c);
		System.out.println(sb.d);
		//objeto da superClasse
		System.out.println(sc.a);
		System.out.println(sc.b);
	}

}
