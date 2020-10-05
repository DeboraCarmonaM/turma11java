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

			real valorProduto, valorPagar = 0.0
			inteiro formaPag

			escreva("Olá! Qual o valor do produto que você deseja comprar? R$") //pedindo ao usuário o valor do produto, que será colocado dentro da variável "valorProduto"
			leia(valorProduto)

			pular()

			escreva("Qual será a forma de pagamento: \n À vista (digite 1) ou Parcelado (digite 2): ")  //pedindo ao usuário a forma de pagamento, que será colocado dentro da variável "formaPag"
			pular()
			leia(formaPag)

			pular()

			se(formaPag == 1){

				

				
			}
			

			

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1249; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */