programa
{
	/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
	 a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
	 Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/

	funcao pularLinha(){

		escreva("\n")
		
	}

	
	funcao inicio()
	{
		inteiro numero = 0 
		inteiro soma = 0
		inteiro media = 0
		inteiro quantidadeNumeros = 0
		inteiro contador = 0

		enquanto(numero >= 0){

			escreva("Digite um número: ")
			leia(numero)
			pularLinha()

			se (numero >= 0){
				
				soma = soma + numero
				contador = contador + 1
			
			}

			
		}

		se (numero < 0){

			media = soma/contador

			escreva("A soma dos valores positivos é: ", soma)
			pularLinha()
			escreva("A média dos valores positivos é: ", media)
			pularLinha()
			escreva("O total de valores positivos digitados foi: ", contador)
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 773; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */