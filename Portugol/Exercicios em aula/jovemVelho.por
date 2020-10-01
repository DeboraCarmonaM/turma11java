programa
{
	
	funcao inicio()
	{
		//nome usuario
		//masculino ou feminino
		//ano nascimento
		//conforme idade, eu chamo de idoso ou idosa <=60 ,madura ou madura entre 25 e 59,ou jovem <25
		//oi tal pessoa, vc é "??"

		cadeia nomeUsuario
		caracter opcao
		inteiro dataNascimento
		inteiro idade

		escreva("\nQual o seu nome: ")
		leia(nomeUsuario)

		escreva("\nQual o seu ano de nascimento ")
		leia(dataNascimento)

		escreva("\nFeminino (F) ou masculino (M): ")
		leia(opcao)

		idade = 2020 - dataNascimento


		se (opcao == 'F' ou 'f'){

			escreva("\nBom dia Sra. ", nomeUsuario, "!!")

			
		}

		senao se (opcao == 'M' ou 'm'){

			escreva("\nBom dia Sr. ", nomeUsuario, "!!")

			
		}

		se (idade < 25){

			escreva("\n Você é jovem!")
		}

		
		senao se (idade >= 25 e < 60){

			 escreva("\n Você é maduro")
		}

		senao{

			escreva("\n Você é idoso")
		}
		 

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 880; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */