package listaExercicios;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		Scanner ler = new Scanner (System. in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Ol�! Escreva o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.println("\nEscreva o segundo n�mero: ");
		numero2 = ler.nextInt();
		
		System.out.println("\nEscreva o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3 && numero3 <= numero2 ) {
			
			System.out.println("A ordem crescente dos n�meros �:" );
			System.out.println("\n" +numero3+ ","  +numero2+ ","  +numero1);
		}
		
		else if(numero2 >= numero1 && numero2 >= numero3 && numero1 <= numero3 ) {
			
			System.out.println("A ordem crescente dos n�meros �:" );
			System.out.print("\n" +numero1+ ","  +numero3+ ","  +numero2);
		}
		
		else if(numero3 >= numero1 && numero3 >= numero2 && numero2 <= numero1){
			
			System.out.println("\n" +numero2+ ","  +numero1+ ","  +numero3);
		}
		
	}

}
