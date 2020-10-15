package listaExercicio3;

import java.util.Scanner;

public class TesteMatrizFor {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1, coluna+1);
				matriz[linha][coluna]=entrada.nextInt();
			}
		}
			
		
		

	}

}
