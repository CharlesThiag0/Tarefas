package switchcase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//pegar o dados
		int numero = teclado.nextInt();
		String dia;
		
		//witchi case break
		switch (numero) {
		case 1 :
			dia = "Domingo";
			break;
		case 2 :
			dia = "Segunda";
			break;
		case 3 :
			dia = "Terça";
			break;
		case 4 :
			dia = "Quarta";
			break;
		case 5 :
			dia = "Quinta";
			break;
		case 6 :
			dia = "Sexta";
			break;
		case 7 :
			dia = "Sábado";
			break;
		default :
			dia = "Inválido";
			break;	
		}
		
		System.out.println("O dia é "+dia);
		
		
		//encerrar scanner
		teclado.close();

	}

}
