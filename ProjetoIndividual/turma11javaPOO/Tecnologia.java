package turma11javaPOO;

public class Tecnologia extends Mulheres {
	
	//construtores

	public Tecnologia(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade, char viva,
			int anoMorte) {
		super(nome, anoNasc, dataAniversario, area, nacionalidade, viva, anoMorte);
	}

	public Tecnologia(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade, char viva) {
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
			
			System.out.println("\n 	Nesta se��o iremos apresentar para voc�s algumas mulheres que fizeram a diferen�a na �rea Tecnol�gica.\n");
		}

		
		//fun��o resumo pessoal
		
		public void radia() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n"
					+ "\n	Radia Perlman � uma cientista da computa��o estadunidense, projetista de software e engenheira de redes. � algumas vezes referenciada como a \"m�e da Internet\""
					+ "\n	por sua inven��o do protocolo Spanning Tree (STP), que � fundamental para a opera��o de pontes de rede mais conhecida por bridge (redes de computadores),"
					+ "\n	enquanto trabalhava para a Digital Equipment Corporation. Ela tamb�m fez grandes contribui��es para muitas outras �reas de design e padroniza��o de redes, "
					+ "\n	como os protocolos de roteamento link-state."
					+ "\n	Mais recentemente, ela inventou o protocolo TRILL para corrigir algumas das defici�ncias das spanning trees. Atualmente, ela � funcion�ria da Dell EMC.");
			
		}
		
		public void mary() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n"
					+ "\n	Mary Kenneth Keller foi uma freira estadunidense. Foi uma importante educadora e pioneira da computa��o, tornando-se a primeira mulher a ter um doutorado em "
					+ "\n	computa��o nos EUA, no ano de 1965. O t�tulo de sua tese era a �Infer�ncia indutiva dos modelos gerados pelo computador�."
					+ "\n	A Irm� Mary Kenneth Keller � reconhecida como a primeira doutora em computa��o na hist�ria "
					+ "\n	Al�m da importante conquista, simb�lica para as lutas das mulheres, A Irm� Mary Kenneth Keller possu�a uma vis�o que hoje � aceita como uma unanimidade na �rea da "
					+ "\n	tecnologia: a inclus�o social atrav�s da tecnologia. Envolvida com educa��o, did�tica e ensino, a Irm� enxergava nos computadores um potencial para ferramentas educacionais "
					+ "\n	e desenvolvimento humano."
					+ "\n	Ap�s seu doutorado, a Irm� fundou um departamento de computa��o na Universidade Clarke, ao qual chefiou at� o seu falecimento, em 1985. "
					+ "\n	Sua influ�ncia � vista at� hoje, com 4 livros publicados que s�o refer�ncia para a �rea.");
			
			
		}
		
		public void ada() {
			
			System.out.println("\n 								Um pouco da sua hist�ria...\n"
					+ "\n	A �nica filha leg�tima de Lord Byron, (sim, o poeta que estudamos na literatura), � considerada a primeira programadora da Hist�ria. Apaixonada pela matem�tica, desenvolveu durante "
					+ "\n	sua juventude uma rela��o de trabalho e amizade com Charles Babbage, sobretudo com a M�quina Anal�tica."
					+ "\n	Ap�s fazer a tradu��o do artigo de um engenheiro militar italiano sobre a M�quina Anal�tica, Ada adicionou suas pr�prias anota��es. As notas, que foram classificadas alfabeticamente de A a G, "
					+ "\n	cont�m um algoritmo para a M�quina Anal�tica computar a Sequ�ncia de Bernoulli. Esse algoritmo � considerado o primeiro a ser implementado por um computador, "
					+ "\n	sendo este o motivo de Ada ser considerada a primeira pessoa a programar em toda a Hist�ria."
					+ "\n	A Condessa de Lovelace n�o viveu tempo suficiente para ver a M�quina Anal�tica pronta e seu algoritmo funcionando. Por�m, em 1953, mais de cem anos ap�s a sua morte, "
					+ "\n	suas anota��es foram republicadas. A m�quina foi reconhecida como o primeiro modelo de computador, e as notas de Ada como a primeira descri��o de um computador e um software.");
		}
		
		public void hopper() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	Grace Hopper � uma mulher pioneira, considerada a inventora do termo bug"
					+ "\n	Hopper foi analista de sistemas da Marinha dos EUA entre as d�cadas de 40 e 50. Durante este per�odo, ela criou a linguagem de programa��o Flow-Matic, "
					+ "\n	que foi a primeira adaptada para um idioma humano. Anos mais tarde, ela serviu como base para a cria��o do COBOL, em 1959."
					+ "\n	Al�m disso, Hopper foi designada para a equipe de Servi�o de Computa��o Naval em Harvard. A inten��o era de que essa m�quina fosse capaz de fazer c�lculos "
					+ "\n	rapidamente para assuntos de guerra. Este computador foi o famoso Mark I, da IBM. Grace foi a pessoa respons�vel pela programa��o dele."
					+ "\n	Sua hist�ria mais famosa, no entanto, est� relacionada ao termo �bug�. Grace teria resolvido um problema no processamento do Mark II, ap�s encontrar uma mariposa"
					+ "\n	que estava criando um ninho no computador. O trabalho ent�o seria um �debugging�, literalmente removendo um inseto da m�quina."
					+ "\n	Ela foi enterrada com honras militares, foi a segunda mulher homenageada pelo navio USS Hopper, um destroyer lan�a-misseis.");
			
		}
		
	public void hamilton() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	A Miss�o Apollo 11, ocorrida em julho de 1969, � conhecida por todos n�s. Mas, ao pensarmos nela, nos lembramos de nomes como: Neil Armstrong e Buzz Aldrin. "
					+ "\n	Por�m, a matem�tica Margaret Hamilton tamb�m teve grande import�ncia no sucesso da miss�o."
					+ "\n	Em 1959, ela come�ou a trabalhar como programadora e, em 1963, soube do contrato que a MIT havia feito com a NASA para desenvolver um software que levasse o homem � Lua."
					+ "\n	Hamilton, ent�o, decidiu se aplicar para o projeto e logo se tornou parte da equipe de programa��o. Em entrevista ao Futurism, Hamilton contou que conciliava sua vida pessoal "
					+ "\n	e profissional levando sua filha para trabalhar com ela durante a semana e os fins de semana."
					+ "\n	Ela continuou crescendo e se tornou diretora de desenvolvimento de software da Apollo. Ganhou o pr�mio da NASA Exceptional Space Act Award e hoje � CEO da sua empresa"
					+ "\n	Hamilton Technologies. Fundada em 1986, a empresa fornece solu��es de moderniza��o do planejamento e engenharia de softwares para outras empresas.");
		}
		
	public void johnson() {
		
		System.out.println("\n								Um pouco da sua hist�ria...\n "
				+ "\n	Junto com suas colegas Dorothy Vaughan e Mary Jackson, a hist�ria de Katherine Johnson inspirou a hist�ria do filme �Estrelas Al�m do Tempo�, indicado a tr�s Oscar."
				+ "\n	Katherine trabalhou durante 33 anos na Nasa e quebrou v�rias barreiras impostas �s mulheres negras dentro da ag�ncia espacial. Em seu primeiro cargo, o de computador "
				+ "\n	humano (trabalho das pessoas que faziam os c�lculos por tr�s de todas as inven��es da NASA), ela questionou por que as mulheres n�o podiam participar das reuni�es da ag�ncia."
				+ "\n	Com o tempo, conseguiu um espa�o na sala de reuni�es e come�ou a se envolver em projetos maiores. Seu talento para matem�tica a promoveu para o cargo de l�der de c�lculos de "
				+ "\n	trajet�ria e a incluiu em equipes de miss�es para Lua e Marte.");
	}

}
