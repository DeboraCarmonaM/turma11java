package listaExercicios;

import java.util.Scanner;

public class Lista2Ex2 {

	public static void main(String[] args) {
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int numero, par = 0, impar = 0, x = 0;
		
		for(x = 0; x < 10; x++) {
			
			System.out.println("Por favor insira o número: ");
			numero = ler.nextInt();
			
			if(numero%2 == 0) {
				
				par = par +1;
			}
			
			else {
				
				impar = impar + 1;
			}
			
			
		}
		
		System.out.printf("\nNo total, temos %d números pares", par);
		System.out.printf(" e %d números impares.", impar);

	}

}
