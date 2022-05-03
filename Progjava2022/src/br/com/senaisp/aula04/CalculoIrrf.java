package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoIrrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Programa de calculo do irrf:");
		System.out.println("Digite o salario base (acima de 5.000,00):");
		Scanner sc = new Scanner(System.in);
		double dblSalarioBase = sc.nextDouble ();
		System.out.println("Digite o número de dempendentes:");
		int intNrDependentes = sc.nextInt();
		double dblIrrfBase = dblSalarioBase - intNrDependentes * 189.9 - 828.38;
		dblIrrfBase = dblIrrfBase * 27.5 / 100.00 - 869.36;
		System.out.println("A base de calculo do Irrf é " + dblIrrfBase);
		System.out.println("O valor do Irrf é " + dblIrrfBase);
		
		
	}

}
