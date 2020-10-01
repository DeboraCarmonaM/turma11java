programa
{

	/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) 
	 até que ele seja maior do que 100. Ex.: se o usuário digita 5,  
	 deveremos observar na tela a seguinte sequência: 5 15 45 135.*/
	funcao pularLinha(){

		escreva("\n")
		
	}

	
	
	funcao inicio()
	{
		inteiro numero
		inteiro x = 0
		inteiro multiplicar = 1

		escreva("Digite um número: ")
		leia(numero)
		pularLinha()

		enquanto(x < 100){

			numero = numero * multiplicar
			escreva(numero)

			multiplicar = 3

			x = numero
			pularLinha()
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */