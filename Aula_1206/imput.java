package Aula_1206;

import java.util.Scanner;

public class imput {

	public static void main(String[] args) {
		//instancia de objeto 
		Scanner objin = new Scanner(System.in);
		System.out.println("digite o valor de a");
			int a = objin.nextInt();
			System.out.println("digite o valor de b");
			int b = objin.nextInt();
			if (a > b) {
				System.out.println("%d" + a);
				}else 
					System.out.println("%d\n" + b);
	   }
	}


