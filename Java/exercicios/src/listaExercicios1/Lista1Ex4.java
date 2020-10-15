package listaExercicios1;

import java.util.Scanner;

public class Lista1Ex4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este 
		 * número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for 
		 * ímpar exiba o número elevado ao quadrado.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		double numero, par = 0, impar = 0;
		
		System.out.println("Olá! Insira um número: ");
		numero = ler.nextDouble();
		
		if(numero %2 == 0) {
			
			par = (int) Math.sqrt(numero);
			System.out.println("É par. \n" +par);
			
			
		}
		
		else {
			
			impar = (int) Math.pow(numero,2);
			System.out.println("É ímpar. \n" +impar);
		}
	}

}
