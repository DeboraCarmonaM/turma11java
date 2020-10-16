package lista5;

public class OperarioEx5 extends PessoaEx1 {
	/*
	 *  Implemente a classe Operario como subclasse da classe Pessoa. 
	 *  Um determinado operário tem como atributos da classe Pessoa e 
	 *  também os atributos próprios como valorProducao (que corresponde 
	 *  ao valor monetário dos artigos efetivamente produzidos pelo 
	 *  operário) e comissao (que corresponde à porcentagem do 
	 *  valorProducao que será adicionado ao vencimento base do operário). 
	 */
	
	private double valorProducao;
	private double comissao;
	private int salarioBase;
	
	public OperarioEx5(String nome, String endereco, double valorProducao, double comissao,
			int salarioBase) {
		
		super(nome, endereco);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.salarioBase = salarioBase;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalarioComissao() {
		
		return (this.valorProducao * (comissao/100));
	}
	
	
	
	
	
	
	
	
}
