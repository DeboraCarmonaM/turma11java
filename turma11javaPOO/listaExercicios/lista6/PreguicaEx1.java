package lista6;

public class PreguicaEx1 extends AnimalEx1 {
	
	private String subirArvore;

	public PreguicaEx1(String nome, int idade, String subirArvore) {
		
		super(nome, idade);
		this.subirArvore = subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	@Override 
	public String somAnimal() {
		
		return super.getSom("'Uaah!'");
	}
	
	

}
