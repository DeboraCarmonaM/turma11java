package listaExercicios;

import java.util.Scanner;

public class Lista2Ex2 {

	public static void main(String[] args) {
		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int numero, par = 0, impar = 0, x = 0;
		
		for(x = 0; x < 10; x++) {
			
			System.out.println("Por favor insira o n�mero: ");
			numero = ler.nextInt();
			
			if(numero%2 == 0) {
				
				par = par +1;
			}
			
			else {
				
				impar = impar + 1;
			}
			
			
		}
		
		System.out.printf("\nNo total, temos %d n�meros pares", par);
		System.out.printf(" e %d n�meros impares.", impar);

	}

}
