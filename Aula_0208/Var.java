package Aula_0208;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		int resultado;
		Scanner entrada = new Scanner(System.in);
        System.out.print("posicao X: ");
        int x = entrada.nextInt();
        System.out.print("posicao Y: ");
        int y = entrada.nextInt();
        if ( x < - 8 || x > 8 || y < 0 || y > 0) {
			System.out.println("bola foi dentro");
		}
        else {
			System.out.println("bola fora");
		}
	}

}
