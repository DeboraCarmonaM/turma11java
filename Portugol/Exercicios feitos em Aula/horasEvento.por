programa
{
	
	funcao inicio()
	{
		inteiro duracaoSegundos
		inteiro tempoHoras = 0
		inteiro tempoMinutos1 = 0
		inteiro tempoMinutos2 = 0
		inteiro tempoSegundos = 0 

		escreva("Qual a duração do evento em segundos? ")
		leia(duracaoSegundos)

		 tempoHoras = duracaoSegundos / 3600 
		 tempoMinutos1 = duracaoSegundos - (tempoHoras * 3600)
		 tempoMinutos2 = tempoMinutos1 / 60
		 tempoSegundos = tempoMinutos1 - (tempoMinutos2 * 60)
		
		escreva("\n O evento tem: ", tempoHoras, " horas")
		escreva(", ", tempoMinutos2, " minutos")
		escreva(" e ", tempoSegundos, " segundos.")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */