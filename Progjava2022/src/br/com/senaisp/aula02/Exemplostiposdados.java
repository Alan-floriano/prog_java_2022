package br.com.senaisp.aula02;

import java.util.Scanner;

public class Exemplostiposdados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Aqui estamos fazendo uma soma
		int soma = 5 + 3;
		System.out.println("soma: " + soma) ;
		// Aqui estamos fazendo uma subtra��o
		int subtracao = 5 - 2;
		System.out.println("Subtra��o: " + subtracao);
		// Aqui estamos fazendo uma multiplica��o
		int multiplicacao = 3 * 2;
		System.out.println("Multiplica��o: " + multiplicacao);
		// Aqui estamos fazendo uma divis�o inteira ( nesse caso temos 2 inteiros )
		int divisao = 3 / 2;
		System.out.println("Divis�o: " + divisao);
		//Aqui estamos fazendo uma divis�o
		double divisaof = 3.00 / 2.00;
		System.out.println("Divis�o: " + divisaof );
		//Aqui estamos fazendo o resto de uma divis�o
		int resto = 3 % 2;
		System.out.println("Resto da divis�o: " + resto);
		//Usando somente o print
		System.out.print("Mostrando um valor");
		System.out.print("Outro valor");
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite seu nome:");
		String nome=sc.nextLine();
		System.out.println("Ol�" + nome);
	}

}

