package br.com.senaisp.aula08;

import java.util.Scanner;

public class Aula08Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intMenor = Integer.MAX_VALUE;
		int intMaior = Integer.MIN_VALUE;
		int intNumero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programas menor maior de n�meros positivos");
		do {
			System.out.println("Digite um n�mero positivo:" + "(Negativo finaliza o programa)");
			                   intNumero = sc.nextInt();
			                   if (intNumero>intMaior) intMaior = intNumero;
			                   if (intNumero<intMenor) intMenor = intNumero;
		} while (intNumero >=0);
		System.out.println("O menor � " + intMenor);
		System.out.println("O maior � " + intMaior);
		sc.close();
		

	}

}
