package listaExercicio4;

import java.util.Scanner;

import listaExercicio4.PatineteEx5;

public class Ex5Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe,
		 *  em seguida crie um objeto patinete, defina as instancias deste objeto 
		 *  e apresente as informa��es deste objeto no console.

		 */
		
		
		PatineteEx5 patinete = new PatineteEx5();
		Scanner leia = new Scanner(System.in);
		String tipo; //variavel auxiliar
		
		System.out.println("Digite a cor do patinete: ");
		patinete.cor = leia.next();
		System.out.println("Digite 1- para patinete el�trico e 2- para patinete convencional: ");
		patinete.tipoPatinete = leia.nextInt();
		System.out.println("Digite o valor: ");
		patinete.precoPatinete = leia.nextInt();
		
		if(patinete.tipoPatinete==1) {
			
			tipo = "El�trico" ;
			
		}
		
		else {
			
			tipo = "Convencional";
		}
		
		System.out.println("\n----------------------INFORMA��ES SOBRE O PATINETE----------------------\n");
		System.out.println("Cor: " +patinete.cor);
		System.out.println("Tipo: " +tipo);
		System.out.println("Pre�o: R$" +patinete.precoPatinete);
		
	}

}
