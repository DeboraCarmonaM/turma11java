package turma11javaPOO;

import java.util.Scanner;


public class MulheresProtagonistas {

	public static void main(String[] args) {
		
		//variaveis do programa 
		
				int menu1 = 0, iniciar = 0, menuMat = 0, menuTec = 0, menu2 = 0, menuBio = 0;			
		
				
		//criando obj para super classe
		
		Mulheres abertura = new Mulheres ();
		
		//área matemática/física
		
		FisiMatematica chien = new FisiMatematica("Chien-Shiung Wu",1912,"31 de maio", "Física nuclear", "Chinesa", 'n',  1997 );
		FisiMatematica mae = new FisiMatematica("Mae Jemison",1956,"17 de outubro", "Engenheira/Astronauta", "Estadunidense", 's');
		FisiMatematica kalpana = new FisiMatematica("Kalpana Chawla",1961,"1 de julho", "Engenheira Aeroespacial/Astronauta", "Indiana", 'n',  2003 );
		FisiMatematica maryam = new FisiMatematica("Maryam Mirzakhani",1977,"12 de maio", "Matemática", "Iraniana", 'n',  2017 );
		
		//área tecnológica
		
		Tecnologia ada = new Tecnologia ("Ada Lovelace",1815,"10 de dezembro", "Cientista da Computação", "Inglesa", 'n', 1852);
		Tecnologia hopper = new Tecnologia ("Grace Hopper",1906,"9 de dezembro", "Programadora", "Estadunidense", 'n', 1992);
		Tecnologia mary = new Tecnologia ("Irmã Mary Kenneth Keller",1913,"dezembro", "Cientista da Computação/Freira", "Estadunidense", 'n', 1985);
		Tecnologia radia = new Tecnologia ("Radia Perlman",1951,"18 de dezembro", "Cientista da Computação", "Estadunidense", 's');
		Tecnologia hamilton = new Tecnologia ("Margaret Hamilton",1936,"17 de agosto", "Cientista da Computação/Engenheira", "Estadunidense", 's');
		Tecnologia johnson = new Tecnologia ("Katherine Johnson",1918,"24 de fevereiro", "Programadora/Física/Matemática/Cientista Espacial", "Estadunidense", 'n', 2020);
		
		//área saúde/biológicas 
		
		SaudeBio wangari = new SaudeBio ("Wangari Maathai",1940,"1 de abril", "Ativista Ambiental/Professora", "Queniana", 'n', 2011);
		SaudeBio blackwell = new SaudeBio ("Elisabeth Blackwell",1821,"3 de fevereiro", "Médica", "Estadunidense", 'n', 1910);
		SaudeBio lutz = new SaudeBio ("Bertha Lutz",1894,"2 de agosto", "Biológa/Ativista Feminista", "Brasileira", 'n', 1976);
		SaudeBio mamie = new SaudeBio ("Mamie Phipps Clark ",1917,"18 de abril", "Psicóloga", "Estadunidense", 'n', 1983);
		SaudeBio bath = new SaudeBio ("Patricia Bath",1942,"4 de novembro", "Médica/Oftalmologista", "Estadunidense", 'n', 2019);
		
		//estanciando o teclado
		
		Scanner leia = new Scanner(System.in);
		
		//String iniciar;
		
		//apresentação programa
		
		abertura.apresentacao();
		
		System.out.print("\n Digite '0' para começarmos: ");
		iniciar = leia.nextInt();
		
			
				//menu para escolha da categoria inicial e apresentação das opções
			
				while(iniciar == 0 || menu1 == 5 || menuMat == 5 || menuTec == 7 || menuBio == 6) {
					
					
					chien.pular();
					
					System.out.println(" Nós fizemos uma divisão por categorias, escolha uma opção abaixo para podermos começar! \n");
					System.out.println(" 1 - MULHERES NA FÍSICA/MATEMÁTICA \n 2 - MULHERES NA TECNOLOGIA \n 3 - MULHERES NA SAÚDE/BIOLÓGICAS \n 4 - SAIR");
					System.out.print("\n OPÇÃO: ");
					menu1 = leia.nextInt();
					iniciar = 1;
					
					//se opção 1 
					//seção física/matemática
					
					while (menu1 == 1) {
						
						chien.pular();
						
						chien.resumoArea();
						
						System.out.println("\n Quem você quer conhecer agora? Escolha uma das opções abaixo: ");
						System.out.println("\n 1 - Chien-Shiung Wu \n 2 - Mae Jemison \n 3 - Kalpana Chawla \n 4 - Maryam Mirzakhani "
								+ "\n 5 - Voltar ao menu prinicipal \n 6 - Sair");
						System.out.print("\n OPÇÃO: ");
						menuMat = leia.nextInt();
						menu1 = 0;
						
						//Chien 
						
						if(menuMat == 1) {
							
							menuMat = 0;
							chien.pular();
							
							System.out.println("\n Nome : " +chien.getNome()+ "\n Nascimento : " +chien.getDataAniversario()+ " de " +chien.getAnoNasc()+
									"\n Nacionalidade : " +chien.getNacionalidade()+ "\n Atuação : " +chien.getArea()+ "\n Morte : Aos " +chien.vida()+ " anos em " +chien.getAnoMorte());
							chien.chien();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							chien.volta1();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						//Mae 
						
						if (menuMat == 2) {
							
							menuMat = 0;
							chien.pular();
							
							System.out.println("\n Nome : " +mae.getNome()+ "\n Nascimento : " +mae.getDataAniversario()+ " de " +mae.getAnoNasc()+
									"\n Nacionalidade : " +mae.getNacionalidade()+ "\n Atuação : " +mae.getArea()+ "\n Idade : " +mae.vida());
							mae.mae();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							chien.volta1();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						//Kalpana
						
						if (menuMat == 3) {
							
							menuMat = 0;
							chien.pular();
							
							System.out.println("\n Nome : " +kalpana.getNome()+ "\n Nascimento : " +kalpana.getDataAniversario()+ " de " +kalpana.getAnoNasc()+
									"\n Nacionalidade : " +kalpana.getNacionalidade()+ "\n Atuação : " +kalpana.getArea()+ "\n Morte : Aos " +kalpana.vida()+ " anos em " +kalpana.getAnoMorte());
									kalpana.kalpana();
									
									//Opção de volta ao menu da categoria ou saída do programa
									
									chien.volta1();
									System.out.print("\n OPÇÃO: ");
									menu1 = leia.nextInt();
						}
						
						//Maryam
						
						if (menuMat == 4) {
							
							
							chien.pular();
							
							System.out.println("\n Nome : " +maryam.getNome()+ "\n Nascimento : " +maryam.getDataAniversario()+ " de " +maryam.getAnoNasc()+
									"\n Nacionalidade : " +maryam.getNacionalidade()+ "\n Atuação : " +maryam.getArea()+ "\n Morte : Aos " +maryam.vida()+ " anos em " +maryam.getAnoMorte());
									maryam.maryam();
									
									//Opção de volta ao menu da categoria ou saída do programa
									
									chien.volta1();
									System.out.print("\n OPÇÃO: ");
									menu1 = leia.nextInt();
							
						}
					}
					
					
					while (menu1 == 2) {
						
						chien.pular();
						
						ada.resumoArea();
						
						System.out.println("\n Quem você quer conhecer agora? Escolha uma das opções abaixo: ");
						System.out.println("\n 1 - Ada Lovelace \n 2 - Grace Hopper \n 3 - Irmã Mary Kenneth Keller \n 4 - Radia Perlman \n 5 - Margaret Hamilton "
								+ "\n 6 - Katherine Johnson \n 7 - Voltar ao menu prinicipal \n 8 - Sair");
						System.out.print("\n OPÇÃO: ");
						menuTec = leia.nextInt();
						menu1 = 0;
						
						if(menuTec == 1) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +ada.getNome()+ "\n Nascimento : " +ada.getDataAniversario()+ " de " +ada.getAnoNasc()+
									"\n Nacionalidade : " +ada.getNacionalidade()+ "\n Atuação : " +ada.getArea()+ "\n Morte : Aos " +ada.vida()+ " anos em " +ada.getAnoMorte());
							ada.ada();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta2();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 2) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +hopper.getNome()+ "\n Nascimento : " +hopper.getDataAniversario()+ " de " +hopper.getAnoNasc()+
									"\n Nacionalidade : " +hopper.getNacionalidade()+ "\n Atuação : " +hopper.getArea()+ "\n Morte : Aos " +hopper.vida()+ " anos em " +hopper.getAnoMorte());
							hopper.hopper();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta2();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 3) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +mary.getNome()+ "\n Nascimento : " +mary.getDataAniversario()+ " de " +mary.getAnoNasc()+
									"\n Nacionalidade : " +mary.getNacionalidade()+ "\n Atuação : " +mary.getArea()+ "\n Morte : Aos " +mary.vida()+ " anos em " +mary.getAnoMorte());
							mary.mary();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta2();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 4) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +radia.getNome()+ "\n Nascimento : " +radia.getDataAniversario()+ " de " +radia.getAnoNasc()+
									"\n Nacionalidade : " +radia.getNacionalidade()+ "\n Atuação : " +radia.getArea()+ "\n Idade : " +radia.vida()+ " anos");
							radia.radia();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta2();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 5) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +hamilton.getNome()+ "\n Nascimento : " +hamilton.getDataAniversario()+ " de " +hamilton.getAnoNasc()+
									"\n Nacionalidade : " +hamilton.getNacionalidade()+ "\n Atuação : " +hamilton.getArea()+ "\n Idade : " +hamilton.vida()+ " anos");
							hamilton.hamilton();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta2();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 6) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +johnson.getNome()+ "\n Nascimento : " +johnson.getDataAniversario()+ " de " +johnson.getAnoNasc()+
									"\n Nacionalidade : " +johnson.getNacionalidade()+ "\n Atuação : " +johnson.getArea()+ "\n Morte : Aos " +johnson.vida()+ " anos em " +johnson.getAnoMorte());
							johnson.johnson();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta2();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
					}
					
					while (menu1 == 3) {
						
						chien.pular();
						
						lutz.resumoArea();
						
						System.out.println("\n Quem você quer conhecer agora? Escolha uma das opções abaixo: ");
						System.out.println("\n 1 - Wangari Maathai \n 2 - Elisabeth Blackwell \n 3 - Bertha Lutz \n 4 - Mamie Phipps Clark \n 5 - Patricia Bath "
								+ "\n 6 - Voltar ao menu prinicipal \n 7 - Sair");
						System.out.print("\n OPÇÃO: ");
						menuBio = leia.nextInt();
						menu1 = 0;
						
						if(menuBio == 1) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +wangari.getNome()+ "\n Nascimento : " +wangari.getDataAniversario()+ " de " +wangari.getAnoNasc()+
									"\n Nacionalidade : " +wangari.getNacionalidade()+ "\n Atuação : " +wangari.getArea()+ "\n Morte : Aos " +wangari.vida()+ " anos em " +wangari.getAnoMorte());
							wangari.wangari();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta3();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 2) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +blackwell.getNome()+ "\n Nascimento : " +blackwell.getDataAniversario()+ " de " +blackwell.getAnoNasc()+
									"\n Nacionalidade : " +blackwell.getNacionalidade()+ "\n Atuação : " +blackwell.getArea()+ "\n Morte : Aos " +blackwell.vida()+ " anos em " +blackwell.getAnoMorte());
							blackwell.blackwell();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta3();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 3) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +lutz.getNome()+ "\n Nascimento : " +lutz.getDataAniversario()+ " de " +lutz.getAnoNasc()+
									"\n Nacionalidade : " +lutz.getNacionalidade()+ "\n Atuação : " +lutz.getArea()+ "\n Morte : Aos " +lutz.vida()+ " anos em " +lutz.getAnoMorte());
							lutz.lutz();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta3();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 4) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +mamie.getNome()+ "\n Nascimento : " +mamie.getDataAniversario()+ " de " +mamie.getAnoNasc()+
									"\n Nacionalidade : " +mamie.getNacionalidade()+ "\n Atuação : " +mamie.getArea()+ "\n Morte : Aos " +mamie.vida()+ " anos em " +mamie.getAnoMorte());
							mamie.mamie();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta3();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 5) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +bath.getNome()+ "\n Nascimento : " +bath.getDataAniversario()+ " de " +bath.getAnoNasc()+
									"\n Nacionalidade : " +bath.getNacionalidade()+ "\n Atuação : " +bath.getArea()+ "\n Morte : Aos " +bath.vida()+ " anos em " +bath.getAnoMorte());
							bath.bath();
							
							//Opção de volta ao menu da categoria ou saída do programa
							
							ada.volta3();
							System.out.print("\n OPÇÃO: ");
							menu1 = leia.nextInt();
						}
						
					}
					
					//Saída do programa
					
					 while (menu1 == 4 || menu1 == 6 || menu1 == 7 || menuMat == 6 || menuTec == 8 || menuBio == 7 ) {
							
							chien.pular();
							System.out.println("\n Obrigada por utilizar nosso programa, volte sempre!!");
							menu1 = 10;
							menuMat = 10;
							menuTec = 10;
							menuBio = 10;
						}
				}	
		}
}

	



