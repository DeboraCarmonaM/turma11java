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
	
	//fun��o para calcular a idade atual ou a idade da morte
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
	
	//fun��o resumo �rea 
	
		public void resumoArea() {
			
			System.out.println("\n Nesta se��o iremos falar um pouco sobre algumas mulheres que fizeram a diferen�a nas Ci�ncias Exatas, mais espeficicamente, falaremos de grandes mulheres Matem�ticas e F�sicas.\n");
		}

		
		//fun��o resumo pessoal
		
		public void chien() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n"
					+ "\n	A chinesa Chien-Shiung Wu foi a primeira mulher a se tornar membro da American Physical Society. "
					+ "\n	Criada em uma fam�lia progressista, ela sempre foi encorajada a seguir os estudos e come�ou a sua jornada na primeira escola para meninas da sua cidade, "
					+ "\n	constru�da pelo seu pai, um importante ativista pelos direitos das mulheres."
					+ "\n	Se mudou para os Estados UNidos em 1936 e l� desenvolveu a maioria se suas pesquisas. Estudou o enriquecimento de ur�nio, trabalhou no Projeto Manhattan "
					+ "\n	e refutou a lei da conserva��o da paridade."
					+ "\n	Seu trabalho e sua presen�a nos laborat�rios quebrou paradigmas e mudou a hist�ria. "
					+ "\n	�O principal bloqueio no caminho de qualquer progresso � e sempre foi a tradi��o inquestion�vel�, considerava Chien-Shiung Wu.");
			
		}
		
		public void mae() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n"
					+ "\n	Astronauta, m�dica, empreendedora e f� de Star Trek. Foi por ter se inspirando na tenente Uhura desde pequena, que Mae Jemison se tornou a"
					+ " \n	primeira mulher afro-americana a chegar ao espa�o. A bordo do �nibus espacial Endeavour, ela representou a popula��o negra ao levar uma "
					+ "\n	est�tua bundu, um poster da dan�arina negra Judith Jamison e uma bandeira da primeira irmandade de universit�rias afro-americanas."
					+ "\n	Antes de ir para o espa�o, a pol�mata j� tinha cursado engenharia qu�mica, medicina e estudos afro-americanos nas melhores universidades dos Estados Unidos. "
					+ "\n	Quando voltou da viagem espacial, come�ou a investir em projetos tecnol�gicos."
					+ "\n	�A primiera coisa sobre o empoderamento � entender que voc� tem o direito de estar envolvida. A segunda � que voc� tem contribui��es importantes a fazer, "
					+ "\n	e a terceira � que voc� tem de se arriscar para fazer essas contribui��es�, disse Mae Jemison.");
			
			
		}
		
		public void kalpana() {
			
			System.out.println("\n 								Um pouco da sua hist�ria...\n"
					+ "\n	Apesar de seus pais n�o apoiarem suas decis�es profissionais, a indiana Kalpana Chawla estudou engenharia aeroespacial e se mudou para os Estados Unidos"
					+ "\n	a fim de se tornar uma astronauta. Em 1997, fez seu primeiro voo e ficou conhecida por ser a primeira mulher indiana a ir para o espa�o."
					+ "\n	O feito a tornou famosa em seu pa�s, onde inspirou diversos jovens a perseguir o sonho de ser um cientista."
					+ "\n	Infelizmente, Kalpana foi uma das sete v�timas da explos�o do �nibus espacial Columbia, ocorrido em 2003. "
					+ "\n	Seu nome ainda � lembrado na �ndia como sin�nimo de pioneirismo.");
		}
		
		public void maryam() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	Nascida no Ir�, Maryam Mirzakhani � a �nica mulher a ganhar a Medalha Fields, o Nobel da matem�tica. Suas contribui��es ajudaram o avan�o da "
					+ "\n	geometria hiperb�lica, gerando equa��es para compreender formas e superf�cies curvas."
					+ "\n	Para chegar onde chegou, Maryam teve que pedir que sua escola, que era s� para meninas, desse o mesmo conte�do que as escolas para meninos ensinavam. "
					+ "\n	Mais tarde, se formou em Harvard e deu aulas em Stanford. Infelizmente, faleceu em 2017, aos 40 anos, por um c�ncer de mama.");
		}

}
