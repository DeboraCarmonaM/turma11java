package lista5;

public class FornecedorEx2 extends PessoaEx1 {
	
	private double valorCredito;
	private double valorDebito;
	
	public FornecedorEx2(String nome, String endere�o, double valorCredito) {
		super(nome, endere�o);
		this.valorCredito = valorCredito; //usa this pq tem parametro
	}
	
	public double obterSaldo() {
		
		return valorCredito - valorDebito; //n�o usa this pq n�o tem parametro
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
