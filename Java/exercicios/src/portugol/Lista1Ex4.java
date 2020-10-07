package portugol;

import java.util.Scanner;

public class Lista1Ex4 {

	public static void main(String[] args) {
		/*
		 *  Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: 
			, onde  
			
			D=R+S/2 onde R = (A+B)^2 S = (B+C)^2
			
		 * 
		 */
		
		Scanner leia = new Scanner(System.in);
		int a, b, c, d=0, r=0, s=0, x = 0, y = 0;
		
		System.out.println("Insira o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Insira o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Insira o valor de c: ");
		c = leia.nextInt();
		
		x = (a+b);
		r = (int) Math.pow(x,2);
		
		y = (b+c);
		s = (int) Math.pow(y,2);
		
		d= (r+s)/2;
		
		System.out.print("O valor da expressão é: " +d);
		
		
		leia.close();

	}

}
