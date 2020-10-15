package exerciciosEmAula;

import java.util.Scanner;

public class VetorTimesFutebol {

	public static void main(String[] args) {
		/*
		 * VETOR COM OS 4 TIMES DE SÃO PAULO
			CORINTHIANS
			PALMEIRAS
			SPFC
			SANTOS
			GANHA - 3 PONTOS
			EMPATA - 1 PONTO
			PERDE - 0 PONTO
			PRIMEIRA RODADA
			CADA TIME SE GANHOU, PERDEU OU EMPATOU
			MOSTRA A PONTUAÇÃO DA PRIMEIRA RODADA
			SEGUNDA RODADA
			RESULTADOS JÁ COM A SEGUNDA RODADA
			TERCEIRA RODADA - MESMA COISA

		 */
		
		Scanner ler = new Scanner(System.in);
		
		String times[] = {"Corinthians", "Palmeiras" , "SPFC", "Santos"};
		int pontos[] = {0,0,0,0}, x = 0, respostaPartida = 0;
		
		
		do {
				System.out.printf("Rodada %d", x+1 ,"\n");
				System.out.print("Se o time" +times+ "ganhou digite (1) se empatou (2) se perdeu (3). ");
				respostaPartida = ler.nextInt();
				
				if(respostaPartida == 1) {
					
					
					
					
				}
		
			for( x = 0; x < times.length; x++) {
				
				
				System.out.printf("Time - %s Pontos %d", times[x], pontos[x]);
				
				
			}
			
			x++;
				
		}while(x < times.length);
		
			
			
		
		
		
		
		
		
		

	}

}
