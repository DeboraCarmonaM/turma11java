package exerciciosEmAula;

public class Tabuada {

	public static void main(String[] args) {
		// fazer tabuada até a do 10
		
		
		int tabuada = 0, x = 1, contador = 1;
		
		while(contador <= 10) {
			
			System.out.println("\nTabuada do "+contador+ ":\n");
			
			for(x = 1; x <= 10; x++) {
				
				tabuada = x * contador;
				System.out.println("\n" +contador+ "*" +x+ "=" +tabuada );
				
			}
			contador = contador + 1;
		}
	}
}
