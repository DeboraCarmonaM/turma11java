package portugol;

import java.util.Scanner;

public class Lista1Ex3 {

	public static void main(String[] args) {
		
		/*
		 * 	inteiro duracaoSegundos

			escreva("Qual a duração do evento em segundos? ")
			leia(duracaoSegundos)

			inteiro tempoHoras = duracaoSegundos / 3600 
			inteiro tempoMinutos1 = duracaoSegundos - (tempoHoras * 3600)
			inteiro tempoMinutos2 = tempoMinutos1 / 60
			inteiro tempoSegundos = tempoMinutos1 - (tempoMinutos2 * 60)
			
			escreva("\n O evento tem: ", tempoHoras, " horas")
			escreva("\n ", tempoMinutos2, " minutos")
			escreva("\n ", tempoSegundos, " segundos")
		 */
		
		Scanner leia = new Scanner(System.in);
		int duracaoSegundos,tempoHoras,tempoMinutos1,tempoMinutos2,tempoSegundos;
		
		System.out.println("Qual o tempo de duração em segundos?? ");
		duracaoSegundos = leia.nextInt();
		
		tempoHoras = duracaoSegundos / 3600; 
		tempoMinutos1 = duracaoSegundos - (tempoHoras * 3600);
	    tempoMinutos2 = tempoMinutos1 / 60;
		tempoSegundos = tempoMinutos1 - (tempoMinutos2 * 60);
		
		System.out.print("O evento tem: " +tempoHoras+ " hora(s)");
		System.out.print(", " +tempoMinutos2+ " minuto(s)");
		System.out.print(" e " +tempoSegundos+ " segundo(s).");
		
		leia.close();
	}

	}


