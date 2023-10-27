package pacoteife15;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//pergunta do pedido + o cardapio
		System.out.println("Digite o numero do pedido:");
		
		//pegar dados
		int codigo = teclado.nextInt();
		
		//digite a quantidade
		System.out.println("Digite a quantidade:");
		
		//pegar dados 
		int quantidade = teclado.nextInt();
		
		//localeUS
		Locale.setDefault(Locale.US);
		
		//double
		double valor1 = 4.00;
		double valor2 = 4.50;
		double valor3 = 5.00;
		double valor4 = 2.00;
		double valor5 = 1.50;
	
		//if else
		if  (codigo ==1){
			double resultado1 = valor1  * quantidade;
			System.out.printf("O total foi: %.2f%n",resultado1);
		}
		else if(codigo ==2) {
			double resultado2 = valor2 * quantidade;
			System.out.printf("O total foi: %.2f%n",resultado2);
		}
		else if (codigo ==3) {
			double resultado3 = valor3 * quantidade;
			System.out.printf("O total foi: %.2f%n",resultado3);
		}
		else if (codigo ==4) {
			double resultado4 = valor4 * quantidade;
			System.out.printf("O total foi: %.2f%n",resultado4);
		}
		else {
			double resultado5 = valor5 * quantidade;
			System.out.printf("O total foi: %.2f%n",resultado5);

		}
		
		//encerrar scanner
		teclado.close();

	}

}
