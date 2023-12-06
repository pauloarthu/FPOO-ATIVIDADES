package atividades_Paulo_Arthur;

import java.util.Scanner;

public class Testeveiculo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SpeedBike s1 = new SpeedBike();
		SpeedBike s2 = new SpeedBike();
		MountainBike m1 = new MountainBike();
		MountainBike m2 = new MountainBike();
		int opicao;
		do {
			System.out.println("1 - velocidade");
			System.out.println("2 - marcha");
			opicao = entrada.nextInt();
			switch (opicao) {
			
			case 1:
				do {
					System.out.println("1 - aumentar velocidade");
					System.out.println("2 - diminuir velocidade");
					System.out.println("9 - voltar");
					opicao = entrada.nextInt();
					switch (opicao) {
					case 1:
						s1.acelerar();
						System.out.println("9 - voltar");
						opicao = entrada.nextInt();
						break;
					case 2:
						s1.frear();
						System.out.println("9 - voltar");
						opicao = entrada.nextInt();
						break;
						
					default:
						break;
					}
				} while (opicao == 5);
				break;
			case 2:
				do {
					System.out.println("1 - aumentar marcha");
					System.out.println("2 -  diminuir marcha");
					opicao = entrada.nextInt();
					switch (opicao) {
					case 1:
						s1.aumentarMarcha();
						System.out.println("9 - voltar");
						opicao = entrada.nextInt();
						break;
					case 2:
						s1.diminuirMarcha();
						System.out.println("9 - voltar");
						opicao = entrada.nextInt();
						break;
					default:
						break;
					}
				} while (opicao == 9);
				break;
				
			default:
				break;
			}
		} while (opicao == 9);

	}

}
