package listaExercicios2;

import java.util.Scanner;

public class Lista2Ex6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado.
		 *  E no final imprimir a média dos números múltiplos de 3. 
		 *  Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner ler = new Scanner(System.in);
		
		int numero, media = 0, somaNum = 0, contador = 0;
		
		do {
			
			System.out.println("Digite um número: ");
			numero = ler.nextInt();
			
			if(numero %3 == 0 && numero != 0) {
				
				somaNum = somaNum + numero;
				contador++;
			}
			
		}while(numero != 0);
		
		media = somaNum / contador;
		
		System.out.printf("A média dos números múltiplos de 3 que foram digitados é: %d", media);

	}

}
