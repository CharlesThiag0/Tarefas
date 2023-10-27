package pacoteif1;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// localeUS
		Locale.setDefault(Locale.US);
		// Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite 1 para transforma Celcius em Fahrenheit ou 2 para o oposto");
		// int
		int numero = sc.nextInt();
		System.out.println("Digite a temperatura");// pergunta
		double temperatura = sc.nextInt();
		// if
		if (numero == 1) {// =F
			temperatura = temperatura * 9 / 5 + 32;
			System.out.printf("Fahrenheit = %.1f%n", temperatura);
		} else {// C
			temperatura = (temperatura - 32) * 5 / 9;
			System.out.printf("Celcius = %.1f%n", temperatura);
		}
		// encerrar Scanner
		sc.close();

	}
}