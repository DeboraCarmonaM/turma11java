programa
{
	/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	 *  Encontre após a maior pontuação e a apresente.*/
	
	funcao inicio()
	{
		inteiro pontMaior = 0, pontuacao[5]
		
		

		para (inteiro x= 0; x < 5; x++){
	
			escreva("Digite a sua pontuação: ")
			leia(pontuacao[x])
			escreva("\n")

			se(pontuacao[x] > pontMaior){

				pontMaior = pontuacao[x]
				
			}
			
		}

		escreva("\nA maior pontuação é: ", pontMaior, "!\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 364; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */