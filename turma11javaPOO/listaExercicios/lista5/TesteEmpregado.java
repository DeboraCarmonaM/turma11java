package lista5;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		EmpregadoEx3 funcionario1 = new EmpregadoEx3("Debora", "Rua Bonito,3", 32, 3000.00, 400.00 );
		
		
		System.out.println("DADOS DO FUNCIONARIO\n");
		System.out.println("Nome: " +funcionario1.getNome() + "\nEndereço: " +funcionario1.getEndereco() + "\nCódigo Setor: " +funcionario1.getCodigoSetor() +"\nSalário Base: R$" + funcionario1.getSalarioBase() + "\nImpostos: R$" +funcionario1.getImposto() + "\nSalário líquido: R$" +funcionario1.calcularSalario() );
		
		

	}

	

}
