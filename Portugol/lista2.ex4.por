programa
{
	//Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
	
	funcao inicio()
	{
		inteiro numero = 0

		escreva("Digite um número: ")
		leia(numero)


		se ((numero%2 > 0 ) ou (numero%2 < 0) ou (numero < 0)){

			senao se(numero > 0){

				escreva("\n O ", numero, " é impar e positivo.")

			}

			senao se(numero < 0){

				escreva("\n O ", numero, " é impar e negativo.")
				
			}	
		}

		senao{

			escreva("\nO número ", numero, " é par e positivo.")
			
			}	
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */