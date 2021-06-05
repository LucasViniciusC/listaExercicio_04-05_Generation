package br.com.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, jovem = 0, maiorIdade = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe as idades: ");
		
		while (idade != 99) {
			idade = entrada.nextInt();
			if (idade <= 21) {
				jovem++;
			} else if (idade >= 50 && idade <= 98) {
				maiorIdade++;
			}
		}
		System.out.println("O número de idades inseridas menores do que 21 anos foi de: " + jovem);
		System.out.println("O número de idades inseridas maiores do que 50 anos foi de: " + maiorIdade);
		
		entrada.close();
	}

}
