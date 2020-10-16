package lista5;

public class TesteAdministrador {

	public static void main(String[] args) {
		
		AdministradorEx4 administrador1 = new AdministradorEx4("Rafael", "Rosas, 345", 1500 );
		
		System.out.println("DADOS DO ADMINISTRADOR\n");
		System.out.println("Nome: " +administrador1.getNome() + "\nEndereço: " +administrador1.getEndereco() + "\nAjuda de custo: R$" +administrador1.getAjudaDeCusto());
	}

}
