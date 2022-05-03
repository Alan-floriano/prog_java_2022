package br.com.senaisp.aula02;

import java.util.Scanner;

public class CalculoBhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Calculo de BhasKara");
        System.out.println("Digite o valor de A:");
        Scanner sc = new Scanner(System.in);
        int intA = sc.nextInt();
        		 System.out.println("Digite o valor de B:");
        int intB = sc.nextInt();
        		 System.out.println("Digite o valor de C:");
        int intC = sc.nextInt();
        //Calculando Delta
        double dblDelta = Math.pow(intB, 2) - 4 * intA * intC;
        System.out.println("O valor de delta é: " + dblDelta);
        //Calculando X1
        double dblX1 = (-intB + Math.sqrt(dblDelta)) / (2 * intA);
        System.out.println("O valor de X1 é :" + dblX1);
        //Calculando X2
        double dblX2 = (-intB - Math.sqrt(dblDelta)) / (2 * intA);
        System.out.println("O valor de X2 é :" + dblX2);		
	}

}
