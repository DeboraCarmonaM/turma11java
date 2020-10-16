package lista5;

public class TesteOperario {

	public static void main(String[] args) {
		
		OperarioEx5 operario1 = new OperarioEx5("Alexandre", "Antonio Auzoni,5",43000.00, 5.00, 3000 );
		
		
		System.out.println("DADOS OPERÁRIO\n");
		System.out.println("Nome: " +operario1.getNome() + "\nEndereço: " +operario1.getEndereco() + "\nValor produção: R$" +operario1.getValorProducao()+"\nSalário base: R$" +operario1.getSalarioBase() +"\nSalário com comissão: R$" +(operario1.getSalarioBase()+operario1.calcularSalarioComissao()));
	
		
	
	}
	

}
