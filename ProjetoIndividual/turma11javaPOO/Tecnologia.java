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
			
			System.out.println("\n 	Nesta seção iremos apresentar para vocês algumas mulheres que fizeram a diferença na área Tecnológica.\n");
		}

		
		//função resumo pessoal
		
		public void radia() {
			
			System.out.println("\n								Um pouco da sua história...\n"
					+ "\n	Radia Perlman é uma cientista da computação estadunidense, projetista de software e engenheira de redes. É algumas vezes referenciada como a \"mãe da Internet\""
					+ "\n	por sua invenção do protocolo Spanning Tree (STP), que é fundamental para a operação de pontes de rede mais conhecida por bridge (redes de computadores),"
					+ "\n	enquanto trabalhava para a Digital Equipment Corporation. Ela também fez grandes contribuições para muitas outras áreas de design e padronização de redes, "
					+ "\n	como os protocolos de roteamento link-state."
					+ "\n	Mais recentemente, ela inventou o protocolo TRILL para corrigir algumas das deficiências das spanning trees. Atualmente, ela é funcionária da Dell EMC.");
			
		}
		
		public void mary() {
			
			System.out.println("\n								Um pouco da sua história...\n"
					+ "\n	Mary Kenneth Keller foi uma freira estadunidense. Foi uma importante educadora e pioneira da computação, tornando-se a primeira mulher a ter um doutorado em "
					+ "\n	computação nos EUA, no ano de 1965. O título de sua tese era a “Inferência indutiva dos modelos gerados pelo computador”."
					+ "\n	A Irmã Mary Kenneth Keller é reconhecida como a primeira doutora em computação na história "
					+ "\n	Além da importante conquista, simbólica para as lutas das mulheres, A Irmã Mary Kenneth Keller possuía uma visão que hoje é aceita como uma unanimidade na área da "
					+ "\n	tecnologia: a inclusão social através da tecnologia. Envolvida com educação, didática e ensino, a Irmã enxergava nos computadores um potencial para ferramentas educacionais "
					+ "\n	e desenvolvimento humano."
					+ "\n	Após seu doutorado, a Irmã fundou um departamento de computação na Universidade Clarke, ao qual chefiou até o seu falecimento, em 1985. "
					+ "\n	Sua influência é vista até hoje, com 4 livros publicados que são referência para a área.");
			
			
		}
		
		public void ada() {
			
			System.out.println("\n 								Um pouco da sua história...\n"
					+ "\n	A única filha legítima de Lord Byron, (sim, o poeta que estudamos na literatura), é considerada a primeira programadora da História. Apaixonada pela matemática, desenvolveu durante "
					+ "\n	sua juventude uma relação de trabalho e amizade com Charles Babbage, sobretudo com a Máquina Analítica."
					+ "\n	Após fazer a tradução do artigo de um engenheiro militar italiano sobre a Máquina Analítica, Ada adicionou suas próprias anotações. As notas, que foram classificadas alfabeticamente de A a G, "
					+ "\n	contêm um algoritmo para a Máquina Analítica computar a Sequência de Bernoulli. Esse algoritmo é considerado o primeiro a ser implementado por um computador, "
					+ "\n	sendo este o motivo de Ada ser considerada a primeira pessoa a programar em toda a História."
					+ "\n	A Condessa de Lovelace não viveu tempo suficiente para ver a Máquina Analítica pronta e seu algoritmo funcionando. Porém, em 1953, mais de cem anos após a sua morte, "
					+ "\n	suas anotações foram republicadas. A máquina foi reconhecida como o primeiro modelo de computador, e as notas de Ada como a primeira descrição de um computador e um software.");
		}
		
		public void hopper() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	Grace Hopper é uma mulher pioneira, considerada a inventora do termo bug"
					+ "\n	Hopper foi analista de sistemas da Marinha dos EUA entre as décadas de 40 e 50. Durante este período, ela criou a linguagem de programação Flow-Matic, "
					+ "\n	que foi a primeira adaptada para um idioma humano. Anos mais tarde, ela serviu como base para a criação do COBOL, em 1959."
					+ "\n	Além disso, Hopper foi designada para a equipe de Serviço de Computação Naval em Harvard. A intenção era de que essa máquina fosse capaz de fazer cálculos "
					+ "\n	rapidamente para assuntos de guerra. Este computador foi o famoso Mark I, da IBM. Grace foi a pessoa responsável pela programação dele."
					+ "\n	Sua história mais famosa, no entanto, está relacionada ao termo “bug”. Grace teria resolvido um problema no processamento do Mark II, após encontrar uma mariposa"
					+ "\n	que estava criando um ninho no computador. O trabalho então seria um “debugging”, literalmente removendo um inseto da máquina."
					+ "\n	Ela foi enterrada com honras militares, foi a segunda mulher homenageada pelo navio USS Hopper, um destroyer lança-misseis.");
			
		}
		
	public void hamilton() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	A Missão Apollo 11, ocorrida em julho de 1969, é conhecida por todos nós. Mas, ao pensarmos nela, nos lembramos de nomes como: Neil Armstrong e Buzz Aldrin. "
					+ "\n	Porém, a matemática Margaret Hamilton também teve grande importância no sucesso da missão."
					+ "\n	Em 1959, ela começou a trabalhar como programadora e, em 1963, soube do contrato que a MIT havia feito com a NASA para desenvolver um software que levasse o homem à Lua."
					+ "\n	Hamilton, então, decidiu se aplicar para o projeto e logo se tornou parte da equipe de programação. Em entrevista ao Futurism, Hamilton contou que conciliava sua vida pessoal "
					+ "\n	e profissional levando sua filha para trabalhar com ela durante a semana e os fins de semana."
					+ "\n	Ela continuou crescendo e se tornou diretora de desenvolvimento de software da Apollo. Ganhou o prêmio da NASA Exceptional Space Act Award e hoje é CEO da sua empresa"
					+ "\n	Hamilton Technologies. Fundada em 1986, a empresa fornece soluções de modernização do planejamento e engenharia de softwares para outras empresas.");
		}
		
	public void johnson() {
		
		System.out.println("\n								Um pouco da sua história...\n "
				+ "\n	Junto com suas colegas Dorothy Vaughan e Mary Jackson, a história de Katherine Johnson inspirou a história do filme “Estrelas Além do Tempo”, indicado a três Oscar."
				+ "\n	Katherine trabalhou durante 33 anos na Nasa e quebrou várias barreiras impostas às mulheres negras dentro da agência espacial. Em seu primeiro cargo, o de computador "
				+ "\n	humano (trabalho das pessoas que faziam os cálculos por trás de todas as invenções da NASA), ela questionou por que as mulheres não podiam participar das reuniões da agência."
				+ "\n	Com o tempo, conseguiu um espaço na sala de reuniões e começou a se envolver em projetos maiores. Seu talento para matemática a promoveu para o cargo de líder de cálculos de "
				+ "\n	trajetória e a incluiu em equipes de missões para Lua e Marte.");
	}

}
