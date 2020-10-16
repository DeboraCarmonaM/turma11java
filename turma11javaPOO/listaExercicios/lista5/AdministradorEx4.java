package lista5;

public class AdministradorEx4 extends PessoaEx1 {
	
	/*
	 *  Implemente a classe Administrador como subclasse da classe pessoa. 
	 *  Um determinado administrador tem como atributos da classe Pessoa e 
	 *  também os atributos próprios como ajudaDeCusto (ajudas referentes a
	 *   viagens, estadias).
	 */
	
	private int ajudaDeCusto;

	public AdministradorEx4() {
		
	}

	public AdministradorEx4(String nome, String endereco, int ajudaDeCusto) {
		
		super(nome, endereco);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
	
	
	
	

}
