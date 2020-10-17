package entidade;

public class Terceiro extends Empregado{
	
	private double adicional;
	
	//construtores
	public Terceiro() {
		super();
	}
	
	public Terceiro(String nome, int horas, double valorPorHora, double adicional) {
		
		super(nome, horas, valorPorHora);
		this.adicional = adicional;
	}
	
	//encapsuladores
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double pagamento() {
		
		return super.pagamento() + (adicional* 1.1);
	}
	
	
	
	
	
	
	
	
	

}


