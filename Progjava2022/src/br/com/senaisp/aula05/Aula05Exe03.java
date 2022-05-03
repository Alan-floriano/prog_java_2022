package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculo de emprestimo da PM de Bauru:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do salário bruto:");
		double dblSalario = sc.nextDouble();
		System.out.println("Digite o valor da parcela a ser contratada:");
		double dblParcela = sc.nextDouble();
		//Verificando se é possível contrair a divida ;-)
		if (dblSalario * 30 / 100.00>=dblParcela)
			System.out.println("Párabéns seu empréstimo foi aprovado! :-(");
			
		

	}

}
