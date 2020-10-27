package turma11javaPOO;


public class Mulheres {
	
	//atributos
	
	private String nome;
	private int anoNasc;
	private String dataAniversario;
	private String area;
	private String nacionalidade;
	private char viva;
	private int anoMorte;
	
	//construtores
	
	
	
	public Mulheres(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade, 
			char viva, int anoMorte) {
		
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.dataAniversario = dataAniversario;
		this.area = area;
		this.nacionalidade = nacionalidade;
		this.viva = viva;
		this.anoMorte = anoMorte;
	}

	public Mulheres() {
		
	}

	public Mulheres(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade, char viva) {
		
		this.nome = nome;
		this.anoNasc = anoNasc;
		this.dataAniversario = dataAniversario;
		this.area = area;
		this.nacionalidade = nacionalidade;
		this.viva = viva;
	}
	
	
	//encapsuladores
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public char getViva() {
		return viva;
	}

	public void setViva(char viva) {
		this.viva = viva;
	}

	public int getAnoMorte() {
		return anoMorte;
	}

	public void setAnoMorte(int anoMorte) {
		this.anoMorte = anoMorte;
	}
	
	//funções
	
	
	//função apresentação programa
	
	public void apresentacao() {
		
		System.out.println("\n 									MULHERES PROTAGONISTAS NA CIÊNCIA E TECNOLOGIA\n");
		System.out.println("								-.-.-.-.-.-.-.--.-.-.-.-.-.-.-.-.-.-.-.-...-.-.-.-.-.-.-.-.");
		System.out.println("								.-.-.-.-.-.-.-.-.......+#WWWWWWWWWW#+.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("								.-.-.-.-.-.-.-.-....+WWWWWWWWWWWWWWWWWW+-.-.-.-.-.-.-.-.-.-");
		System.out.println("								.-.-.-.-.-.-.-...@WWWW@-..-#W=*WW*-.-@WWWW@.-.-.-.-.-.-.-.-");
		System.out.println("								.-.-.-.-.-.-....#WWWW:.:=-@WW#@WW@*W@.:WWWW@-.-.-.-.-.-.-..");
		System.out.println("								.-.-.-.-.......*WWWW+.+WW##WW+@WW*@WW--:WWWW*.-.-.-.-......");
		System.out.println("								.-.-...........@WWW#..-WW@:W=:+#+.=W:...#WWW@.-.-..........");
		System.out.println("								...............@WWW=...-#=...@WWWWWWW@-.=WWWW..............");
		System.out.println("								...............#WWW@...:WWWWW#**+@WWWW+.@WWW#..............");
		System.out.println("								...............:WWWW=..#WWWWWWWWWWWWW+.=WWWW+..............");
		System.out.println("								................*WWWW@-:WWWWWWWWWWW*.-#WWWW*...............");
		System.out.println("								-.-..............+WWWWW#:.-=WWWW=..-#WWWWW+-.-.-...........");
		System.out.println("								-.-.-.-.-..........=WWWWWWWWWWWWWWWWWWWW=-.-.-.-.-.-.-.....");
		System.out.println("								-.-.-.-.-.-..........+@WWWWWWWWWWWWWW@+-.-.-.-.-.-.-.-.-...");
		System.out.println("								-.-.-.-.-.-.-...........-+=@WWWW@=+-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-............:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-............:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-.-..........:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-.-.-WWWWWWWWWWWWWWWWWWWWWW:.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-.-.-WWWWWWWWWWWWWWWWWWWWWW:.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-.-..........:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-............:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-.-............:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-.-..............:WWWW+-.-.-.-.-.-.-.-.-.-.-.-.-.");
		System.out.println("								-.-.-.-.-.-................-****-..-.-.-.-.-.-.-.-.-.-.-...");
		System.out.println("								-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-...-.-.-.-.-.-.-.-.-.-..");
		System.out.println();
		System.out.println();
		System.out.println(" Seja bem-vinde! Vamos conhecer um pouco sobre grandes mulheres na ciência e tecnologia!!");
		System.out.println();
		
	}
	
	//método para calcular a idade atual ou a idade da morte
	public int vida() {
		
		int idade = 0;
		int anoAtual = 2020;
		
		if(viva == 's') {
			
			idade = anoAtual - anoNasc;

		}
		
		else if(viva == 'n') {
			
			idade = anoMorte - anoNasc;
			
		}
		
		return idade;
	}
	
	
	
	//método resumo área 
	
	public void resumoArea() {
		
		
	}
	
	//método resumo pessoal
	
	public void resumoPessoal() {
		
		
	}
	
	public void pular() {
		
		for(int x = 0; x <50; x++) {
			
			System.out.println();
		}
		
	}
	
	public void volta1() {

		
		System.out.println("\n Para conhecer mais mulheres incrivéis ou para sair :( , selecione uma das opções abaixo: ");
		System.out.println("\n 1 - Conhecer mais \n 6 - Sair");
		
		
	}	

	public void volta2() {

		
		System.out.println("\n Para conhecer mais mulheres incrivéis ou para sair :( , selecione uma das opções abaixo: ");
		System.out.println("\n 2 - Conhecer mais \n 6 - Sair");
		
		
	}	
	
	public void volta3() {

		
		System.out.println("\n Para conhecer mais mulheres incrivéis ou para sair :( , selecione uma das opções abaixo: ");
		System.out.println("\n 3 - Conhecer mais \n 7 - Sair");
		
		
	}	
		

}
