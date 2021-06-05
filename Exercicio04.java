package br.com.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, sexo = 0, temperamento = 0, numCalma = 0, mNervosa = 0, hAgressivo = 0, numOutrosCalmo = 0,
		pessoasNervosasAcimaQuarenta = 0, pessoasCalmasMenosDezoito = 0, i = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("==== * PESQUISA DE CARACTERÍSTICAS PSICOLÓGICAS * ===== ");

		while (i < 150) {
			System.out.println("Informe a sua idade: ");
			idade = entrada.nextInt();

			System.out.println("Informe o seu sexo: (1 - FEMININO / 2 - MASCULINO / 3 - OUTROS");
			sexo = entrada.nextInt();

			System.out.println("Informe o seu temperamento (1 - CALMA(O) / 2 - NERVOSA(O) / 3 - AGRESSIVA(O)");
			temperamento = entrada.nextInt();

			if (temperamento == 1) {
				numCalma++;
			}

			if (sexo == 1 && temperamento == 2) {
				mNervosa++;
			}

			if (sexo == 2 && temperamento == 3) {
				hAgressivo++;
			}

			if (sexo == 3 && temperamento == 1) {
				numOutrosCalmo++;
			}

			if (temperamento == 2 && idade >= 40) {
				pessoasNervosasAcimaQuarenta++;
			}

			if (temperamento == 1 && idade <= 18) {
				pessoasCalmasMenosDezoito++;
			}
			i++;
		}

		System.out.println("O número de pessoas calma é de: " + numCalma);
		System.out.println("O número de mulheres  nervosas é de : " + mNervosa);
		System.out.println("O número de homens agresivos é de : " + hAgressivo);
		System.out.println("O número de outros calmos é de : " + numOutrosCalmo);
		System.out.println("O número de pessoas nervosas com mais de 40 anos : " + pessoasNervosasAcimaQuarenta);
		System.out.println("O número de pessoas calmas com menos de 18 anos.: " + pessoasCalmasMenosDezoito);

		entrada.close();

	}

}
