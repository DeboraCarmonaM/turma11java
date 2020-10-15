package listaExercicios2;

import java.util.Scanner;

public class Lista2Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		 * No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, numero, x = 0;
		
		do {
			
			System.out.print("Digite um número, por favor: ");
			numero = ler.nextInt();
			soma = soma + numero;
			
		}while(numero != 0);
		
		System.out.printf("\nA soma dos número foi: %d", soma);
		
		
		
	}

}
