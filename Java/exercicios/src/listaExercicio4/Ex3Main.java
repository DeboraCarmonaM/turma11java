package listaExercicio4;

import java.util.Scanner;

import listaExercicio4.ProdutoEletronicoEx3;

public class Ex3Main {

	public static void main(String[] args) {
		/*
		 * Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto produto eletrônico,
		 * defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */
		
		ProdutoEletronicoEx3 produtoEletronico = new ProdutoEletronicoEx3();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tipo do eletrônico: ");
		produtoEletronico.tipo = leia.next();
		System.out.println("Digite a marca: ");
		produtoEletronico.marca= leia.next();
		System.out.println("Digite o modelo:  ");
		produtoEletronico.modelo= leia.next();
		System.out.print("Digite o preço: R$");
		produtoEletronico.preco = leia.nextDouble();
		
		
		System.out.println("\n-------------DADOS DO PRODUTO ELETRÔNICO---------------\n");
		System.out.println("Tipo: " +produtoEletronico.tipo);
		System.out.println("Marca: " +produtoEletronico.marca);
		System.out.println("Modelo: " +produtoEletronico.modelo);
		System.out.println("Preço: R$" +produtoEletronico.preco);
		
		
		
	}

}
