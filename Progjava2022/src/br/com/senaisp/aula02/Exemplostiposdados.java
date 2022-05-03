package br.com.senaisp.aula02;

import java.util.Scanner;

public class Exemplostiposdados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Aqui estamos fazendo uma soma
		int soma = 5 + 3;
		System.out.println("soma: " + soma) ;
		// Aqui estamos fazendo uma subtração
		int subtracao = 5 - 2;
		System.out.println("Subtração: " + subtracao);
		// Aqui estamos fazendo uma multiplicação
		int multiplicacao = 3 * 2;
		System.out.println("Multiplicação: " + multiplicacao);
		// Aqui estamos fazendo uma divisão inteira ( nesse caso temos 2 inteiros )
		int divisao = 3 / 2;
		System.out.println("Divisão: " + divisao);
		//Aqui estamos fazendo uma divisão
		double divisaof = 3.00 / 2.00;
		System.out.println("Divisão: " + divisaof );
		//Aqui estamos fazendo o resto de uma divisão
		int resto = 3 % 2;
		System.out.println("Resto da divisão: " + resto);
		//Usando somente o print
		System.out.print("Mostrando um valor");
		System.out.print("Outro valor");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome=sc.nextLine();
		System.out.println("Olá" + nome);
	}

}

