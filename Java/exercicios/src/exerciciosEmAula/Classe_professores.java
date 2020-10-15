package exerciciosEmAula;

import java.util.Scanner;

public class Classe_professores {

	public static void main(String[] args) {
		
		Professores professor1 = new Professores();
		Professores professor2 = new Professores();
		Professores professor3 = new Professores();
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		professor1.nome = leia.next();
		System.out.println("Qual a sua disciplina?");
		professor1.disciplina = leia.next();
		System.out.println("Digite a quantidade de aulas: ");
		professor1.qtdAula = leia.next();
		
		System.out.println("Qual o seu nome?");
		professor2.nome = leia.next();
		System.out.println("Qual a sua disciplina?");
		professor2.disciplina = leia.next();
		System.out.println("Digite a quantidade de aulas: ");
		professor2.qtdAula = leia.next();

		System.out.println("Qual o seu nome?");
		professor3.nome = leia.next();
		System.out.println("Qual a sua disciplina?");
		professor3.disciplina = leia.next();
		System.out.println("Digite a quantidade de aulas: ");
		professor3.qtdAula = leia.next();
		
		
		
	}

}

class Professores{
	
	public String nome;
	public String disciplina;
	public String qtdAula;
	
}