package turma11javaPOO;

public class FisiMatematica extends Mulheres{
	
	private int teste;

	//construtores 
	
	public FisiMatematica(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade,
			char viva, int anoMorte) {
		
		super(nome, anoNasc, dataAniversario, area, nacionalidade, viva, anoMorte);
	}

	public FisiMatematica() {
		
	}

	public FisiMatematica(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade,
			char viva) {
		
		super(nome, anoNasc, dataAniversario, area, nacionalidade, viva);
	}
	
	@Override 
	
	//função para calcular a idade atual ou a idade da morte
		public int vida() {
			
			int idade = 0;
			int anoAtual = 2020;
			
			if(super.getViva() == 's') {
				
				idade = anoAtual - super.getAnoNasc();

			}
			
			else if(super.getViva()== 'n') {
				
				idade = super.getAnoMorte() - super.getAnoNasc();
				
			}
			
			return idade;
		}
		
	@Override 
	
	//função resumo área 
	
		public void resumoArea() {
			
			System.out.println("\n Nesta seção iremos falar um pouco sobre algumas mulheres que fizeram a diferença nas Ciências Exatas, mais espeficicamente, falaremos de grandes mulheres Matemáticas e Físicas.\n");
		}

		
		//função resumo pessoal
		
		public void chien() {
			
			System.out.println("\n								Um pouco da sua história...\n"
					+ "\n	A chinesa Chien-Shiung Wu foi a primeira mulher a se tornar membro da American Physical Society. "
					+ "\n	Criada em uma família progressista, ela sempre foi encorajada a seguir os estudos e começou a sua jornada na primeira escola para meninas da sua cidade, "
					+ "\n	construída pelo seu pai, um importante ativista pelos direitos das mulheres."
					+ "\n	Se mudou para os Estados UNidos em 1936 e lá desenvolveu a maioria se suas pesquisas. Estudou o enriquecimento de urânio, trabalhou no Projeto Manhattan "
					+ "\n	e refutou a lei da conservação da paridade."
					+ "\n	Seu trabalho e sua presença nos laboratórios quebrou paradigmas e mudou a história. "
					+ "\n	“O principal bloqueio no caminho de qualquer progresso é e sempre foi a tradição inquestionável”, considerava Chien-Shiung Wu.");
			
		}
		
		public void mae() {
			
			System.out.println("\n								Um pouco da sua história...\n"
					+ "\n	Astronauta, médica, empreendedora e fã de Star Trek. Foi por ter se inspirando na tenente Uhura desde pequena, que Mae Jemison se tornou a"
					+ " \n	primeira mulher afro-americana a chegar ao espaço. A bordo do ônibus espacial Endeavour, ela representou a população negra ao levar uma "
					+ "\n	estátua bundu, um poster da dançarina negra Judith Jamison e uma bandeira da primeira irmandade de universitárias afro-americanas."
					+ "\n	Antes de ir para o espaço, a polímata já tinha cursado engenharia química, medicina e estudos afro-americanos nas melhores universidades dos Estados Unidos. "
					+ "\n	Quando voltou da viagem espacial, começou a investir em projetos tecnológicos."
					+ "\n	“A primiera coisa sobre o empoderamento é entender que você tem o direito de estar envolvida. A segunda é que você tem contribuições importantes a fazer, "
					+ "\n	e a terceira é que você tem de se arriscar para fazer essas contribuições”, disse Mae Jemison.");
			
			
		}
		
		public void kalpana() {
			
			System.out.println("\n 								Um pouco da sua história...\n"
					+ "\n	Apesar de seus pais não apoiarem suas decisões profissionais, a indiana Kalpana Chawla estudou engenharia aeroespacial e se mudou para os Estados Unidos"
					+ "\n	a fim de se tornar uma astronauta. Em 1997, fez seu primeiro voo e ficou conhecida por ser a primeira mulher indiana a ir para o espaço."
					+ "\n	O feito a tornou famosa em seu país, onde inspirou diversos jovens a perseguir o sonho de ser um cientista."
					+ "\n	Infelizmente, Kalpana foi uma das sete vítimas da explosão do ônibus espacial Columbia, ocorrido em 2003. "
					+ "\n	Seu nome ainda é lembrado na Índia como sinônimo de pioneirismo.");
		}
		
		public void maryam() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	Nascida no Irã, Maryam Mirzakhani é a única mulher a ganhar a Medalha Fields, o Nobel da matemática. Suas contribuições ajudaram o avanço da "
					+ "\n	geometria hiperbólica, gerando equações para compreender formas e superfícies curvas."
					+ "\n	Para chegar onde chegou, Maryam teve que pedir que sua escola, que era só para meninas, desse o mesmo conteúdo que as escolas para meninos ensinavam. "
					+ "\n	Mais tarde, se formou em Harvard e deu aulas em Stanford. Infelizmente, faleceu em 2017, aos 40 anos, por um câncer de mama.");
		}

}
