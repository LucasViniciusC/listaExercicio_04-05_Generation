package br.com.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int x, soma = 0, cont = 0;
		double media;
		System.out.println("Programa: média dos múltiplos de 3. O programa encerra quando você digita 0.");
		do {
			System.out.println("Digite um número: ");
			x = in.nextInt();

			if (x % 3 == 0) {
				soma += x;
				cont++;
			}
		} while (x != 0);

		in.close();

		media = soma / cont;

		System.out.println("A média dos múltiplos de 3 é " + media);
	}

}
