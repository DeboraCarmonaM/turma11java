programa
{

	funcao pula(){

		escreva("\n")
		
	}
	
	funcao inicio()
	{
		real celsius = 0, fahrenheit = 0 
		caracter tipoTemp = 'a', opcao = 's'
		
		
		enquanto((tipoTemp != 'f') e (tipoTemp != 'F') e (tipoTemp != 'C') e (tipoTemp != 'c'))){

			escreva("Você deseja saber a temperatura em celsius ou fahrenheit? ")
			leia(tipoTemp)
	
				se((tipoTemp == 'f') ou (tipoTemp == 'F')){
		
					faca {
		
						escreva("Qual a temperatura em celsius? ")
						leia(celsius)
				
						fahrenheit = (((9*celsius) + 160))/5)
				
						escreva("A temperatura em fahrenheit é: ", fahrenheit)
						escreva("\nContinua S-sim ou N-não: ")
						leia(opcao)
						pula()
						

						enquanto (opcao != 'S' e opcao != 's' e opcao != 'n' e opcao != 'N'){

							escreva("Você não digitou S ou N, tente de novo: ")
							leia(opcao)
							
						}
					} enquanto ((opcao == 'S') ou (opcao == 's'))	
				}
		
				se((tipoTemp == 'c') ou (tipoTemp == 'C')){
		
					faca {
		
						escreva("Qual a temperatura em fahrenheit? ")
						leia(fahrenheit)
				
						celsius = (5 * (fahrenheit - 32) /9)
				
						escreva("A temperatura em celsius é: ", celsius)
						escreva("\nContinua S-sim ou N-não: ")
						leia(opcao)
						pula()
						
						
					} enquanto ((opcao == 'S') ou (opcao =='s'))
					
				}
		}
		
		escreva("Obrigada por usar o programa!!\n")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */