package math;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*//Criar variaveis double x3 y4 z-5 e A B C
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		 double a,b,c;
		
		//A B C recebe o valor em raiz quadrada de  x y z
		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);
		
		//Mostrar no terminal
		System.out.println("A raíz Quadrada de: " + x + " = " + a);
		 System.out.println("A raíz Quadrada de: "+ y +" = " + b);
          System.out.println("A raíz Quadrada de 25: = "+ c);
          
        //Potenciasão
        a = Math.pow(x, y);
        b = Math.pow(x, 2.0);
        c = Math.pow(5.0, 2.0);
        		
        //Mostrar no terminal
        System.out.println(x + " Elevado a "+ y + " = " + a);
         System.out.println(x + " Elevado a 2.0 = "+ b);
          System.out.println("5.0 Elevado a 2.0 = "+ c);
          
        //Valor absoluto
        a = Math.abs(x);
        b = Math.abs(y);
        c = Math.abs(z);
        
        //Mostrar no terminal
        System.out.println("O valor Absoluto de "+ x + " = " + x);
         System.out.println("O valor Absoluto de " + y + " = "+ b);
          System.out.println("O valor Absoluto de " + z + " = "+ c);*/
		
		
		/*//operadores logicos
		//variaveis
		int numero1 = 163;
		int numero2 = 866;
		int numero3 = 90;
		int numero4 = 90;
		//calculo
	    boolean resuldado = numero1 >= numero2  && numero3 <= numero4;
		//saida
		System.out.println(resuldado);*/
		
		/*//estrutura condicional composta
		//scanner.import.new.System.in
		Scanner teclado = new Scanner(System.in);
		//pergunta a hora
		System.out.println("Que horas são?");
		//ler a hora
		int hora = teclado.nextInt();
		//if e else
		if (hora <= 12) {
			System.out.println("BOM DIA");
		} else {
			   if (hora <= 17 ) {
				   System.out.println("BOA TARDE");
			       }else {
				          System.out.println("BOA NOITE");
			   }
		}
		//encerrar scanner
		teclado.close();*/
		
		
		/*//scanner.import.new.System.in
		Scanner teclado = new Scanner(System.in);
		//pergunta da idade
		System.out.println("DIGITE SUA IDADE: ");
		//idade
		int idade = teclado.nextInt();
		//if else ,saida
		if (idade > 18) {
			System.out.println("Você é maior de idade");
		} else {
		
			System.out.println("Você é menor de idade");
		}
		//encerrar scanner
		teclado.close();*/
		
		
		/*//scanner.import.new.System.in
		Scanner teclado = new Scanner(System.in);
		
		//perguntar
       System.out.println("Digite um numero");
		
		//pegar teclado
	   int numero = teclado.nextInt();
	
		//else if else if else
	   if (numero >= 1 && numero % 2 == 0) {
		   System.out.printf("O numero %d é Positivo e PAR%n",numero);
	   }
	   else if (numero <= 0 && numero % 2 ==0) {
		           System.out.printf("O numero %d é Negativo e PAR%n",numero);
	   }
	   
	   else if (numero >= 1 && numero % 2 == 1) {
		       System.out.printf("O numero %d é Positivo e IMPAR%n",numero);
	   }
	   
	   else if (numero <= 0 && numero % 2 == 1) {
		               System.out.printf("O numero %d é Negativo e IMPAR%n",numero);
	   }
			
		//scanner encerrar
		teclado.close();*/
		
		/*//LocaleUS
		Locale.setDefault(Locale.US);
		
		//Scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//Saida pergunta
		System.out.println("Digite o numero :");
		
		//pegar os dados
		double numero = teclado.nextDouble();
		
		//if else if else
		if (numero >= 1) {
			System.out.println("Numero Positivo");
		} 
		   else if (numero <0) {
			System.out.println("Numero negativo");
		}  
		     else {
			  System.out.println("Zero");
		}
		
		//encerrar Scanner
		teclado.close();*/
		
		/*//Scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		//pergunta da idade
		System.out.println("Digite sua idade");
		//pegar os dados
		int idade = teclado.nextInt();
		//if else if else if else else if
		if (idade < 0) {
			System.out.println("Invalida");
		}
		else if (idade < 17) {
		  System.out.println("Menor de idade");
		} 
		 else if ( idade >=18 && idade <= 30){
			      System.out.println("Jovem adulto");
		}
		   else if (idade >=31 && idade <= 60) {
		             System.out.println("Adulto");
		}        
		     else if (idade >=61) {
			            System.out.println("Idoso");
		}
		
		//encerrar scanner
		teclado.close();*/
		
		//Math.pow (resultado elevador)
		double a = 10.0;
		double b = 2.0;
		double resultado = Math.pow(a, b);
		System.out.println(resultado);
		
		//Raiz Quadrada
		double c = 10.0;
		double resultado2 = Math.sqrt(c);
		System.out.println(resultado2);
		
		//valor Absoluto
		double d = 5.70;
		double resultado3 = Math.abs(d);
		System.out.println(resultado3);
		
		//Raiz Cubica
		double e = 10;
		double f = Math.cbrt(e);
		System.out.println(f);
		
		//valor de PI (uma constante)
	    double g = Math.PI;
	    System.out.println(g);
	    
	    
		
	}

}
