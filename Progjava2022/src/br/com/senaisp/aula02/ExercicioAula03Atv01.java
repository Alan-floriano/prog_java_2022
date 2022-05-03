package br.com.senaisp.aula02;

import java.util.Scanner;

public class ExercicioAula03Atv01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite uma atividade de até 3 dígitos:");
		Scanner sc = new Scanner(System.in);
		int intValor = sc.nextInt();
		int intCentena = intValor / 100;
		int intDezena = intValor % 100 /10;
		int intUnidade = intValor % 10;
		int intValorInvertido = intUnidade * 100 +
				intDezena * 10 +
				intCentena;
		System.out.println("Valor invertido é:" + intValorInvertido);

	}

}
