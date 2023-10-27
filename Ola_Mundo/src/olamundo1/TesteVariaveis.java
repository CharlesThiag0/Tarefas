package olamundo1;


import java.util.Locale;
import java.util.Scanner;

public class TesteVariaveis {
	public static void main(String[] args) {
		/*
		 * System.out.println("Olá mundo"); int idade = 22; System.out.println(idade);
		 * 
		 * double idade2 = 5.0 / 2.0; System.out.println(idade2);
		 * 
		 * double salario = 1320.5; int valor = (int) salario;
		 * System.out.println(valor);
		 * 
		 * char valor1 = 66; valor1 = (char) (valor + 1); System.out.println(valor1);
		 */

		/*// criar variavel int idade e quantidade de pessoas
		int idade = 18;
		int quantidadePessoas = 3;

		// rota if else quantidade de pessoas
		if (quantidadePessoas >= 2) {
			boolean quantidade = true;
		} else {
			boolean quantidade = false;
		}
		if (idade >=18 || quantidadePessoas >=2) {
			System.out.println("Pode entrar");
		}else {
			System.out.println("Não pode entrar");
		}*/

	
		/*//localeUS
		Locale.setDefault(Locale.US);
		
		//Scanner
		Scanner teclado = new Scanner(System.in);
		
		//variaveis e recolher os dados
		double salario = teclado.nextDouble();
		
		// rota if else
		if (salario <=2800.0) {
			System.out.println("o seu juros e 0.75");
		}else if (salario <=3751.0) {
			System.out.println("seu juros é 0.15");
		} else {
			System.out.println("seu juros é 22.5");
		}
	
		//encerrar Scanner
		teclado.close();*/
		
		//scanner
		Scanner teclado = new Scanner (System.in);
		
		//pegar os dados
		int numeroMes = teclado.nextInt();
		
		//rota witch
		switch (numeroMes) {
		case 1 :
			System.out.println("Janeiro");
               break;
		case 2 :
			System.out.println("Fevereiro");
			break;
		case 3 : 
			System.out.println("Março");
			break;
		case 4 :
			System.out.println("Abril");
			break;
		case 5 :
			System.out.println("Maio");
			break;
		case 6 :
			System.out.println("Junho");
			break;
		case 7 :
			System.out.println("Julho");
			break;
		case 8 :
			System.out.println("Agosto");
			break;
		case 9 :
			System.out.println("Setembro");
			break;
		case 10 :
			System.out.println("Outubro");
			break;
		case 11 :
			System.out.println("Novembro");
			break;
		case 12 :
			System.out.println("Dezembro");
			break;
			default :
				System.out.println("Mês inválido");
		
		
		//encerrar Scanner
		
		
	
		
		
		}
	}
}

