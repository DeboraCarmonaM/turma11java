package exerciciosEmAula;

import java.util.Scanner;

public class TrocaValoresDuasVariaveis {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int a=0,b=0, c=0;
		System.out.print("Leia A:");
		a = leia.nextInt();
		System.out.print("Leia B:");
		b = leia.nextInt();
		
		System.out.println("Valores antes da inversão: A  "+a+"; B "+b);
		
		a ^= b; // 5 + 4 = 9
		b ^= a; // 5 - 4 = 5
		a ^= b; // 5 - 1 = 4
				
		
		System.out.println("Valores depois da inversão: A  "+a+"; B "+b);
		leia.close();



	}

}
