package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Identificando se o numero e par ou impar
		System.out.println("Indentificando se o número é par ou impar");
		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int intNum = sc.nextInt();
		if (intNum % 2 == 0) {
			System.out.println("É par");
		} else {
			System.out.println("É impar");
		}
		
		
		
		
		
		
	}

}
