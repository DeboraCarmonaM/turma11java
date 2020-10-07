package portugol;

import java.util.Scanner;

public class Lista1Ex5 {

	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 * 
		 */
		
		/*declarando as variaveis que serão utilizadas durante o programa e iniciando a variavel "media" para
		que não ocorra nenhum erro durante o programa*/
		
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media = 0; 
		
		//entrada das notas e a sua inserção na variavel logo depois
		System.out.println("Olá! Insira a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextDouble();
		
		
		//calculo da média ponderada
		media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);
		
		//exibindo a média das notas
		System.out.print("A média das notas é: " +media);
		
		leia.close();
		
	}

}
