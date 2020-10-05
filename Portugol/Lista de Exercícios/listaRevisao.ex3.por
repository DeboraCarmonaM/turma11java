programa
{

	funcao pular(){      //função elaborada para pular linhas durante o programa, sem ter que ficar fazendo a repetição de comandos

		escreva("\n")
		
	}
	
	funcao inicio()
	{
		/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
		 A entrada de dados deve terminar quando for lido um número negativo.*/


		 inteiro numero, intervalo1 = 0, intervalo2 = 0, intervalo3 = 0, intervalo4 = 0 //declarando e iniciando as variáveis que serão usadas durante o programa

		 faca{

		 	escreva("Olá! Digite um número: ") //solicitando o número ao usuário e guardando no variável "numero"
		 	leia(numero)
		 	pular()

		 	se(numero >= 0 e numero <= 25){ //definindo os números que estão no primeiro intervalo [0-25]

				intervalo1 = intervalo1 + 1
		 		
		 	}

		 	senao se(numero > 25 e numero <= 50){ //definindo os números que estão no segundo intervalo [26-50]

				intervalo2 = intervalo2 + 1
		 		
		 	}

		 	senao se(numero > 50 e numero <= 75){ //definindo os números que estão no terceiro intervalo [51-75]

				intervalo3 = intervalo3 + 1
		 		
		 	}

		 	senao se(numero > 75 e numero <= 100){ //definindo os números que estão no quarto intervalo [76-100]

				intervalo4 = intervalo4 + 1
		 		
		 	}


		 	
		 }enquanto(numero >= 0) //definindo a repetição do faça


		 escreva("Você digitou: \n", intervalo1, " números entre 0-25\n", intervalo2, " números entre 26-50\n", intervalo3, " números entre 51-75\n", intervalo4,  " números entre 76-100\n" ) // exibindo quantos números ficaram nos intervalos

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */