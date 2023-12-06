package Aula_0208;

import java.util.Scanner;

public class cinema {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a idade da 1° pessoa: ");
        int idadePessoa1 = entrada.nextInt();
        System.out.print("Digite a idade da 2° pessoa: ");
        int idadePessoa2 = entrada.nextInt();
        int precoPessoa1 = precoTotal(idadePessoa1);
        int precoPessoa2 = precoTotal(idadePessoa2);
        int totalAPagar = precoPessoa1 + precoPessoa2;
        System.out.println("Total a ser pago pelos dois ingressos: " + totalAPagar + " reais");
        entrada.close();
	
		
		
		
	}
	
    public static int precoTotal(int idade) {
        if (idade <= 17) {
            return 15;
        } else if (idade >= 18 && idade <= 59) {
            return 30;
        } else { 
            return 20;
        }

    }
}


