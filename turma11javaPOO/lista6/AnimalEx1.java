package lista6;

public class AnimalEx1 {
	
	private String nome;
	private int idade;
	private String som;
	
	
	public AnimalEx1(String nome, int idade, String som) {
		
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}


	


	public AnimalEx1(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}





	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSom(String som) {
		return som;
	}


	public void setSom(String som) {
		this.som = som;
	}
	
	public String somAnimal() {
		
		return null;
	}
	

}
