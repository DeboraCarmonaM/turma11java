package listaExercicio4;

import listaExercicio4.ClienteEx1;
import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe cliente e apresente os atributos e métodos 
		 * referentes esta classe, em seguida crie um objeto cliente, 
		 * defina as instancias deste objeto e apresente as informações
		 *  deste objeto no console.

		 */
		
		ClienteEx1 cliente = new ClienteEx1();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá! Digite o nome do responsável: ");
		cliente.nome = leia.next();
		System.out.println("Digite o nome da empresa: ");
		cliente.empresa = leia.next();
		System.out.println("Informe a cidade da empresa:  ");
		cliente.cidade = leia.next();
		System.out.println("Digite o email da empresa:  ");
		cliente.email = leia.next();
		
		
		System.out.println("\nDADOS DA PRIMEIRA EMPRESA\n");
		System.out.println("Nome da empresa: " +cliente.empresa);
		System.out.println("Nome responsável empresa: " +cliente.nome);
		System.out.println("Cidade: " +cliente.cidade);
		System.out.println("E-mail: " +cliente.email);
		
	}

}
