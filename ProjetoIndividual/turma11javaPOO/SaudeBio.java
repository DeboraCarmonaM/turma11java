package turma11javaPOO;

public class SaudeBio extends Mulheres{
	
	//construtores
	
	public SaudeBio(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade, char viva,
			int anoMorte) {
		super(nome, anoNasc, dataAniversario, area, nacionalidade, viva, anoMorte);
		// TODO Auto-generated constructor stub
	}

	public SaudeBio(String nome, int anoNasc, String dataAniversario, String area, String nacionalidade, char viva) {
		super(nome, anoNasc, dataAniversario, area, nacionalidade, viva);
		// TODO Auto-generated constructor stub
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
			
			System.out.println("\n 	Nesta seção iremos apresentar para vocês grandes mulheres das áreas da saúde, meio ambiente e biológicas. \n");
		}

		
		//função resumo pessoal
		
		public void wangari() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	Laureada com o Prêmio Nobel da Paz de 2004, a professroa queniana Wangari Maathai aliou políticas de preservação ambiental ao progresso feminino de seu país."
					+ "\n	Um de seus principais feitos foi o Movimento do Cinturão Verde, fundação que remunera mulheres africanas ao incentivá-las a plantar árvores para combater o desmatamento e "
					+ "\n	desertificação da região. As Nações Unidas estimam que cerca de 900 mil mulheres tenham colaborado com o projeto, que as ajuda a sustentar suas famílias."
					+ "\n	“Naquela parte da África, são as mulheres as primeiras vítimas da degradação ambiental, porque são elas que vão buscar água; então, se não há mais água, "
					+ "\n	são elas que têm de caminhar durante horas para trazê-la”, explica Wangari. “São elas que buscam lenha. São elas que produzem alimento para as famílias. "
					+ "\n	Assim, é fácil explicar a elas que o meio ambiente está degradado e persuadi-las a agir"
					);
			
		}
		
		public void blackwell() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	Elizabeth Blackwell foi a primeira mulher a receber um diploma de medicina nos Estados Unidos. Se formou em 1849, na Geneva Medical College, onde mais tarde sua irmã também concluiu o curso."
					+ "\n	Ao longo de toda a sua vida, Elizabeth teve que trabalhar muito para conseguir reconhecimento na área. Seus amigos não acreditavam que ela conseguiria ser aceita em um curso de medicina. "
					+ "\n	Quando isso aconteceu, tentaram distanciá-la do resto dos alunos (todos homens) várias vezes, inclusive durante as aulas, quando abordavam a reprodução humana — na época, o tema era considerado inapropriado para uma mulher."
					+ "\n	Depois de formada, abriu caminho para que outras mulheres seguissem a carreira médica e fundou diversas instituições como a New York Infirmary for Indigent Women and Children, a Woman’s Medical College da New York Infirmary, "
					+ "\n	a London School of Medicine for Women e a National Health Society."
					);
			
			
		}
		
		public void lutz() {
			
			System.out.println("\n 								Um pouco da sua história...\n "
					+ "\n	Filha do médico Adolfo Lutz e da enfermeira inglesa Amy Bruce Lee, Bertha seguiu os passos científicos dos pais e se tornou uma das maiores biólogas da história brasileira. "
					+ "\n	Mas além da ciência, Bertha se dedicava a outra paixão: a luta pelos direitos da mulher."
					+ "\n	Foi esse tema que a influenciou a estudar Direito, para que então pudesse atuar mais ativamente no processo de aprovação do voto feminino no Brasil, que ocorreu em 1932."
					+ "\n	Antes disso, Bertha estava a frente da fundação e organização de diversas organizações do movimento sufragista brasileiro. Foi também pesquisadora do Museu Nacional, no Rio de Janeiro."
					+ "\n	“Para a mulher vencer na vida, ela tem que se atirar. Se erra uma vez, tem que tentar outras cem. É justamente a nova geração a responsável para levar avante a luta da mulher pela igualdade”, disse Bertha Lutz."
					);
		}
		
		public void mamie() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	Quando Mamie nasceu em 1917, a população negra ainda vivia segregada e à margem de serviços de educação e saúde nos Estados Unidos. Para ajudar a reverter esse quadro, ela se dedicou ao estudo da psicologia e "
					+ "\n	fez um mestrado sobre como a questão racial impacta a identidade de crianças negras. Em 1943, se tornou a primeira-mulher negra a obter o doutorado na Universidade de Columbia (foi também a segunda pessoa afro-americana "
					+ "\n	a alcançar o título, pois a primeira havia sido seu marido, Kenneth Clark)."
					+ "\n	Junto com Kenneth, ficou conhecida pelos experimentos com bonecas brancas e negras, que mostraram como o racismo prejudica a autoimagem da população negra. Seu estudo ajudou a acabar com a segregação em escolas públicas em 1954."
					);
			
		}
		
	public void bath() {
			
			System.out.println("\n								Um pouco da sua história...\n "
					+ "\n	Patricia sempre soube que queria ser médica, mas enfrentou muita discriminação para entrar em uma faculdade de medicina. Apesar de, na sua época, já permitirem a presença de mulheres em faculdades, o ensino superior "
					+ "\n	ainda era uma possiblidade distante para alunos negros."
					+ "\n	Conseguiu uma vaga no curso de medicina da Howard University e começou a estagiar no Hospital do Halem, onde nasceu e cresceu. Mais tarde, foi aceita em um programa de residência de Columbia, mas nunca deixou de atuar em seu bairro."
					+ "\n	Começou a trabalhar com oftalmologia e notou que pessoas de comunidades mais pobres tinham uma tendência maior para desenvolver problemas de visão porque geralmenete não passavam pelo diagnóstico e tratamento adequados."
					+ "\n	Criou tratamentos para catarata e foi cofundadora da American Institute for the Prevention of Blindness. O sucesso de sua pesquia lhe garantiu uma vaga entre os docentes da Universidade da Califórnia em Los Angeles, Estados Unidos. "
					+ "\n	Foi a primeira professora de oftalmologia da instituição."
					);
		}
		


}
