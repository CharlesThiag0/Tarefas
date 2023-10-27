package pacoteife11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        //Scanner,import,new(System.in)para complementar a leitura dos dados
		Scanner teclado = new Scanner(System.in);
				
		//pergunta 
		System.out.println("Digite um numero para descobrir se é negativo ou não:");
				
		//definir a entrada de dados na variavel int
		int numero = teclado.nextInt();
				
		//rota if else
		if (numero < 0) {
			System.out.println("Numero é Negativo");
		}
		else {
			System.out.println("Numero não é Negativo");
		}
				
		//encerrar scanner
		teclado.close();
	}

}
