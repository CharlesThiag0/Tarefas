package testeee;

import java.util.Calendar;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// import Scanner
		Scanner sc = new Scanner(System.in);
		// pegar os dados
		int ano = sc.nextInt();
		// import calendar(pegar o ano atua da maquina)
		Calendar cal = Calendar.getInstance();
		// calculo
		int idade = cal.get(Calendar.YEAR) - ano;
		// rota if else
		if (ano < 0 || ano > 2023) {
			System.out.println("Ano inválido");
		} 
			else if (idade <= 12) {
				System.out.println("Criança");
		} 
				else if (idade <= 21) {
					System.out.println("Jovem");
		} 
					else if (idade <= 65) {
						System.out.println("Adulto");
		} 
						else {
							System.out.println("Idoso");
		}
		sc.close();
	}

}
