package lista5;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		EmpregadoEx3 funcionario1 = new EmpregadoEx3("Debora", "Rua Bonito,3", 32, 3000.00, 400.00 );
		
		
		System.out.println("DADOS DO FUNCIONARIO\n");
		System.out.println("Nome: " +funcionario1.getNome() + "\nEndere�o: " +funcionario1.getEndereco() + "\nC�digo Setor: " +funcionario1.getCodigoSetor() +"\nSal�rio Base: R$" + funcionario1.getSalarioBase() + "\nImpostos: R$" +funcionario1.getImposto() + "\nSal�rio l�quido: R$" +funcionario1.calcularSalario() );
		
		

	}

	

}
