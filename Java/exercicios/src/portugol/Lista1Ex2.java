package portugol;

import java.util.Scanner;

public class Lista1Ex2 {

	public static void main(String[] args) {
		/*
		 * inteiro idadeDias

		escreva("Qual a sua idade em dias?? ")
		leia(idadeDias)

		inteiro idadeAnos = idadeDias / 365
		inteiro idadeMeses1 = idadeDias - (idadeAnos * 365) 
		inteiro idadeMeses2 = idadeMeses1 / 30
		inteiro idadeDiasFim = idadeMeses1 - idadeMeses2 * 30

		

		escreva("\n Você tem ", idadeAnos, " anos")
		escreva("\n ", idadeMeses2, " meses")
		escreva("\n ", idadeDiasFim, " dias")
		 */
		
		Scanner leia = new Scanner(System.in);
		int idadeDias, idadeAnos, idadeMeses1, idadeMeses2, idadeDiasFim;
		
		System.out.println("Qual a sua idade em dias?? ");
		idadeDias = leia.nextInt();
		
		idadeAnos = idadeDias / 365;
		idadeMeses1 = idadeDias - (idadeAnos * 365);
		idadeMeses2 = idadeMeses1 / 30;
		idadeDiasFim = idadeMeses1 - idadeMeses2 * 30;
		
		System.out.print("Você tem " +idadeAnos+ " anos, ");
		System.out.print(idadeMeses2+ " meses e ");
		System.out.print(idadeDiasFim+ " dias.");
		
		
		
		

	}

}
