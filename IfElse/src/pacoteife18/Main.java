package pacoteife18;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//LocaleUS
		Locale.setDefault(Locale.US);
		
		//scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//pergunta do salario
		System.out.println("Digite o seu salário:");
		
		//pegar os daddos
		double salario = teclado.nextDouble();
		double imposto;
		
		//else if
		if (salario < 2000) {
			System.out.println("Isento");
		}
		else if (salario < 3000) {
			imposto = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f%n",imposto);
		}
		else if (salario < 4500) {
			imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f%n",imposto);
		}
		else {
			imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f%n",imposto);
		}
		
		
	    //encerrar
		teclado.close();
	
	}

}
