package exerciciosEmAula;

import java.util.Scanner;

public class Janela {
	
	//programa mesmo
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		
		System.out.println("Digite o nome do usuário: ");
		nome = leia.next();
		
		linha(40);
		System.out.println("         " +nome+"\n");
		linha(40);
		
		for (int y = 10; y < 30; y++) {
			
			linha(y);
		}
				
		
	}
	
	//terminou o programa
	
	public static int soma2(int x, int y) {
		
		return x + y;
		
	}
	
	public static void soma(int x, int y) {
		
		System.out.println(x + y);
	}
	
	public static void linha(int tamanho) {
		
		for(int x =1; x < tamanho; x++) {
			
			System.out.print("-");
			
		}
		
		System.out.println();
		
	}
}
