package entidade;

public class Empregado {
	
	private String nome;
	private int horas;
	private double valorPorHora;
	
	//construtor padrão
	public Empregado() {
		
	}
	
	//sobrecarga 
	public Empregado(String nome, int horas, double valorPorHora) {
		
		
		this.nome = nome;
		this.horas = horas;
		this.valorPorHora = valorPorHora;
	}
	
	//encapsulamento 
	public Empregado(String nome) {
		
		this.nome = nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	//metodo
	public double pagamento() {
		
		return(horas*valorPorHora);
	}
	
	
	
	
	
	
	
	
	
	

}
