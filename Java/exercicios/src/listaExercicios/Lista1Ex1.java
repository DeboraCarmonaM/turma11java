package listaExercicios;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba tr�s 
		 * inteiros e diga qual deles � o maior.
		 * 
		 */
		
		Scanner ler = new Scanner (System. in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Ol�! Informe o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.print("\nInforme o segundo n�mero: ");
		numero2 = ler.nextInt();
		
		System.out.print("\nInforme o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		//testando qual � o maior n�mero atrav�s das condicionais 
		if(numero1 > numero2 && numero1 > numero3) {
			
			System.out.printf("\nO maior n�mero �: %d", numero1);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			
			System.out.printf("\nO maior n�mero �: %d", numero2);
		}
		
		else {
			
			System.out.printf("\nO maior n�mero �: %d", numero3);
		}
		
	}

}
