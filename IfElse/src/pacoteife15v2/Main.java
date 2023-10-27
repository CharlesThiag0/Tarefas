package pacoteife15v2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//locale
		Locale.setDefault(Locale.US);
		
		//pergunta1
		System.out.println("Digite o numero do pedido");
		
		//recolher
		int pedido = teclado.nextInt();
		
		//pergunta2
		System.out.println("Digite a quantidade");
		
		//recolher
		int quantidade = teclado.nextInt();

		
		//if else
		if (pedido == 1  && quantidade >=1) {
			double resultado = quantidade * 4.0;
			System.out.printf("O total foi: %.2f%n",resultado);
		}
		else if (pedido == 2 && quantidade >=1) {
			double resultado = quantidade * 4.5;
			System.out.printf("O total foi: %.2f%n",resultado);
		}
		else if (pedido == 3 && quantidade >=1) {
			double resultado = quantidade * 5.0;
			System.out.printf("O total foi: %.2f%n",resultado);
		}
		else if (pedido == 4 && quantidade >=1) {
			double resultado = quantidade * 2.0;
			System.out.printf("O total foi: %.2f%n",resultado);
		}
		else {
			double resultado = quantidade * 1.5;
			System.out.printf("O total foi: %.2f%n",resultado);
		}
		
		
		//close scanner
		teclado.close();

	}

}
