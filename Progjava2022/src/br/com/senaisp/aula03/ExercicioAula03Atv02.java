package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Converss�o de celsius para fahrenheint
		System.out.println("Digite a temperatura a ser convertida:");
		Scanner sc = new Scanner(System.in);
		double dblTemp = sc.nextDouble ();
		
		double dblConv = 9 *  dblTemp / 5 + 32;
		System.out.println("Valor �:" +dblConv);
		//Calcular em uma variav�l
		double dblTempF = 9 * dblTemp / 5 + 32;
		System.out.println("Atemperatura de Fahrenheint � " + dblTempF);
	}

}
