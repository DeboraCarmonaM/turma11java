package exerciciosEmAula;

import java.util.Scanner;

public final class ListaAlunos {
	
	/*
	 * usuário escolhe código do aluno e informa qual é a sua nota, após isso a nota é inserida na lista e a lista é exibida, 
	 * então o usuário informa se deseja continuar ou não,
	 * se deseja informamos de novo a lista e pedidos para escolher um código
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		final int LIMITE = 38;
		String nome [] = {"Bruna dos Santos", "Bruno Correia da Costa", "Bruno de Freitas Sousa", "Carla Cristina Conceição de Paula", "Christian Garcia Amantino", "Cleiton Ortega dos Santos", "Debora Miranda Carmona", "Everton Luiz Rosário de Oliveira", "Gabriel Reis Ritter", "Gildenor Junior da Silva Costa", "Guilherme Marcionilo Pedroso do Rosario Silva", "Herick Willians Canhete Rocha", "Jacqueline Alves Barbosa", "João Victor dos Santos Rigoleto", "Jonas De Oliveira Santos", "Jonathan Cavalcanti De Paula", "Juliana Cavalaro de Oliveira", "Karina Soares Lima", "Larissa Meira Dominguez", "Leonardo Iamur Terra", "Lysandro Andrade Martin", "Matheus Araujo de moraes", "Matheus Fernandes Rodrigues", "Matheus Trindade Torok", "Mônica dos santos ribeiro", "Natália Lopes moreno", "Phelipe Almeida de Souza", "Rafaela de Albuquerque", "Ricardo Martins Corrêa", "Sarah Lidia De Oliveira Braia", "Stefanie Dias Costa", "Tiago Diniz Gomes", "Victor Augusto de Souza Tavares", "Vivian Rodrigues Nakano", "Washington pereira dos santos", "Wellington Vieira", "Wesley Bueno da Silva", "Yago Tonoli Domingues", "Zaine de Queiros Jesus"};
		int  codigo [] = {}; 
		int y = 0;
		
		for(int x = 1; x <= LIMITE; x++) {
			
			codigo [y] = x;
			
			System.out.println(codigo+ ", ");
			
		}
		
		
		
		/*System.out.println();
		
		do {
			
			for (int i = 0; i < nome.length; i ++) {
				
				
				
				
			}
		}while(opc == 'S' || opc == 's');*/
		
		

	}

}
