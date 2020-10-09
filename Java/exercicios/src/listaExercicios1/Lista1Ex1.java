package listaExercicios;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba três 
		 * inteiros e diga qual deles é o maior.
		 * 
		 */
		
		Scanner ler = new Scanner (System. in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Olá! Informe o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.print("\nInforme o segundo número: ");
		numero2 = ler.nextInt();
		
		System.out.print("\nInforme o terceiro número: ");
		numero3 = ler.nextInt();
		
		//testando qual é o maior número através das condicionais 
		if(numero1 > numero2 && numero1 > numero3) {
			
			System.out.printf("\nO maior número é: %d", numero1);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			
			System.out.printf("\nO maior número é: %d", numero2);
		}
		
		else {
			
			System.out.printf("\nO maior número é: %d", numero3);
		}
		
	}

}
