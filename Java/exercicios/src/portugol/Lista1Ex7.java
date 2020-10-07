package portugol;

import java.util.Scanner;

public class Lista1Ex7 {

	public static void main(String[] args) {
		
		/*funcao inicio()
	{
		inteiro
		a , b , c , d , E , f  , x , y
		
		escreva (" informe o Valor de A : ")
		leia (a)
		pula()
		escreva (" informe o Valor de B : ")
		leia (b)
		pula()
		escreva (" informe o Valor de C : ")
		leia (c)
		pula()
		escreva (" informe o Valor de D : ")
		leia (d)
		pula()
		escreva (" informe o Valor de E : ")
		leia (E)
		pula()
		escreva (" informe o Valor de F : ")
		leia (f)
		pula()
		 x = ( ( (c*E) - (b*f) ) / ( (a*E) - (b*d) ) )
		 y =  ( ( (a*f) - (c*d) ) / ( (a*E) - (b*d) ) )
		 escreva (" O valor de X é : " , x )
		 pula()
		 escreva (" O valor de Y é : " , y)
 
		 */
		Scanner leia = new Scanner(System.in);
		int a = 0 , b, c , d , e , f ; 
		double x=0 , y=0;
		
		System.out.print("Informe o valor de a: ");
		a = leia.nextInt();
		
		System.out.print("Informe o valor de b: ");
		b = leia.nextInt();
		
		System.out.print("Informe o valor de c: ");
		c = leia.nextInt();
		
		System.out.print("Informe o valor de d: ");
		d = leia.nextInt();
		
		System.out.print("Informe o valor de e: ");
		e = leia.nextInt();
		
		System.out.print("Informe o valor de f: ");
		f = leia.nextInt();
		
		x = (((c*e) - (b*f)) / ((a*e) - (b*d)));
		y = (((a*f) - (c*d)) / ((a*e) - (b*d)));
		
		System.out.printf(" O valor de x é : %.2f" , x );
		System.out.println();
		System.out.printf(" O valor de y é : %.2f2" , y );
		
		leia.close();
	}

}
