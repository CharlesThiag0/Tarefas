package pacoteif9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//localeUS(para definir que sera lido o ponto)

        Locale.setDefault(Locale.US);
		
		//Scanner,import,new,System.in(para leitura de codigo da entrada de dados)
		Scanner teclado = new Scanner(System.in);
		
		//pergunta do numero 1,2,3
		System.out.println("Digite numero 1 - 2 e 3");
		
		//ler as variaveis double a,b,c
		double a = teclado.nextDouble();
		double b = teclado.nextDouble();
		double c = teclado.nextDouble();
		
		//calculo de delta 
		double delta = b * b - 4.0 * a * c;
		
		//rota if else
	    if (a == 0 || delta < 0.0) {
	    	System.out.println("Não foi possivel");
	    }
	    else {
	    	double resultado = (-b + Math.sqrt(delta)) / ( 2.0 * a);
			double resultado2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
	    	System.out.printf("O resultado foi: %.5f%n",resultado);
	    	System.out.printf("O resultado foi: %.5f%n",resultado2);
	    }
	    
		//encerrar Scanner
	    teclado.close();
	    

	}

}
