package listaExercicios2;

import java.util.Scanner;

public class Lista2Ex6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int numero, media = 0, somaNum = 0, contador = 0;
		
		do {
			
			System.out.println("Digite um n�mero: ");
			numero = ler.nextInt();
			
			if(numero %3 == 0 && numero != 0) {
				
				somaNum = somaNum + numero;
				contador++;
			}
			
		}while(numero != 0);
		
		media = somaNum / contador;
		
		System.out.printf("A m�dia dos n�meros m�ltiplos de 3 que foram digitados �: %d", media);

	}

}
