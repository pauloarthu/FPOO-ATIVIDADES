package Aula_0208;

import java.util.Scanner;

public class tesouro {

	public static void main(String[] args) {
		int resultado;
		Scanner entrada = new Scanner(System.in);
        System.out.print("Digite numero de moedas: ");
        int moedas = entrada.nextInt();
        System.out.print("Digite o numero de marinheiros: ");
        int marinheiros = entrada.nextInt();
        marinheiros = marinheiros + 2;
        resultado = moedas / marinheiros; 
        System.out.println("marinheiro  " + resultado);
        int captao = resultado * 2;
        System.out.println("numero do capitão  " + captao);
        
	}

}
