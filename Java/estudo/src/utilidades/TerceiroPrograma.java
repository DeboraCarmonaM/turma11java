package utilidades;

public class TerceiroPrograma {

	public static void main(String[] args) {
		
		int valor = 10; //tipo primitivo (tipo de dados)
		String nome = "AULA DE JAVA"; //string não é tipo primitivo
		char sobrenome = '1';
		double salario = 1000.01; //melhor que o float %f
		float imposto = 0.1f; //float tende a dar erro
		
		System.out.print("EXEMPLO DO PRINT\n");
		System.out.println("Nome do usuário: " +nome+" salario " +salario); 
		System.out.printf("Nome usuário: %s e salario: %.2f com acrescimo de 10%%", nome, salario);

	}

}
