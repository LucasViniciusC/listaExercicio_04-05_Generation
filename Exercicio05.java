package br.com.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0, soma = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("== * Informe os números (E aperte 0 para finalizar a soma) * ===");

		do {
			numero = entrada.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("A soma dos valores inseridos é de: " + soma);

		entrada.close();
	}

}
