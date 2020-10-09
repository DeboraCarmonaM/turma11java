package exerciciosEmAula;

import java.util.Scanner;

public class Repeticao1 {

	public static void main(String[] args) {
		/*
		 * mostrar de 0 a 100, enquanto a pessoa quiser
		 */
		
		
		Scanner ler = new Scanner (System.in);
		int numero = 1; 
		char continua = 'S';
		
		
		do {
			
			System.out.println(numero);
			System.out.println("Olá. Você gostaria de continuar? S (sim) ou N (não): ");
			continua = ler.next().toUpperCase().charAt(0); //transformar em maiusculo e em caracter
			numero++;
			
		} while (continua == 'S');
		
	}

}
