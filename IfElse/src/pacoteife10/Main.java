package pacoteife10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner,import,new,System.in
		Scanner teclado = new Scanner (System.in);
		
		//pergunta
		System.out.println("Digite 3 numeros para descobrir o menor");
		
		//recolher os dados
		int n1 = teclado.nextInt();
		int n2 = teclado.nextInt();
		int n3 = teclado.nextInt();
		
		//if else , descobrir o numero menor entres eles e se são iguais
		if (n1 < n2 && n1 < n3) {
			System.out.println(" Menor que todos é : "+n1);
		}
		else if (n2 < n3) {
			       System.out.println("Menor de todos é : "+n2);
		}
		else {
			System.out.println("Menor de todos é : "+n3);
		}
		    
		//encerrar scanner
		teclado.close();
	}

}
