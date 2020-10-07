package portugol;

import java.util.Scanner;

public class Lista1Ex6 {

	public static void main(String[] args) {
		
		/*
		 * Construa um programa em que, tendo como dados de entrada dois pontos quaisquer no plano, 
		 * P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 

		 * 		d= raiz de (x2-x1)^2 + (y2 - y1)^2
		 */
		
		Scanner leia = new Scanner(System.in);
		
		/*declarando as variaveis que serão utilizadas durante o programa e iniciando a variavel "distancia" para
		que não ocorra nenhum erro durante o programa*/
		int x1, x2, y1, y2, distancia = 0;
		
		//entrada dos pontos e a sua inserção na variavel logo depois
		System.out.println("Olá! Escreva o x1: ");
		x1 = leia.nextInt();
		
		System.out.println("Escreva o y1: ");
		y1 = leia.nextInt();
		
		System.out.println("Escreva o x2: ");
		x2 = leia.nextInt();
		
		System.out.println("Escreva o y2: ");
		y2 = leia.nextInt();
		
		//calculo da distancia
		
		distancia = (int) Math.sqrt ((int) (Math.pow((x2-x1),2)+ Math.pow((y2-y1),2)));
		
		//exibindo a distância
		
		System.out.print("A distância entre os pontos é: " +distancia);
		
		leia.close();
		

	}

}
