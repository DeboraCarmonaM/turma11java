package portugol;

import java.util.Scanner;

public class Lista1Ex5 {

	public static void main(String[] args) {
		/*
		 * Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
		 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. 
		 * 
		 */
		
		/*declarando as variaveis que ser�o utilizadas durante o programa e iniciando a variavel "media" para
		que n�o ocorra nenhum erro durante o programa*/
		
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, media = 0; 
		
		//entrada das notas e a sua inser��o na variavel logo depois
		System.out.println("Ol�! Insira a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextDouble();
		
		
		//calculo da m�dia ponderada
		media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);
		
		//exibindo a m�dia das notas
		System.out.print("A m�dia das notas �: " +media);
		
		leia.close();
		
	}

}
