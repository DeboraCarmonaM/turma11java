package listaExercicios1;

import java.util.Scanner;

public class Lista1Ex4 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este 
		 * n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for 
		 * �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		Scanner ler = new Scanner (System.in);
		
		double numero, par = 0, impar = 0;
		
		System.out.println("Ol�! Insira um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero %2 == 0) {
			
			par = (int) Math.sqrt(numero);
			System.out.println("� par. \n" +par);
			
			
		}
		
		else {
			
			impar = (int) Math.pow(numero,2);
			System.out.println("� �mpar. \n" +impar);
		}
	}

}
