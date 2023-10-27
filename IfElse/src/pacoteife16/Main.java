package pacoteife16;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//locale.US
		Locale.setDefault(Locale.US);
		
		//Scanner.import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//pergunta
		System.out.println("Digite o numero:");
		
		//recolher dados
		double numero = teclado.nextDouble();
		
		//if else
		if (numero >= 0 && numero <= 25.0) {
			System.out.println("O intervalo de: 0,25");
		}
		else if (numero >=25.0 && numero <= 50.0) {
			System.out.println("Intervalo de 25,50");
		}
		else if (numero >=50.0 && numero <=75) {
			System.out.println("Intervalo de  50,75");
		}
		else if (numero >=75.0 && numero <=100) {
			System.out.println("Intervalor de 75,100");
		}
		else {
			System.out.println("Numero inválido");
		}
		
		//encerrar Scanner
		teclado.close();

	}

}


