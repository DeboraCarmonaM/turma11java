package listaExercicio4;

import java.util.Scanner;

import listaExercicio4.AviaoEx2;

public class Ex2Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as 
		 * informações deste objeto no console.

		 */
		
		AviaoEx2 aviao = new AviaoEx2();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome da companhia aérea: ");
		aviao.companhiaAerea = leia.next();
		System.out.println("Digite o modelo do avião: ");
		aviao.modelo = leia.next();
		System.out.println("Digite a numeração do avião:  ");
		aviao.numeracaoAviao = leia.next();
		System.out.println("Digite o ano de fabricação do avião: ");
		aviao.anoFabricacao = leia.nextInt();
		System.out.println("Digite a quantidade de voos por dia que ele faz:  ");
		aviao.voosDia = leia.nextInt();
		
		System.out.println("\n-------------DADOS DO AVIÃO---------------\n");
		System.out.println("Companhia aérea: " +aviao.companhiaAerea);
		System.out.println("Modelo avião: " +aviao.modelo);
		System.out.println("Numeração: " +aviao.numeracaoAviao);
		System.out.println("Ano de fabricação: " +aviao.anoFabricacao);
		System.out.println("Quantidade de voos por dia: " +aviao.voosDia);
		
		

	}

}
