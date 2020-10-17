package lista6;

public class CachorroEx1 extends AnimalEx1{
	
	private String corre;

	public CachorroEx1(String nome, int idade, String corre) {
		
		super(nome, idade);
		this.corre = corre;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	@Override
	public String somAnimal() {
		
		return super.getSom("'Au au au!'") ;
	}
	
	
	
	

}
