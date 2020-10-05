programa
{
	funcao pula(){

		escreva("\n")
		
	}
	
	funcao inicio()
	{
		cadeia familia[4]
		inteiro x

		para (x=0;x<4;x++){

			escreva("\nEntre com um nome: ")
			leia(familia[x])
			pula()
			
		}

		para (x=0;x<4;x++){

			escreva("\nNome: ", familia[x], " Posição: ",x+1)
			pula()
		}

		/*para (x=3;x>=0;x--){

			escreva("\nNome: ", familia[x], " Posição: ",x+1)
			pula()
		}*/
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */