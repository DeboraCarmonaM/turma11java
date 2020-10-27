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
			
			System.out.println("\n 	Nesta se��o iremos apresentar para voc�s grandes mulheres das �reas da sa�de, meio ambiente e biol�gicas. \n");
		}

		
		//fun��o resumo pessoal
		
		public void wangari() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	Laureada com o Pr�mio Nobel da Paz de 2004, a professroa queniana Wangari Maathai aliou pol�ticas de preserva��o ambiental ao progresso feminino de seu pa�s."
					+ "\n	Um de seus principais feitos foi o Movimento do Cintur�o Verde, funda��o que remunera mulheres africanas ao incentiv�-las a plantar �rvores para combater o desmatamento e "
					+ "\n	desertifica��o da regi�o. As Na��es Unidas estimam que cerca de 900 mil mulheres tenham colaborado com o projeto, que as ajuda a sustentar suas fam�lias."
					+ "\n	�Naquela parte da �frica, s�o as mulheres as primeiras v�timas da degrada��o ambiental, porque s�o elas que v�o buscar �gua; ent�o, se n�o h� mais �gua, "
					+ "\n	s�o elas que t�m de caminhar durante horas para traz�-la�, explica Wangari. �S�o elas que buscam lenha. S�o elas que produzem alimento para as fam�lias. "
					+ "\n	Assim, � f�cil explicar a elas que o meio ambiente est� degradado e persuadi-las a agir"
					);
			
		}
		
		public void blackwell() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	Elizabeth Blackwell foi a primeira mulher a receber um diploma de medicina nos Estados Unidos. Se formou em 1849, na Geneva Medical College, onde mais tarde sua irm� tamb�m concluiu o curso."
					+ "\n	Ao longo de toda a sua vida, Elizabeth teve que trabalhar muito para conseguir reconhecimento na �rea. Seus amigos n�o acreditavam que ela conseguiria ser aceita em um curso de medicina. "
					+ "\n	Quando isso aconteceu, tentaram distanci�-la do resto dos alunos (todos homens) v�rias vezes, inclusive durante as aulas, quando abordavam a reprodu��o humana � na �poca, o tema era considerado inapropriado para uma mulher."
					+ "\n	Depois de formada, abriu caminho para que outras mulheres seguissem a carreira m�dica e fundou diversas institui��es como a New York Infirmary for Indigent Women and Children, a Woman�s Medical College da New York Infirmary, "
					+ "\n	a London School of Medicine for Women e a National Health Society."
					);
			
			
		}
		
		public void lutz() {
			
			System.out.println("\n 								Um pouco da sua hist�ria...\n "
					+ "\n	Filha do m�dico Adolfo Lutz e da enfermeira inglesa Amy Bruce Lee, Bertha seguiu os passos cient�ficos dos pais e se tornou uma das maiores bi�logas da hist�ria brasileira. "
					+ "\n	Mas al�m da ci�ncia, Bertha se dedicava a outra paix�o: a luta pelos direitos da mulher."
					+ "\n	Foi esse tema que a influenciou a estudar Direito, para que ent�o pudesse atuar mais ativamente no processo de aprova��o do voto feminino no Brasil, que ocorreu em 1932."
					+ "\n	Antes disso, Bertha estava a frente da funda��o e organiza��o de diversas organiza��es do movimento sufragista brasileiro. Foi tamb�m pesquisadora do Museu Nacional, no Rio de Janeiro."
					+ "\n	�Para a mulher vencer na vida, ela tem que se atirar. Se erra uma vez, tem que tentar outras cem. � justamente a nova gera��o a respons�vel para levar avante a luta da mulher pela igualdade�, disse Bertha Lutz."
					);
		}
		
		public void mamie() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	Quando Mamie nasceu em 1917, a popula��o negra ainda vivia segregada e � margem de servi�os de educa��o e sa�de nos Estados Unidos. Para ajudar a reverter esse quadro, ela se dedicou ao estudo da psicologia e "
					+ "\n	fez um mestrado sobre como a quest�o racial impacta a identidade de crian�as negras. Em 1943, se tornou a primeira-mulher negra a obter o doutorado na Universidade de Columbia (foi tamb�m a segunda pessoa afro-americana "
					+ "\n	a alcan�ar o t�tulo, pois a primeira havia sido seu marido, Kenneth Clark)."
					+ "\n	Junto com Kenneth, ficou conhecida pelos experimentos com bonecas brancas e negras, que mostraram como o racismo prejudica a autoimagem da popula��o negra. Seu estudo ajudou a acabar com a segrega��o em escolas p�blicas em 1954."
					);
			
		}
		
	public void bath() {
			
			System.out.println("\n								Um pouco da sua hist�ria...\n "
					+ "\n	Patricia sempre soube que queria ser m�dica, mas enfrentou muita discrimina��o para entrar em uma faculdade de medicina. Apesar de, na sua �poca, j� permitirem a presen�a de mulheres em faculdades, o ensino superior "
					+ "\n	ainda era uma possiblidade distante para alunos negros."
					+ "\n	Conseguiu uma vaga no curso de medicina da Howard University e come�ou a estagiar no Hospital do Halem, onde nasceu e cresceu. Mais tarde, foi aceita em um programa de resid�ncia de Columbia, mas nunca deixou de atuar em seu bairro."
					+ "\n	Come�ou a trabalhar com oftalmologia e notou que pessoas de comunidades mais pobres tinham uma tend�ncia maior para desenvolver problemas de vis�o porque geralmenete n�o passavam pelo diagn�stico e tratamento adequados."
					+ "\n	Criou tratamentos para catarata e foi cofundadora da American Institute for the Prevention of Blindness. O sucesso de sua pesquia lhe garantiu uma vaga entre os docentes da Universidade da Calif�rnia em Los Angeles, Estados Unidos. "
					+ "\n	Foi a primeira professora de oftalmologia da institui��o."
					);
		}
		


}
