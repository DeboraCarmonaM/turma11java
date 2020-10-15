package listaExercicios2;

import java.util.Scanner;

public class Lista2Ex3 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

		 */
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, idadeMenor21 = 0, idadeMaior50 = 0;
		
		System.out.println("Olá! Vamos começar o programa, quando você quiser sair, digite '-99'.");
		
		while(idade != -99) {
			
			System.out.println("\nPor favor digite uma idade: ");
			idade = ler.nextInt();
			
			if(idade < 21) {
				
				idadeMenor21 = idadeMenor21 + 1;			
			}
			
			if(idade > 50) {
				
				idadeMaior50 = idadeMaior50 + 1;			
			}
			
			
		}
		
		System.out.printf("\nNo total, temos %d pessoas com menos de 21", idadeMenor21);
		System.out.printf(" e %d pessoas com mais de 50.", idadeMaior50);
	}

}
