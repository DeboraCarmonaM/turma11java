package portugol;

import java.util.Scanner;

public class Lista1Ex8 {

	public static void main(String[] args) {
		/*
		 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
		 *  percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		 *  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 *  escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 

		 */
		 
		Scanner leia = new Scanner(System.in);
		
		//declarando e iniciando as variaveis
		double valorFabrica, distribuidor = 0.28, impostos = 0.45, valorFinal = 0;
		
		//usuario inserindo o valor de fábrica do carro
		System.out.println("Olá! Qual o custo de fábrica do carro? ");
		valorFabrica = leia.nextInt();
		
		//calculando o valor final do carro
		valorFinal = valorFabrica + (valorFabrica * distribuidor) + (valorFabrica * impostos);
		
		//exibindo o valor final do carro
		System.out.print("O valor final do carro é: R$" +valorFinal);
		
		//finalizando o teclado
		leia.close();
		

	}

}
