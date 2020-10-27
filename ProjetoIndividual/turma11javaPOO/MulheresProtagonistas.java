package turma11javaPOO;

import java.util.Scanner;


public class MulheresProtagonistas {

	public static void main(String[] args) {
		
		//variaveis do programa 
		
				int menu1 = 0, iniciar = 0, menuMat = 0, menuTec = 0, menu2 = 0, menuBio = 0;			
		
				
		//criando obj para super classe
		
		Mulheres abertura = new Mulheres ();
		
		//�rea matem�tica/f�sica
		
		FisiMatematica chien = new FisiMatematica("Chien-Shiung Wu",1912,"31 de maio", "F�sica nuclear", "Chinesa", 'n',  1997 );
		FisiMatematica mae = new FisiMatematica("Mae Jemison",1956,"17 de outubro", "Engenheira/Astronauta", "Estadunidense", 's');
		FisiMatematica kalpana = new FisiMatematica("Kalpana Chawla",1961,"1 de julho", "Engenheira Aeroespacial/Astronauta", "Indiana", 'n',  2003 );
		FisiMatematica maryam = new FisiMatematica("Maryam Mirzakhani",1977,"12 de maio", "Matem�tica", "Iraniana", 'n',  2017 );
		
		//�rea tecnol�gica
		
		Tecnologia ada = new Tecnologia ("Ada Lovelace",1815,"10 de dezembro", "Cientista da Computa��o", "Inglesa", 'n', 1852);
		Tecnologia hopper = new Tecnologia ("Grace Hopper",1906,"9 de dezembro", "Programadora", "Estadunidense", 'n', 1992);
		Tecnologia mary = new Tecnologia ("Irm� Mary Kenneth Keller",1913,"dezembro", "Cientista da Computa��o/Freira", "Estadunidense", 'n', 1985);
		Tecnologia radia = new Tecnologia ("Radia Perlman",1951,"18 de dezembro", "Cientista da Computa��o", "Estadunidense", 's');
		Tecnologia hamilton = new Tecnologia ("Margaret Hamilton",1936,"17 de agosto", "Cientista da Computa��o/Engenheira", "Estadunidense", 's');
		Tecnologia johnson = new Tecnologia ("Katherine Johnson",1918,"24 de fevereiro", "Programadora/F�sica/Matem�tica/Cientista Espacial", "Estadunidense", 'n', 2020);
		
		//�rea sa�de/biol�gicas 
		
		SaudeBio wangari = new SaudeBio ("Wangari Maathai",1940,"1 de abril", "Ativista Ambiental/Professora", "Queniana", 'n', 2011);
		SaudeBio blackwell = new SaudeBio ("Elisabeth Blackwell",1821,"3 de fevereiro", "M�dica", "Estadunidense", 'n', 1910);
		SaudeBio lutz = new SaudeBio ("Bertha Lutz",1894,"2 de agosto", "Biol�ga/Ativista Feminista", "Brasileira", 'n', 1976);
		SaudeBio mamie = new SaudeBio ("Mamie Phipps Clark ",1917,"18 de abril", "Psic�loga", "Estadunidense", 'n', 1983);
		SaudeBio bath = new SaudeBio ("Patricia Bath",1942,"4 de novembro", "M�dica/Oftalmologista", "Estadunidense", 'n', 2019);
		
		//estanciando o teclado
		
		Scanner leia = new Scanner(System.in);
		
		//String iniciar;
		
		//apresenta��o programa
		
		abertura.apresentacao();
		
		System.out.print("\n Digite '0' para come�armos: ");
		iniciar = leia.nextInt();
		
			
				//menu para escolha da categoria inicial e apresenta��o das op��es
			
				while(iniciar == 0 || menu1 == 5 || menuMat == 5 || menuTec == 7 || menuBio == 6) {
					
					
					chien.pular();
					
					System.out.println(" N�s fizemos uma divis�o por categorias, escolha uma op��o abaixo para podermos come�ar! \n");
					System.out.println(" 1 - MULHERES NA F�SICA/MATEM�TICA \n 2 - MULHERES NA TECNOLOGIA \n 3 - MULHERES NA SA�DE/BIOL�GICAS \n 4 - SAIR");
					System.out.print("\n OP��O: ");
					menu1 = leia.nextInt();
					iniciar = 1;
					
					//se op��o 1 
					//se��o f�sica/matem�tica
					
					while (menu1 == 1) {
						
						chien.pular();
						
						chien.resumoArea();
						
						System.out.println("\n Quem voc� quer conhecer agora? Escolha uma das op��es abaixo: ");
						System.out.println("\n 1 - Chien-Shiung Wu \n 2 - Mae Jemison \n 3 - Kalpana Chawla \n 4 - Maryam Mirzakhani "
								+ "\n 5 - Voltar ao menu prinicipal \n 6 - Sair");
						System.out.print("\n OP��O: ");
						menuMat = leia.nextInt();
						menu1 = 0;
						
						//Chien 
						
						if(menuMat == 1) {
							
							menuMat = 0;
							chien.pular();
							
							System.out.println("\n Nome : " +chien.getNome()+ "\n Nascimento : " +chien.getDataAniversario()+ " de " +chien.getAnoNasc()+
									"\n Nacionalidade : " +chien.getNacionalidade()+ "\n Atua��o : " +chien.getArea()+ "\n Morte : Aos " +chien.vida()+ " anos em " +chien.getAnoMorte());
							chien.chien();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							chien.volta1();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						//Mae 
						
						if (menuMat == 2) {
							
							menuMat = 0;
							chien.pular();
							
							System.out.println("\n Nome : " +mae.getNome()+ "\n Nascimento : " +mae.getDataAniversario()+ " de " +mae.getAnoNasc()+
									"\n Nacionalidade : " +mae.getNacionalidade()+ "\n Atua��o : " +mae.getArea()+ "\n Idade : " +mae.vida());
							mae.mae();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							chien.volta1();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						//Kalpana
						
						if (menuMat == 3) {
							
							menuMat = 0;
							chien.pular();
							
							System.out.println("\n Nome : " +kalpana.getNome()+ "\n Nascimento : " +kalpana.getDataAniversario()+ " de " +kalpana.getAnoNasc()+
									"\n Nacionalidade : " +kalpana.getNacionalidade()+ "\n Atua��o : " +kalpana.getArea()+ "\n Morte : Aos " +kalpana.vida()+ " anos em " +kalpana.getAnoMorte());
									kalpana.kalpana();
									
									//Op��o de volta ao menu da categoria ou sa�da do programa
									
									chien.volta1();
									System.out.print("\n OP��O: ");
									menu1 = leia.nextInt();
						}
						
						//Maryam
						
						if (menuMat == 4) {
							
							
							chien.pular();
							
							System.out.println("\n Nome : " +maryam.getNome()+ "\n Nascimento : " +maryam.getDataAniversario()+ " de " +maryam.getAnoNasc()+
									"\n Nacionalidade : " +maryam.getNacionalidade()+ "\n Atua��o : " +maryam.getArea()+ "\n Morte : Aos " +maryam.vida()+ " anos em " +maryam.getAnoMorte());
									maryam.maryam();
									
									//Op��o de volta ao menu da categoria ou sa�da do programa
									
									chien.volta1();
									System.out.print("\n OP��O: ");
									menu1 = leia.nextInt();
							
						}
					}
					
					
					while (menu1 == 2) {
						
						chien.pular();
						
						ada.resumoArea();
						
						System.out.println("\n Quem voc� quer conhecer agora? Escolha uma das op��es abaixo: ");
						System.out.println("\n 1 - Ada Lovelace \n 2 - Grace Hopper \n 3 - Irm� Mary Kenneth Keller \n 4 - Radia Perlman \n 5 - Margaret Hamilton "
								+ "\n 6 - Katherine Johnson \n 7 - Voltar ao menu prinicipal \n 8 - Sair");
						System.out.print("\n OP��O: ");
						menuTec = leia.nextInt();
						menu1 = 0;
						
						if(menuTec == 1) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +ada.getNome()+ "\n Nascimento : " +ada.getDataAniversario()+ " de " +ada.getAnoNasc()+
									"\n Nacionalidade : " +ada.getNacionalidade()+ "\n Atua��o : " +ada.getArea()+ "\n Morte : Aos " +ada.vida()+ " anos em " +ada.getAnoMorte());
							ada.ada();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta2();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 2) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +hopper.getNome()+ "\n Nascimento : " +hopper.getDataAniversario()+ " de " +hopper.getAnoNasc()+
									"\n Nacionalidade : " +hopper.getNacionalidade()+ "\n Atua��o : " +hopper.getArea()+ "\n Morte : Aos " +hopper.vida()+ " anos em " +hopper.getAnoMorte());
							hopper.hopper();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta2();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 3) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +mary.getNome()+ "\n Nascimento : " +mary.getDataAniversario()+ " de " +mary.getAnoNasc()+
									"\n Nacionalidade : " +mary.getNacionalidade()+ "\n Atua��o : " +mary.getArea()+ "\n Morte : Aos " +mary.vida()+ " anos em " +mary.getAnoMorte());
							mary.mary();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta2();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 4) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +radia.getNome()+ "\n Nascimento : " +radia.getDataAniversario()+ " de " +radia.getAnoNasc()+
									"\n Nacionalidade : " +radia.getNacionalidade()+ "\n Atua��o : " +radia.getArea()+ "\n Idade : " +radia.vida()+ " anos");
							radia.radia();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta2();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 5) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +hamilton.getNome()+ "\n Nascimento : " +hamilton.getDataAniversario()+ " de " +hamilton.getAnoNasc()+
									"\n Nacionalidade : " +hamilton.getNacionalidade()+ "\n Atua��o : " +hamilton.getArea()+ "\n Idade : " +hamilton.vida()+ " anos");
							hamilton.hamilton();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta2();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuTec == 6) {
							
							chien.pular();
							

							System.out.println("\n Nome : " +johnson.getNome()+ "\n Nascimento : " +johnson.getDataAniversario()+ " de " +johnson.getAnoNasc()+
									"\n Nacionalidade : " +johnson.getNacionalidade()+ "\n Atua��o : " +johnson.getArea()+ "\n Morte : Aos " +johnson.vida()+ " anos em " +johnson.getAnoMorte());
							johnson.johnson();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta2();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
					}
					
					while (menu1 == 3) {
						
						chien.pular();
						
						lutz.resumoArea();
						
						System.out.println("\n Quem voc� quer conhecer agora? Escolha uma das op��es abaixo: ");
						System.out.println("\n 1 - Wangari Maathai \n 2 - Elisabeth Blackwell \n 3 - Bertha Lutz \n 4 - Mamie Phipps Clark \n 5 - Patricia Bath "
								+ "\n 6 - Voltar ao menu prinicipal \n 7 - Sair");
						System.out.print("\n OP��O: ");
						menuBio = leia.nextInt();
						menu1 = 0;
						
						if(menuBio == 1) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +wangari.getNome()+ "\n Nascimento : " +wangari.getDataAniversario()+ " de " +wangari.getAnoNasc()+
									"\n Nacionalidade : " +wangari.getNacionalidade()+ "\n Atua��o : " +wangari.getArea()+ "\n Morte : Aos " +wangari.vida()+ " anos em " +wangari.getAnoMorte());
							wangari.wangari();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta3();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 2) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +blackwell.getNome()+ "\n Nascimento : " +blackwell.getDataAniversario()+ " de " +blackwell.getAnoNasc()+
									"\n Nacionalidade : " +blackwell.getNacionalidade()+ "\n Atua��o : " +blackwell.getArea()+ "\n Morte : Aos " +blackwell.vida()+ " anos em " +blackwell.getAnoMorte());
							blackwell.blackwell();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta3();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 3) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +lutz.getNome()+ "\n Nascimento : " +lutz.getDataAniversario()+ " de " +lutz.getAnoNasc()+
									"\n Nacionalidade : " +lutz.getNacionalidade()+ "\n Atua��o : " +lutz.getArea()+ "\n Morte : Aos " +lutz.vida()+ " anos em " +lutz.getAnoMorte());
							lutz.lutz();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta3();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 4) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +mamie.getNome()+ "\n Nascimento : " +mamie.getDataAniversario()+ " de " +mamie.getAnoNasc()+
									"\n Nacionalidade : " +mamie.getNacionalidade()+ "\n Atua��o : " +mamie.getArea()+ "\n Morte : Aos " +mamie.vida()+ " anos em " +mamie.getAnoMorte());
							mamie.mamie();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta3();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
						if(menuBio == 5) {
							
							chien.pular();
							
							System.out.println("\n Nome : " +bath.getNome()+ "\n Nascimento : " +bath.getDataAniversario()+ " de " +bath.getAnoNasc()+
									"\n Nacionalidade : " +bath.getNacionalidade()+ "\n Atua��o : " +bath.getArea()+ "\n Morte : Aos " +bath.vida()+ " anos em " +bath.getAnoMorte());
							bath.bath();
							
							//Op��o de volta ao menu da categoria ou sa�da do programa
							
							ada.volta3();
							System.out.print("\n OP��O: ");
							menu1 = leia.nextInt();
						}
						
					}
					
					//Sa�da do programa
					
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

	



