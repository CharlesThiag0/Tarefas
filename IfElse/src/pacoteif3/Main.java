package pacoteif3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner,import,new,System.in(para ler a entrada de dados)
		Scanner teclado = new Scanner(System.in);
		
		//pergunta do digitos
		System.out.println("Digite 3 numeros");
		
		//recolher a entrada de dados edefinir
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		//if else
		if (a > b) {
			int resultado = a + b;
			System.out.println("Resultado somado = total: "+resultado);
		}
		else if (b > c) {
			int resultado2 = a - c;
			System.out.println("Resultado subtraido = total: "+resultado2);
		 }
	      else if (a == b && a  == c) {
	   	     System.out.println("Zero");
	    }
		   else if (a == b) {
			   int resultado3 = a * c;
			   System.out.println("Resultado foi Multiplicado = total: "+resultado3);
		}
		         else if (a == c){
		        	 int resultado4 = a / c;
		    	     System.out.println("Resuldado foi divido total: "+resultado4);
		     }
		
		//encerrar Scanner
		teclado.close();

	}

}
