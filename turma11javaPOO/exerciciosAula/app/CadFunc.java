package app;

import entidade.Empregado;
import entidade.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado func1 = new Empregado("EDNILSON", 10, 50.45);
		Terceiro terc1 = new Terceiro("CLEITON", 10, 50.45, 20.30);
		
		System.out.println("PAGAMENTO");
		System.out.println(func1.getNome()+" você recebe R$" +func1.pagamento());
		System.out.println(terc1.getNome()+" você recebe R$" +terc1.pagamento());
		
	}

}
