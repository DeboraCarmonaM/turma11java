package listaExercicio4;

import java.util.Scanner;

import listaExercicio4.AviaoEx2;

public class Ex2Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as 
		 * informa��es deste objeto no console.

		 */
		
		AviaoEx2 aviao = new AviaoEx2();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome da companhia a�rea: ");
		aviao.companhiaAerea = leia.next();
		System.out.println("Digite o modelo do avi�o: ");
		aviao.modelo = leia.next();
		System.out.println("Digite a numera��o do avi�o:  ");
		aviao.numeracaoAviao = leia.next();
		System.out.println("Digite o ano de fabrica��o do avi�o: ");
		aviao.anoFabricacao = leia.nextInt();
		System.out.println("Digite a quantidade de voos por dia que ele faz:  ");
		aviao.voosDia = leia.nextInt();
		
		System.out.println("\n-------------DADOS DO AVI�O---------------\n");
		System.out.println("Companhia a�rea: " +aviao.companhiaAerea);
		System.out.println("Modelo avi�o: " +aviao.modelo);
		System.out.println("Numera��o: " +aviao.numeracaoAviao);
		System.out.println("Ano de fabrica��o: " +aviao.anoFabricacao);
		System.out.println("Quantidade de voos por dia: " +aviao.voosDia);
		
		

	}

}
