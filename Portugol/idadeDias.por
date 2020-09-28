programa
{
	
	funcao inicio()
	{
		inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias 
		inteiro totalIdadeDias = 0

		escreva("Quantos anos você tem? ")
		leia(idadeAnos)

		escreva("Quantos meses? ")
		leia(idadeMeses)

		escreva("Quantos dias? ")
		leia(idadeDias)

		totalIdadeDias = ( (idadeAnos * 365) + (idadeMeses * 30) + idadeDias )

		escreva("\nA sua idade em dias é: " +totalIdadeDias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 209; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */