package listaExercicio4;

import java.util.Scanner;

import listaExercicio4.FuncionarioEx4;

public class Ex4Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe,
		 *  em seguida crie um objeto funcion�rio, defina as instancias deste objeto 
		 *  e apresente as informa��es deste objeto no console.

		 */
		
		FuncionarioEx4 funcionario = new FuncionarioEx4();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.nomeFuncionario = leia.next();
		System.out.println("Digite F-feminino, M-masculino ou O-Outros: ");
		funcionario.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite a idade do funcion�rio: ");
		funcionario.idade = leia.nextInt();
		System.out.println("Digite a fun��o funcion�rio: ");
		funcionario.funcao = leia.next();
		System.out.println("Digite o sal�rio do funcion�rio: ");
		funcionario.salario = leia.nextInt();
		
		System.out.println("\n----------------------DADOS DO FUNCION�RIO----------------------\n");
		System.out.println("Nome do funcion�rio: " +funcionario.nomeFuncionario);
		System.out.println("Idade: " +funcionario.idade);
		System.out.println("G�nero: " +funcionario.genero);
		System.out.println("Fun��o: " +funcionario.funcao);
		System.out.print("Sal�rio: R$" +funcionario.salario);
		
	}

}
