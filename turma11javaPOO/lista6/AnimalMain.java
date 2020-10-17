package lista6;

public class AnimalMain {

	public static void main(String[] args) {
		
		CavaloEx1 animal1 = new CavaloEx1("Jack", 5, "corre");
		CachorroEx1 animal2 = new CachorroEx1("Cacau", 3, "corre");
		PreguicaEx1 animal3 = new PreguicaEx1("Lulu", 7,"sobe em árvore");
		
		
		System.out.println("O cavalo se chama " +animal1.getNome()+ ", ele tem " +animal1.getIdade()+ " anos, " +animal1.getCorre()+ " muito e emite um som de " +animal1.somAnimal()+ ".\n");
		System.out.println("O cachorro se chama " +animal2.getNome()+ ", ele tem " +animal2.getIdade()+ " anos, " +animal2.getCorre()+ " muito e emite um som de " +animal2.somAnimal()+ ".\n");
		System.out.println("O bicho-preguiça se chama " +animal3.getNome()+ ", ele tem " +animal3.getIdade()+ " anos, " +animal3.getSubirArvore()+ " e emite um som de " +animal3.somAnimal()+ ".\n");

	}

}
