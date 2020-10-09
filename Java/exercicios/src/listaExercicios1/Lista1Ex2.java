package listaExercicios;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		Scanner ler = new Scanner (System. in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Olá! Escreva o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.println("\nEscreva o segundo número: ");
		numero2 = ler.nextInt();
		
		System.out.println("\nEscreva o terceiro número: ");
		numero3 = ler.nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3 && numero3 <= numero2 ) {
			
			System.out.println("A ordem crescente dos números é:" );
			System.out.println("\n" +numero3+ ","  +numero2+ ","  +numero1);
		}
		
		else if(numero2 >= numero1 && numero2 >= numero3 && numero1 <= numero3 ) {
			
			System.out.println("A ordem crescente dos números é:" );
			System.out.print("\n" +numero1+ ","  +numero3+ ","  +numero2);
		}
		
		else if(numero3 >= numero1 && numero3 >= numero2 && numero2 <= numero1){
			
			System.out.println("\n" +numero2+ ","  +numero1+ ","  +numero3);
		}
		
	}

}
