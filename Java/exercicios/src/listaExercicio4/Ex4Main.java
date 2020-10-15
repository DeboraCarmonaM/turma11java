package listaExercicio4;

import java.util.Scanner;

import listaExercicio4.FuncionarioEx4;

public class Ex4Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe,
		 *  em seguida crie um objeto funcionário, defina as instancias deste objeto 
		 *  e apresente as informações deste objeto no console.

		 */
		
		FuncionarioEx4 funcionario = new FuncionarioEx4();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nomeFuncionario = leia.next();
		System.out.println("Digite F-feminino, M-masculino ou O-Outros: ");
		funcionario.genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Digite a idade do funcionário: ");
		funcionario.idade = leia.nextInt();
		System.out.println("Digite a função funcionário: ");
		funcionario.funcao = leia.next();
		System.out.println("Digite o salário do funcionário: ");
		funcionario.salario = leia.nextInt();
		
		System.out.println("\n----------------------DADOS DO FUNCIONÁRIO----------------------\n");
		System.out.println("Nome do funcionário: " +funcionario.nomeFuncionario);
		System.out.println("Idade: " +funcionario.idade);
		System.out.println("Gênero: " +funcionario.genero);
		System.out.println("Função: " +funcionario.funcao);
		System.out.print("Salário: R$" +funcionario.salario);
		
	}

}
