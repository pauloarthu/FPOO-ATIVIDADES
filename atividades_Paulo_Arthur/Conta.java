package atividades_Paulo_Arthur;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite valor para pagar as contas: ");
		int banco = entrada.nextInt();
		System.out.println("digite o valor da primeira conta: ");
		int conta1 = entrada.nextInt();
		System.out.println("digite o valor da segunda conta: ");
		int conta2 = entrada.nextInt();
		System.out.println("digite valor da terceira conta: ");
		int conta3 = entrada.nextInt();
		
		if (banco < conta1 && banco < conta2 && banco < conta3) {
			System.out.println("valor nao paga nem uma conta");
		}
		if (banco >= conta1) {
			System.out.println("valor paga a primeira conta");
			banco = banco - conta1;
		}

		if (banco >= conta2) {
			System.out.println("valor paga a segunda conta");
			banco = banco - conta2;
		}

		if (banco >= conta3) {
			System.out.println("valor paga a terceira conta");
		} 
	}

}
