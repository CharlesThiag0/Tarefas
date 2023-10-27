package pacoteife19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner,import.new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//pergunta
		System.out.println("Digite o valor de minutos");
		
		//recolher dados
		double minutos = teclado.nextDouble();
		
		//double hr
		double planoB = 50;
		
		//rota if else
		if (minutos >100) {
		    planoB += ((minutos - 100) * 2.00);
		    System.out.printf("Valor total a pagar: %.2f%n",planoB);
		}
		else if ( minutos < 100) {
			System.out.printf("Valor total a pagar: %.2f%n",planoB);
		}
		
		//encerrar scanner
        teclado.close();
	}

}
