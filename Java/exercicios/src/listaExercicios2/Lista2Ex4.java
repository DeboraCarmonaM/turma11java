package listaExercicios;

import java.util.Scanner;

public class Lista2Ex4 {

	public static void main(String[] args) {
		/*
		 * 1-feminino / 2-masculino / 3-Outros
		 * (1, se a pessoa era calma; 2, se a pessoa era 
		 * nervosa e 3, se a pessoa era agressiva).
		 * 150 pessoas
		 * o numero de pessoas calmas
		 * o número de mulheres nervosas; 
		 * o número de homens agressivos; 
		 * o número de outros calmos;
		 * o número de pessoas nervosas 
		 * com mais de 40 anos; 
		 * o número de pessoas calmas com 
		 * menos de 18 anos.
		 * 
		 */
		
		//instanciando o objeto teclado chamado ler pela classe scanner
		Scanner leia = new Scanner(System.in);
		
		//declarar as variaveis
		final int LIMITE = 3; //o limite é 150
		int idade = 0;
		byte sexo = 0;
		byte tipoHumor = 0 ; //(1-feminino / 2-masculino / 3-Outros)
		int totalF = 0, totalM = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, nervosasMaior40 = 0, calmasMenor18 = 0;
		char continua = 'S';
		int contador = 1;
		
		while(contador <= LIMITE) {
			
			System.out.println("--------------SISTEMA DE PESQUISA--------------");
			System.out.println("Olá! Qual a sua idade?");
			idade = leia.nextInt();
			System.out.println("Digite 1-feminino / 2-masculino / 3-Outros: ");
			sexo = leia.nextByte();
			System.out.println("Digite para cada tipo de pessoa: 1- Calma/ 2 - Nervosa/ 3 - Agressiva: ");
			tipoHumor = leia.nextByte();
			
			if(tipoHumor == 1) {
				
				pessoasCalmas = pessoasCalmas + 1;
				
			}
			
			else if(tipoHumor == 2 && sexo == 1) {
				
				mulheresNervosas = mulheresNervosas + 1;
				
			}
			
			if(tipoHumor == 2  && idade > 40) {
				
				nervosasMaior40 = nervosasMaior40  + 1;
				
			}
			
			else if(tipoHumor == 3 && sexo == 2) {
				
				homensAgressivos = homensAgressivos + 1;
				
			}
			
			else if(tipoHumor == 1 && sexo == 3) {
				
				outrosCalmos = outrosCalmos + 1;
			}
			
			if(tipoHumor == 1 && idade < 18) {
				
				calmasMenor18 = calmasMenor18 + 1;
			}
			
			
			contador++;
			
			
			
		}
			System.out.println("Total de mulheres nervosas: " +mulheresNervosas);
			System.out.println("Total de pessoas calmas: " +pessoasCalmas);
			System.out.println("Total de pessoas nervosas com mais de 40: " +nervosasMaior40);
			System.out.println("Total de homens agressivos: " +homensAgressivos);
			System.out.println("Total de outros calmos: " +outrosCalmos);
			System.out.println("Total de calmos menor de 18: " +calmasMenor18);
			
	}
	

}
