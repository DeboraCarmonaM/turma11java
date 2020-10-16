package lista5;

public class TesteVendedor {

	public static void main(String[] args) {
		
		VendedorEx6 vendedor1 = new VendedorEx6("Rafaela", 17000.00, 4.0, 2300.0);
		
		System.out.println("DADOS DO VENDEDOR\n");
		System.out.println("Nome: " +vendedor1.getNome()+ "\nValor vendas: R$" +vendedor1.getValorVendas()+ "\nSalário base: R$" +vendedor1.getSalarioBase()+ "\nSalário com comissão: R$" +vendedor1.calcularSalarioComissao());
		

	}

}
