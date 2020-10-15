package aplicacao;

import java.util.Scanner;

import entidades.Professor;

import entidades.Alunos;

public class CadEscolar {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in); //classe letra maiúscula
		Professor primeiro = new Professor();//ctrl + shift + o
		Alunos alune1 = new Alunos(); 
		char info; //variavel auxiliar para primeiro.convidade
		
		/*System.out.print("Digite o nome: ");
		primeiro.nome = leia.next().toUpperCase();
		System.out.print("Digite o gênero M-masculino, F-feminino ou O-outros: ");
		primeiro.opc = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a especialidade: ");
		primeiro.especialidade = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento do professor: ");
		primeiro.anoNasc = leia.nextInt();
		System.out.print("O professor é F-fixo ou C-convidado:  ");
		info = leia.next().toUpperCase().charAt(0);
		if (info == 'C') {
			
			primeiro.convidado = true;
		}
		
		else {
			
			primeiro.convidado = false;
		}*/
		
		
		System.out.print("Digite o nome do alune: ");
		alune1.nomeAlune = leia.next().toUpperCase();
		System.out.print("Digite o curso: ");
		alune1.curso = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento do alune: ");
		alune1.anoNascAlune = leia.nextInt();
		System.out.print("Digite a nota:  ");
		alune1.nota = leia.nextDouble();
		
		
		/*System.out.println("Dados do primeiro professor: ");
		System.out.println("Nome: " +primeiro.nome);
		System.out.print("Sexo: ");
		System.out.println((primeiro.opc=='F')?"Feminino":(primeiro.opc=='M')?"Masculino": "Outros");
		System.out.println("Idade: " +(2020-primeiro.anoNasc));*/
		
		
		System.out.println("\nDados do primeiro alune: ");
		System.out.println("\nNome: " +alune1.nomeAlune);
		System.out.println("Curso: " +alune1.curso);
		System.out.println("Idade: " +(2020-alune1.anoNascAlune));
		System.out.println("Sua nota é: " +alune1.nota);
		
		if(alune1.nota >= 5) {
					
					System.out.println("Você foi aprovade.");
					
					
				}
				
				else {
					
					System.out.println("Você foi reprovade.");
					
				}
		
		
		leia.close(); //metodo letra minúscula

	}

}
