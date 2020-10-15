package listaExercicio3;

import java.util.Scanner;

public class Lista3Ex3 {

	public static void main(String[] args) {
		/*
		 *  Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 * 
		 */
		
		Scanner entrada= new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int numeroMaior10 = 0, linha2 = 0, coluna2 = 0;
		
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna]=entrada.nextInt();
				
				if( matriz[linha][coluna] > 10 ) {
					
					 numeroMaior10 = numeroMaior10 + 1;
					 
				}
		              
				
			}
			
		}
		
		if(numeroMaior10 > 1) {
			
			System.out.printf("\nEssa matriz possui %d números maiores do que 10.", numeroMaior10);
			
		}
		
		else if (numeroMaior10 == 1) {
			
			System.out.printf("\nEssa matriz possui 1 número maior do que 10.");
			
		}
		
		else {
			
			System.out.printf("\nEssa matriz não possui números maiores do que 10.");
		}
		
	}

}
