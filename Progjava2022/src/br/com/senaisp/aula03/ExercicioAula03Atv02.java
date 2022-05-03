package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Converssão de celsius para fahrenheint
		System.out.println("Digite a temperatura a ser convertida:");
		Scanner sc = new Scanner(System.in);
		double dblTemp = sc.nextDouble ();
		
		double dblConv = 9 *  dblTemp / 5 + 32;
		System.out.println("Valor é:" +dblConv);
		//Calcular em uma variavél
		double dblTempF = 9 * dblTemp / 5 + 32;
		System.out.println("Atemperatura de Fahrenheint é " + dblTempF);
	}

}
