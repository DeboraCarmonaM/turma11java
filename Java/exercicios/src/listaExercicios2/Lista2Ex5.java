package listaExercicios2;

import java.util.Scanner;

public class Lista2Ex5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, numero, x = 0;
		
		do {
			
			System.out.print("Digite um n�mero, por favor: ");
			numero = ler.nextInt();
			soma = soma + numero;
			
		}while(numero != 0);
		
		System.out.printf("\nA soma dos n�mero foi: %d", soma);
		
		
		
	}

}
