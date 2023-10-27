package pacoteif1;

import java.util.Locale;
import java.util.Scanner;

public class Ifelse2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Scanner
		Scanner sc = new Scanner(System.in);
		// pegar dados
		double conta = sc.nextInt();
		double gorjeta = 0;
		// if
		if (conta < 50) {
			gorjeta = conta * 0.10;
		} else if (conta <= 100) {
			gorjeta = conta * 0.15;
		} else {
			gorjeta = conta * 0.20;
		}

		if (conta <= 0) {
			System.out.println("Valor Inválido");
		} else {
			System.out.printf("Sua conta deu o total: %.2f e a gorjeta de: %.2f%n", conta, gorjeta);
		}
		// encerrar Scanner
		sc.close();
	}

}
