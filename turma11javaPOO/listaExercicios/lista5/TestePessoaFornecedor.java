package lista5;

public class TestePessoaFornecedor {

	public static void main(String[] args) {
		
		PessoaEx1 pessoaqualquer = new PessoaEx1();
		FornecedorEx2 fornecedor1 = new FornecedorEx2 ("Magazine Luiza", "Rua x", 10300);
		
		fornecedor1.setValorDebito(500.98);
		
		System.out.println("Saldo da " +fornecedor1.getNome()+": R$"+fornecedor1.obterSaldo());
	}

}
