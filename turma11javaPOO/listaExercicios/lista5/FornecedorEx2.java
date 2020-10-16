package lista5;

public class FornecedorEx2 extends PessoaEx1 {
	
	private double valorCredito;
	private double valorDebito;
	
	public FornecedorEx2(String nome, String endereço, double valorCredito) {
		super(nome, endereço);
		this.valorCredito = valorCredito; //usa this pq tem parametro
	}
	
	public double obterSaldo() {
		
		return valorCredito - valorDebito; //não usa this pq não tem parametro
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(double valorDebito) {
		this.valorDebito = valorDebito;
	}
	
	

}
