package pacoteif4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 4 Scanner,import,new,System.in(para escanear a entrada de dados)
		Scanner teclado = new Scanner(System.in);
		
		//pergunta
		System.out.println("DIGITE UM NUMERO");
		
		//pegar o que foi digitado
		int ano = teclado.nextInt();

		//calculo if else for % 4 e nao for %100  , se for divisivel por 400
	    if (ano % 4 ==0 && ano % 100 !=0 || ano % 400 ==0) {
	    	System.out.println("Bissexto");
	    }else {
	    	System.out.println("Não é");
	    }
		
		//encerrar scanner
	    teclado.close();

	}

}
