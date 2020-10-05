programa
{

	funcao pular(){      //função elaborada para pular linhas durante o programa, sem ter que ficar fazendo a repetição de comandos

		escreva("\n")
		
	}
	
	funcao inicio()
	{
		//Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50

		inteiro soma = 0, dividendo = -1, divisor = 0, numero = 0, vetor [51] //declarando e inicializando as variaveis e o vetor que será utilizado durante o programa

	

		para(inteiro x = 0; x <= 49; x++){ //declarando a condição de parada do laço

			dividendo = dividendo + 2 //achando o valor para o dividendo
			divisor = divisor + 1 //achando o valor para o divisor
			numero = dividendo / divisor // estabeleceno o valor de número colocando o dividendo dividido pelo divisor
			vetor[x] = numero //colocando os valores no vetor

			soma = soma + vetor[x] //somando os valores do vetor

			escreva( "(",dividendo, " / ", divisor,")", " + ") //exibindo os valores a serem somados
			
			
		}

		pular()
		escreva("A soma dos valores é: ", soma) //exibindo a soma

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 657; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */