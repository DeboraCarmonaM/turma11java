programa
{

	funcao pular(){      //função elaborada para pular linhas durante o programa, sem ter que ficar fazendo a repetição de comandos

		escreva("\n")
		
	}

	
	funcao inicio()
	{

		/*Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a 
		 * condição de pagamento escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

			real valorProduto, valorPagar = 0.0, desconto = 0.0, parcelas = 0.0, juros = 0.0   //declarando e iniciando as variáveis que serão usadas durante o programa
			inteiro formaPag, metodoPag

			escreva("Olá! Qual o valor do produto que você deseja comprar? R$") //pedindo ao usuário o valor do produto, que será colocado dentro da variável "valorProduto"
			leia(valorProduto)

			pular()

			escreva("Qual será a forma de pagamento: \n À vista (digite 1) ou Parcelado (digite 2): ")  //pedindo ao usuário a forma de pagamento, que será colocado dentro da variável "formaPag"
			pular()
			leia(formaPag)

			pular()

			se(formaPag == 1){

				escreva("Se o pagamento for com dinheiro/cheque (digite 1) ou se for com cartão de crédito (digite 2): ") //pedindo ao usuário o metódo de pagamento, que será colocado dentro da variável "metodoPag"
				leia(metodoPag)
				pular()


				enquanto(metodoPag != 1 e metodoPag != 2){ //garantindo que o usuário escolha uma opçaõ válida

					escreva("Se o pagamento for com dinheiro/cheque (digite 1) ou se for com cartão de crédito (digite 2): ") //pedindo ao usuário o metódo de pagamento, que será colocado dentro da variável "metodoPag"
					leia(metodoPag)
					pular()
					
						
					}

				se(metodoPag == 1){ //caso o pagamento seja à vista com dinheiro/cheque

					desconto = valorProduto * 0.20 //calculando o desconto de 20%
					valorPagar = valorProduto - desconto

					limpa()
					escreva("Você está recendo um desconto de 20%, que é correspondete à: R$", desconto, ", então você pagará o valor de R$", valorPagar, " pelo seu produto.") //exibindo a porcentagem do desconto, o seu valor e o valor a ser pago
					
				}

				senao se(metodoPag == 2){

					desconto = valorProduto * 0.15 //calculando o desconto de 15%
					valorPagar = valorProduto - desconto

					limpa()
					escreva("Você está recendo um desconto de 15%, que é correspondete à: R$", desconto, ", então você pagará o valor de R$", valorPagar, " pelo seu produto.")  //exibindo a porcentagem do desconto, o seu valor e o valor a ser pago

					
					
				}

					
				}

			se(formaPag == 2){

				escreva("Se o pagamento for em duas vezes (digite 1) ou se for em três vezes (digite 2): ") //pedindo ao usuário o metódo de pagamento, que será colocado dentro da variável "metodoPag"
				leia(metodoPag)
				pular()

				enquanto(metodoPag != 1 e metodoPag != 2){ //garantindo que o usuário escolha uma opçaõ válida

					escreva("Se o pagamento for em duas vezes (digite 1) ou se for em três vezes (digite 2): ") //pedindo ao usuário o metódo de pagamento, que será colocado dentro da variável "metodoPag"
					leia(metodoPag)
					pular()
					
						
					}

				se(metodoPag == 1){ //caso o pagamento seja parcelado em duas vezes

					valorPagar = valorProduto
					parcelas = valorPagar / 2

					limpa()
					escreva("O valor a ser pago pelo seu produto é R$", valorPagar, ". E o pagamento será dividido em duas parcelas de: R$", parcelas, ".") //exibindo o valor do produto e o valor das parcelas
					
				}

				
				senao se(metodoPag == 2){ //caso o pagamento seja parcelado em três vezes

					juros = valorProduto * 0.10
					valorPagar = valorProduto + juros
					parcelas = valorPagar / 3

					limpa()
					escreva("Como o pagamento será feito em três parcelas, o valor terá um acrescimo de 10%, que é correspondente à: R$", juros, ". \nEntão, você pagará o valor de R$", valorPagar, " pelo seu produto. E o pagemento será dividido em três parcelas de: R$", parcelas, ".") //exibindo o valor do produto, o valor do juros e o valor das parcelas 


				}
				
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */