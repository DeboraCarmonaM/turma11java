package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		
		//criar um teclado dentro do programa **estanciou o teclado**
		Scanner tec = new Scanner(System.in); //criou o teclado
		
		String nome;
		int anoNasc, idade = 0;
		double salario;
		
		System.out.println("Escreva o nome do usu�rio: ");
		nome = tec.next();
		System.out.println();
		System.out.print("Escreva o ano de nascimento: ");
		anoNasc = tec.nextInt();
		System.out.println("Escreva o sal�rio: ");
		salario = tec.nextDouble();
		idade = 2020 - anoNasc;
				
		System.out.printf("Oi %s, sua idade � %d em anos e seu sl�rio � %.2f",nome,idade,salario);
		
		tec.close();
		
	}

}
