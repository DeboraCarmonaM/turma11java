package lista5;

public class TesteOperario {

	public static void main(String[] args) {
		
		OperarioEx5 operario1 = new OperarioEx5("Alexandre", "Antonio Auzoni,5",43000.00, 5.00, 3000 );
		
		
		System.out.println("DADOS OPER�RIO\n");
		System.out.println("Nome: " +operario1.getNome() + "\nEndere�o: " +operario1.getEndereco() + "\nValor produ��o: R$" +operario1.getValorProducao()+"\nSal�rio base: R$" +operario1.getSalarioBase() +"\nSal�rio com comiss�o: R$" +(operario1.getSalarioBase()+operario1.calcularSalarioComissao()));
	
		
	
	}
	

}
