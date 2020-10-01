programa
{
	
	funcao inicio()
	{
		inteiro idadeDias
		inteiro idadeAnos = 0
		inteiro idadeMeses1 = 0
		inteiro idadeMeses2 = 0
		inteiro idadeDiasFim = 0
		

		escreva("Qual a sua idade em dias?? ")
		leia(idadeDias)

		idadeAnos = idadeDias / 365
		idadeMeses1 = idadeDias - (idadeAnos * 365) 
		idadeMeses2 = idadeMeses1 / 30
		idadeDiasFim = idadeMeses1 - idadeMeses2 * 30

		
		escreva("\n Você tem ", idadeAnos, " anos")
		escreva("\n ", idadeMeses2, " meses")
		escreva("\n ", idadeDiasFim, " dias")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 510; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */