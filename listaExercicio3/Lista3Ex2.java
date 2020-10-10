package listaExercicio3;

import java.util.Scanner;


public class Lista3Ex2 {

	public static void main(String[] args) {
		/*
		 * 2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  ok
			• A soma dos números pares digitados; ok
			• Os números ímpares digitados; ok
			• A quantidade de números ímpares digitados. ok

		 */
		
		Scanner ler = new Scanner(System.in);
		int numero,  somaImpar = 0, somaPar = 0, x = 0, par = 1;
		int[] pares = new int [6];
		int[] impar = new int [6];
		
		
		for( x = 0; x < 6; x++) {
			
			System.out.println("Digite um número: ");
			
			numero = ler.nextInt();
			
			if(numero%2 == 0) {
				
				pares [x] = numero;
				somaPar = somaPar + numero;
				par = par + 1;
				
			}
			
			else{
				
				impar [x] = numero;
				somaImpar = somaImpar + 1;
						
				}

		}
		
		System.out.print("\nOs números pares digitados foram: ");
		
		for(x = 0; x < pares.length; x++) {
			
			System.out.print(pares[x]+ ", ");
		}
		
		
		System.out.print("\nOs números impares digitados foram: ");
				
		for(x = 0; x < impar.length; x++) {
			
			System.out.print( +impar[x]+ ", ");
			
		}
		
		System.out.print("\nA soma dos números pares é: " +somaPar);
		System.out.print("\nA quantidade de número impares digitados foi: " +somaImpar);

	}

}
