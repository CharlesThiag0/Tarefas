package pacoteife12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner,import,new,System.in(para complementar a leitura dos dados)
		Scanner teclado = new Scanner(System.in);
		
		//pergunta
		System.out.println("Digite um numero e descubra se é par ou ímpar:");
		
		//definir entrada dos dados na variavel
		int numero = teclado.nextInt();
		
		//rota if else
		if (numero % 2 == 0) {
			System.out.printf("Numero %d é PAR%n",numero);
		}
		else {
			System.out.printf("Numero %d é ÍMPAR%n",numero);
		}
		
		//encerrar o Scanner
        teclado.close();
		
	}

}
