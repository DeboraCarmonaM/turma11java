programa
{
	inclua biblioteca Util --> u //para utilizar a função sorteia
	
	funcao pular(){      //função elaborada para pular linhas durante o programa, sem ter que ficar fazendo a repetição de comandos

		escreva("\n")

	}
	
	funcao inicio()
	{
		/*Faça um programa que leia um vetor de 5 posições para números reais e, depois, um código inteiro. Se o código for zero, finalize o programa; 
		se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa. Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido. */

				
		
		inteiro vetor [5], codigo, numero = 1, z = 4, indice = 0 //definindo e iniciando as variaveis e o vetor

		para(inteiro x = 0; x < 5; x++){ //definindo os números que estarão contidos no vetor de forma aleatória

			numero = numero + numero * 2			
			vetor[x] = numero
			
			
		}

		escreva("Digite o número 1 ou o número 2:  ")//pedindo o código que vai definir o que será mostrado para o usuário e depois guardando o valor na variavel "codigo"
		leia(codigo)
		pular()


		se(codigo != 1 e codigo != 2){ //garantindo que o código será inserido corretamente
			
		
			faca{
	
				escreva("Código inválido! ")
				escreva("Digite o número 1 ou o número 2:  ")//pedindo o código que vai definir o que será mostrado para o usuário e depois guardando o valor na variavel "codigo"
				leia(codigo)
				pular()
				
			}enquanto(codigo != 1 e codigo != 2)

		}

		se(codigo == 1){ //criando seção que mostrará o vetor na ordem direta


			para(inteiro y = 0; y < 5; y++){ //definindo as condições para impressão do vetor

				escreva(vetor[y])
				pular()

			}
				
			}

			senao se(codigo == 2){ //criando seção que mostrará o vetor na ordem inversa

	
				para(inteiro y = 0; y < 5; y++){ //definindo as condições para impressão do vetor de forma inversa

	
					indice = y + z
					escreva(vetor[indice])
					z = z - 2
					pular()
	
					
					
				}

			
			
			
			}

		}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1843; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */