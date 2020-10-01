programa
{
	
	funcao inicio()
	{
		inteiro idadeDias

		escreva("Qual a sua idade em dias?? ")
		leia(idadeDias)

		inteiro idadeAnos = idadeDias / 365
		inteiro idadeMeses1 = idadeDias - (idadeAnos * 365) 
		inteiro idadeMeses2 = idadeMeses1 / 30
		inteiro idadeDiasFim = idadeMeses1 - idadeMeses2 * 30

		

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
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */