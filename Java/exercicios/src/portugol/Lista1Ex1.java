package portugol;

import java.util.Scanner;

public class Lista1Ex1 {

	public static void main(String[] args) {
		/*
		 *  inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias 

		escreva("Quantos anos voc� tem? ")
		leia(idadeAnos)

		escreva("Quantos meses? ")
		leia(idadeMeses)

		escreva("Quantos dias? ")
		leia(idadeDias)

		inteiro TotalIdadeDias = ( (idadeAnos * 365) + (idadeMeses * 30) + idadeDias )

		escreva("\nA sua idade em dias �: " +TotalIdadeDias)
		 */
		
		Scanner leia = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, totalDias;
		
		System.out.println("Quantos anos voc� tem?");
		idadeAnos = leia.nextInt();
		
		System.out.println("Quantos meses?");
		idadeMeses = leia.nextInt();
		
		System.out.println("Quantos dias?");
		idadeDias = leia.nextInt();
		
		totalDias = ( (idadeAnos * 365) + (idadeMeses * 30) + idadeDias);
		System.out.print("A sua idade em dias �: " +totalDias);
		
		leia.close();

	}

}
