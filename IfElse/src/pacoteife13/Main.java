package pacoteife13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        //Scanner,import,new,System.in(para complementar a entrada dos dados)
		Scanner teclado = new Scanner(System.in);
		
		//pergunta
		System.out.println("Digite um numero: ");
		
		//recolher a entrada e definir na variavel
		int numero1 = teclado.nextInt();
		
		//pergunta do multiplo
		System.out.println("Digite o multiplo: ");
		
		//recolher multiplo
		int numero2 = teclado.nextInt();
		
		//rota if else
		if (numero1 % numero2 == 0 || numero2 % numero1 == 0 ) {
		   System.out.println("É Multiplo");
		}
		else {
			  System.out.println("Não é Multiplo");
		}
		
		//encerrar scanner
	    teclado.close();	
		
	}

}
