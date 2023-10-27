package pacoteif6;

import java.util.Locale;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
	//  7 localeUS(para aceitar ponto)
		Locale.setDefault(Locale.US);
		
		//Scanner,import,new,System.in
	    Scanner teclado = new Scanner(System.in);
	    
		//pergunta sobre o preco
	    System.out.println("Digite o valor");
		
		//receber dados do preço
	    double preco = teclado.nextDouble();
		
		//pergunta sobre o desconto
	    System.out.println("Digite o desconto:");
		
		//recolher os dados
	    double desconto = teclado.nextDouble();
		
		//if else para rota de saida baseado no preço base com desconto
	    if (preco >=100) {
	    	double cupom = preco - 8 - desconto;
	    	System.out.println("Por ser uma compra acima ou igual a 100 você ganhou mais 8off");
	    	System.out.printf("Valor final de: R$ %.2f%n",cupom);
	    }
	    else {
	    	double cupom2 = preco - desconto;
	    	System.out.printf("Valor final de: R$ %.2f%n",cupom2);
	    }

		//encerrar scanner
	    teclado.close();

	}

}
