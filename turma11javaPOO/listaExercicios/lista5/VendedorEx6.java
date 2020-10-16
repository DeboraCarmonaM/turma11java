package lista5;

public class VendedorEx6 extends PessoaEx1{
	
	/*
	 * Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor tem como atributos da classe 
	 * Pessoa e também os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos) e 
	 * o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor). 

	 */
	
	private double valorVendas;
	private double comissao;
	private double salarioBase;
	
	public VendedorEx6(String nome,double valorVendas, double comissao, double salarioBase) {
		
		super(nome, nome);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salarioBase = salarioBase;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalarioComissao() {
		
		return (salarioBase+ (valorVendas * (comissao/100)));
	}
	
	
	
	
	
	
	
}
