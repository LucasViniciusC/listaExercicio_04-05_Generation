package br.com.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, numero = 0, numPar = 0, numImpar = 0;

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Informe os n�mero: ");
			
			for (i = 0; i <= 10; i++) {
				numero = entrada.nextInt();
				
				if(numero % 2 == 0) {
					numPar++;
				}else {
					numImpar++;
				}
			}

			System.out.println("O total de n�mero pares foi de: " + numPar);
			System.out.println("O total de n�mero Impares foi de: " + numImpar);
			
			entrada.close();
		}
	}

}
