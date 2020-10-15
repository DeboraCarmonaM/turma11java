package desafios;

import java.util.ArrayList;
import java.util.Scanner;


public class DesafioEcomerce {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		char sexo;
		char continua;
		char opc;
		int x, y = 0;
		int quantidade[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		int preco[] = { 20, 40, 50, 90, 30, 90, 40, 90, 80, 70 };
		int codigo[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int z = 0; // variavel auxiliar
		int codigo1 = 0, codigo2 = 0;
		int opcao = 0;
		int quantidadex = 0;
		int subtotal = 0;
		int opcao1 = 0, opcao2;
		int pagamento = 0;
		double auxiliar = 0.0;
		
		ArrayList<String> carrinho = new ArrayList<>();
		String produtos[] = { "Bolsa Louis V. ", "Camisa YSL     ", "Camiseta CK    ", "Diablo Prada   ",
				"Cal�a Animale  ", "Casaco Versasce", "Perfume Chanel5", "Rel�gio Hublot ", "Saia Dolce&Ga  ",
				"Sapato Gucci   ", "Vestido Dior    " };
			
		System.out.println("\n =======================THREE GIRLS, ONE MAN: MODAS========================");
		System.out.println("\nOl�, qual o seu nome?");
		nome = leia.next().toUpperCase();
		
		do {
			System.out.println("Qual o seu sexo? F-Feminino, M - Masculino ou O - Outros;");
			sexo = leia.next().toUpperCase().charAt(0);
			if (sexo == 'F') {
				
				System.out.printf("Bem Vinda, %s!\n\n", nome);
			} else if (sexo == 'M') {
				
				System.out.printf("Bem Vindo, %s!\n\n", nome);
				
			} else if (sexo == 'O') {
				
				System.out.printf("Bem Vinde, %s!\n\n", nome);
				
			} else {
				
				System.out.println("Poxa, op��o inv�lida...tente novamente");
				
			}
			
		}while(sexo != 'F' && sexo != 'M' && sexo != 'O');
		
		System.out.println("Gostaria de ver os produtos nossa loja TGOM ? S - Sim ou N -N�o.");
		opc = leia.next().toUpperCase().charAt(0);
		
		//USUARIO QUER VER OS PRODUTOS DA LOJA
		if(opc == 'S') {
			
            System.out.print("Vamos come�ar as compras? Digite 1 para iniciar: ");
			opcao = leia.nextInt();
			
            if(opcao != 1){
            	
                do{
                	
                    System.out.print("Valor digitado incorreto. Digite 1 para iniciar: ");
                    opcao = leia.nextInt();
                    
                }while(opcao != 1);
            }
			
			//ENQUANTO O USUARIO QUISER COMPRAR
			while (opcao == 1) {
				
				System.out.printf("\n%s, ESSES S�O OS NOSSOS PRODUTOS: \n\n", nome);
				
				for (x = 0; x < 10; x++)
					{
					
						System.out.printf("Produto: %s  Quantidade: %d  Cod: %d Valor: R$ %d.\n", produtos[x], quantidade[x],
								codigo[x], preco[x]);
						
					}
				
					System.out.printf("\nPor favor %s, digite o c�digo do produto que voc� gostaria de comprar: ", nome);
					codigo1 = leia.nextInt();
					System.out.printf("\nPor favor %s, digite a quantidade de pe�as que voc� de deseja comprar: ", nome);
					quantidadex = leia.nextInt();
							
				if(quantidadex > quantidade[codigo1 - 1]) {
					
					while(quantidadex > quantidade[codigo1 - 1]) {
						
						System.out.println("\nQuantidade de produtos selecionados indispon�vel!");
						System.out.printf("\nPor favor %s, digite novamente a quantidade de pe�as que voc� de deseja comprar: ", nome);
						quantidadex = leia.nextInt();
						
					}					
				}
				if(quantidadex <= quantidade[codigo1 - 1]) {
					
					//quantidade[codigo1 - 1] = quantidade[codigo1 - 1] - quantidadex;
					quantidade[codigo1 - 1] -= quantidadex;
					carrinho.add(produtos[codigo1 - 1]);
				}
				if (quantidadex == 1) {
					System.out.printf("O produto escolhido foi: %s \n"
									+ "Quantidade de itens selecionados: %d pe�a.",
									produtos[codigo1 - 1], quantidadex);
				} else if (quantidadex > 1) {
					System.out.printf("O produto escolhido foi: %s \n"
							+ "Quantidade de itens selecionados: %d pe�as",
							produtos[codigo1 - 1], quantidadex);
				}
				// CALCULO DO PRECO
				subtotal = ((preco[codigo1 - 1] * quantidadex) + subtotal);
				System.out.printf("\nDeseja escolher outro produto? Digite 1 para SIM ou 2 para N�O: ");
				opcao = leia.nextInt();
			}
			System.out.printf("\n------------------CARRINHO DE COMPRAS-------------------------\n");
			System.out.printf("\nSeus produtos: %s\n VALOR TOTAL: R$ %d. ", carrinho, subtotal);
			System.out.print("Deseja adicionar algum produto? Digite 1 para SIM ou 2 para N�O: ");
			opcao1 = leia.nextInt();
			System.out.println("--------------------------------------------------------------" );
			if (opcao1 == 1) {
				while (opcao1 == 1) {
					
					System.out.printf("\n %s, ESSES S�O OS NOSSOS PRODUTOS: \n\n", nome);
					for (x = 0; x < 10; x++)
					{
						
						System.out.printf("Produto: %s  Quantidade: %d  Cod: %d Valor: R$ %d.\n", produtos[x], quantidade[x],
								codigo[x], preco[x]);
						
					}
					
					System.out.printf("Por favor %s, digite o c�digo do produto que voc� gostaria de comprar: ", nome);
					codigo2 = leia.nextInt();
					System.out.printf("Por favor %s, digite a quantidade de pe�as que voc� de deseja comprar: ", nome);
					quantidadex = leia.nextInt();
													
					if(quantidadex > quantidade[codigo2 - 1]) {
						
						while(quantidadex > quantidade[codigo2 - 1]) {
							
							System.out.println("\nQuantidade de produtos selecionados indispon�vel!");
							System.out.printf("\nPor favor %s, digite novamente a quantidade de pe�as que voc� de deseja comprar: ", nome);
							quantidadex = leia.nextInt();	
							
						}
					}
					
					if(quantidadex <= quantidade[codigo2 - 1]) {
						
						quantidade[codigo2 - 1] -= quantidadex;						
						carrinho.add(produtos[codigo2 - 1]);
						
					}
					
					if (quantidadex == 1) {
						
						System.out.printf("O produto escolhido foi: %s \n"
								+ "Quantidade de itens selecionados: %d pe�a.",
								produtos[codigo2 - 1], quantidadex);
						
					} else if (quantidadex > 1) {
						
						System.out.printf("O produto escolhido foi: %s \n"
								+ "Quantidade de itens selecionados: %d pe�as.",
								produtos[codigo2 - 1], quantidadex);
						
					}
					// CALCULO DO PRECO
					subtotal = ((preco[codigo2 - 1] * quantidadex) + subtotal);
					System.out.printf("\nDeseja escolher outro produto? Digite 1 para SIM ou 2 para N�O: ");
					opcao1 = leia.nextInt();
					}
					System.out.printf("\n------------------CARRINHO DE COMPRAS-------------------------\n");
					System.out.printf("\nSeus produtos: %s\n VALOR TOTAL: R$%d. ", carrinho, subtotal);
					System.out.println("-------------------------------------------------------------" );
					
				}
			
				if (opcao1 == 2) {
					
					System.out.print("\nVamos para as opc�es de pagamento!!!\n");
					
				}
				// Op��es de pagamento ( a vista com 10 % de desconto, cr�dito 1 at� 3 parcelas)
				// sem juros e mostrar as parcelas
				System.out.print("\nDIGITE 1 - � VISTA com 10% de desconto, 2 - CR�DITO: ");
				pagamento = leia.nextInt();
				
				if(pagamento != 1 && pagamento != 2){
	                do{
	                	
	                    System.out.print("Valor digitado incorreto. DIGITE 1 - � VISTA com 10% de desconto, 2 - CR�DITO: ");
	                    pagamento = leia.nextInt();
	                    
	                }while(opcao != 1);
	                
	            }else { 
	            	
	            	if (pagamento == 1) { //EXIBIR VALOR COM 10% DE DESCONTO
	            		
	            		System.out.print("\nO valor da sua compra com 10% de desconto ficar� R$" + (subtotal * 0.9) + "\n");
	            		System.out.println("\n-----------------------------NOTA FISCAL---------------------------------");	            		
	            		System.out.println("\nOs produtos comprados foram: " +carrinho+ "\n");
	            		System.out.println("Total a pagar sem impostos R$" + (subtotal * 0.9));	            		
	            		System.out.println("Total da sua compra com os impostos: R$"+ subtotal * 0.99 + "\n");
	            		System.out.println("\nObrigade, pela compra!!\nPrazo de 30 dias para trocas por defeitos de fabrica��o, com a NF.\nGarantia de 3 meses, conforme CDC." );
	            		System.out.println("-------------------------------------------------------------------------" );
	            		
	            	} else if (pagamento == 2) { //VALOR PARCELADO
	            		
	            		System.out.print("\nAT� 3 VEZES SEM JUROS - DIGITE O N�MERO DE PARCELAS: " + "\n");
	            		opcao2 = leia.nextInt();
	            		
	            		if(opcao2 != 1 && opcao2 != 2 && opcao2 != 3){
	    	                do{
	    	                	
	    	                    System.out.print("Valor digitado incorreto. AT� 3 VEZES SEM JUROS - DIGITE O N�MERO DE PARCELAS: ");
	    	                    opcao2 = leia.nextInt();
	    	                    
	    	                }while(opcao2 != 1 && opcao2 != 2 && opcao2 != 3);
	    	            }
	            		
	            		System.out.println("\n-----------------------NOTA FISCAL--------------------------" );	            		
	            		System.out.println("\nOs produtos comprados foram: " +carrinho + "\n");
	            		System.out.println("Total sem imposto R$" + subtotal);
	            		System.out.println("Total a pagar com impostos R$" + (((subtotal/opcao2) * 1.09) * opcao2));
	            		System.out.print("\nCada parcela ficar� no valor de R$" + ((subtotal/opcao2) * 1.09) + "\n");
	            		System.out.println("\nObrigade, pela compra!!\nPrazo de 30 dias para trocas por defeitos de fabrica��o, com a NF.\nGarantia de 3 meses, conforme CDC.\n" );
	            		System.out.println("--------------------------------------------------------------" );
	
	            	}
	            }
								
			
		}else{ //USUARIO NAO QUIS VER OS PRODUTOS DA LOJA
			
			System.out.printf("\n %s, Obrigade por utilizar o nosso programa!", nome);
			
		}
				
	}
	
}//MAIN
