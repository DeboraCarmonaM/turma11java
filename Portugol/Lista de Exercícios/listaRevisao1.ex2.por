programa
{
	funcao pular(){      //função elaborada para pular linhas durante o programa, sem ter que ficar fazendo a repetição de comandos

		escreva("\n")
		
	}
	
	funcao inicio()
	{
		/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 
		Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo. 
		IMC em adultos Condição 
		Abaixo de 18,5 Abaixo do peso 
		Entre 18,5 e 25 Peso normal 
		Entre 25 e 30 Acima do peso 
		Acima de 30 obeso*/

		real altura, peso, imc = 0.0 //declarando e iniciando as variáveis que serão usadas durante o programa

		escreva("Olá! Vamos calcular o seu IMC! Por favor digite o seu peso: ") //solicitando o peso ao usuário, para acrescenta-lo a variavel "peso"
		leia(peso)
		pular()

		escreva("Qual a sua altura? Digite nesse formato: '1.45', por favor: ") //solicitando a altura ao usuário, para acrescenta-lo a variavel "altura"
		leia(altura)
		pular()

		imc = (peso / (altura * altura )) //definindo o imc e guradando o valor na variavel imc

		se(imc < 18.5){ // quando imc abaixo do peso

			escreva("O seu IMC é: ", imc, ". Você está abaixo do peso.")


			
		}

		se(imc >= 18.5 e imc < 25){ // quando imc dentro do peso normal

			escreva("O seu IMC é: ", imc, ". Você está no seu peso normal.")

			
		}

		se(imc >= 25 e imc < 30){ // quando imc acima do peso normal

			escreva("O seu IMC é: ", imc, ". Você está acima do peso.")
			
		}

		se(imc >= 30){ // quando imc indica obesidade

			escreva("O seu IMC é: ", imc, ". Você está obeso.")
			
		}

		pular()



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 981; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */