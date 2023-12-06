package Aula_1206;

public class relogio {

	public static void main(String[] args) {
		int R = 60; 
	    int F = 190;
	    int C = 100;
		
		if (F > R * 3 || C <= 98) {
			System.out.println("aumentar o ritimo");
		} 
		else if (R > F * 2 && C <= 97) {
			System.out.println("diminuir o ritimo");
		}else {
			System.out.println("continuar o ritimo");
		}
	}
}
