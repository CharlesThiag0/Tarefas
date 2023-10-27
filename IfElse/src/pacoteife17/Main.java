package pacoteife17;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//localeUS
		Locale.setDefault(Locale.US);
		
		//Scanner,import,new.System.in
		Scanner teclado = new Scanner(System.in);
		
		//pergunta
		System.out.println("Digite o X e Y");
		
		//recolher os dados x
		double x = teclado.nextDouble();
		
		//recolher os dados y
		double y = teclado.nextDouble();
		
		//rota if else
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");	
		}
		else if (x == 0.0 && y == 0) {
			System.out.println("Ponto de origem");
		}
		
		//encerrar scanner
		teclado.close();
		
	}

}
