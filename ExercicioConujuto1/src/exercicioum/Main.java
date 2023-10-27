package exercicioum;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		                          
		/*SAIDAS DE DADOS//Locale US para ler com ponto
		Locale.setDefault(Locale.US);
		
		//Importar o Scanner,Objeto,Completar com System.in
		Scanner teclado = new Scanner(System.in);
		
		//Criar variaveis double - metroQuadrado,largura,comprimento
		 double largura = teclado.nextDouble();
		 double comprimento = teclado.nextDouble();
		 double metroQuadrado = teclado.nextDouble(); 
		
		//Calcular a area, preço
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		//Mostrar no terminal area, preço formatado 2 casas decimais com quebra de linha
		 System.out.printf("Area: %.2f%n",area);
		 System.out.printf("Preço: %.2f%n",preco);
		
		//encerrar Scanner
		teclado.close();*/
		
		
		                        //Faça uma caculadora de somar
		
		/*//pergunta de um numero no terminal
		System.out.println("Digite um numero para somar");
		
		//Scanner,importar,objeto,acompanhado de System.in
		Scanner teclado = new Scanner(System.in);
		
		//variavel int
		int a = teclado.nextInt();
		
		//pergunta sobre o denominador
		System.out.println("Digite um denominador");
		
		//variavel int
		int b = teclado.nextInt();
		
		//declarar resultado
		int soma = a + b;
		
		//mostrar resultado na tela
		System.out.println("Seu resultado é: "+soma);
		
		//encerrar Scanner
		teclado.close();*/
		
		                              //area com PI
		
		/*//definir locale US
		Locale.setDefault(Locale.US);
		
		//pergunta do raio
		System.out.println("DIGITE A ARÉA: ");
		
		//Scanner,obj,import,complementar com System.in
		Scanner teclado = new Scanner(System.in);
		
		//variavel double raio
		double raio = teclado.nextDouble();
		
		//raioElevado
		double raioE = Math.pow(raio, 2);
		
		//definir area
		double area = Math.PI * raioE;
		
		//mostrar resultado area  com 4 casas decimais
		System.out.printf("Resuldado total: %.4f ",area);
		
		//encerrar Scanner
		teclado.close();*/
		
		
		/*//Scanner,import,objeto,acompanhado de System.in
		Scanner teclado = new Scanner(System.in);
		
		//criar 4 variaveis int a b c d
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		int d = teclado.nextInt();
		
		//calcular a * b - c * d
		int resultado = (a * b - c * d);
		
		//mostrar resultado
		System.out.println("Resultado total: "+ resultado);
		
		//encerrar scanner
		teclado.close();*/
		
		
		/*//locale US para definir o ponto final
		Locale.setDefault(Locale.US);
		
		//perguta do nome do funcionario
		System.out.println("Digite o nome do funcionario: ");
		
		//Scanner, import,objeto,complemento System.in
		Scanner teclado = new Scanner(System.in);
		
		//funcionario
		String nome = teclado.nextLine();
		
		//horas trabalhadas
		int horasTrab = teclado.nextInt();
		
		//valor por horas
		double horas = teclado.nextDouble();
		
		//calculo do salario 
		double salario  = horasTrab * horas;
		
		//saida do nome do funcionario
		System.out.println("Nome: "+ nome);
		
		//saida com o salario formatado em 2 casas decimais
		System.out.printf("Salário no total: %.2f%n",salario);
		
		//encerrar scanner
		teclado.close();*/
		
		/*//locale US
		Locale.setDefault(Locale.US);
		
		//Scanner,import,objeto,System.in
		Scanner teclado = new Scanner(System.in);
		//codigoP
		int codigoP = teclado.nextInt();
		
		//unidadeP
		int unidadeP = teclado.nextInt();
		
		//valorP
		double valorP = teclado.nextDouble();
		
		//codigoP2
		int codigoP2 = teclado.nextInt();
		
		int unidadeP2 = teclado.nextInt();
		
		double valorP2 = teclado.nextDouble();
		
		//calculo 
		double calculoP = unidadeP * valorP + unidadeP2 * valorP2;
		
		//mostrar no terminal codigo e calculo
		System.out.printf("Valor total R$: %.2f%n",calculoP);
		
		//encerrar Scanner
		teclado.close();*/
		
		
		//locale US
		Locale.setDefault(Locale.US);
		
		//Scanner,import,objeto,System.in
		Scanner teclado = new Scanner(System.in);
		
		//3 variaveis double a b c
		double a = teclado.nextDouble();
		 double b = teclado.nextDouble();
		  double c = teclado.nextDouble();
		
		//area do triangulo A vezes C dividido por 2
		double areaTriang = a * c / 2;

         //area circulo PI
		double cElevado = Math.pow(c, 2);
		double areaCircu = Math.PI * cElevado;
		
		//area do trapezio
		double areaTrape = (a + b) * c /2;
		
		//area do quadrado
		double areaQua = Math.pow(b, 2);
		
		//area do retangulo
	    double areaRetan =  a * b;
		
		//saida
		System.out.printf("Triângulo: %.3f%n",areaTriang);
		System.out.printf("Area Circulo: %.3f%n",areaCircu);
		System.out.printf("Area do Trapézio: %.3f%n",areaTrape);
        System.out.printf("Area Quadrada: %.3f%n",areaQua);
        System.out.printf("Area Retangular: %.3f%n",areaRetan);
		
		//encerrar teclado
        teclado.close();
        
	}

}
