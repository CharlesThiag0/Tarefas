package pacoteif8;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//localeUS(para conseguir ler com ponto)
		Locale.setDefault(Locale.US);
		
		//Scanner,import,new,System.in(para ler a entrada de dados)
		Scanner teclado = new Scanner(System.in);
		
		//pergunta sobre a nota
		System.out.println("Digite a sua nota: ");
		
		//recolher a nota 
		double nota = teclado.nextDouble();
		
	    System.out.println("Digite  sua segunda nota:");//pergunta da segunda nota
	    
		double nota2 = teclado.nextDouble();
		
		double soma = nota + nota2;//calculo test
		double resultado = soma / 2;
		
		//rota if else
		if (resultado < 6.00) {
			System.out.printf("Sua nota foi: %.1f e esta Reprovado!%n",resultado);
		}
		else if (resultado >=6.00) {
			System.out.printf("Você foi aprovado com %.1f%n",resultado);
		}
		
		//encerrar
		teclado.close();
		

	}

}
