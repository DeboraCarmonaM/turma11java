programa
{
	
	funcao inicio()
	{
		//pegar/receber/colher do usuário
		//ingredientes

		cadeia nomeUsuario
		caracter opcao

		escreva("Digite o seu nome: ")
		leia(nomeUsuario)

		escreva("\nSe você se identifica com o sexo feminino digite (F) e se identifica  com o masculino digite (M): ")
		leia(opcao)

		se (opcao == 'F'){
		
			escreva("\nBom dia Sra. ", nomeUsuario, "!!")
		
		}

		senao se (opcao == 'M'){

			escreva("\nBom dia Sr. ", nomeUsuario, "!!")

		}

		senao {

			escreva("\nBom dia senhore, ", nomeUsuario, "!!")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 543; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */