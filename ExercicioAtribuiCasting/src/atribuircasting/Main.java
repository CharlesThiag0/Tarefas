package atribuircasting;

public class Main {

	public static void main(String[] args) {
	/*	//5 variaveis double 
		double a,b,c,d,e;
		 a  = 76.6;
		  b = 23.9;
		   c = 43.3;
		  d = 99.8;
	     e = 44.5;
		
		//5 Variavel int e transformalo de valor double para inteiro (casting)
		int valorA = (int) a;
		 int valorB = (int) b;
		  int valorC = (int)c;
		 int valorD = (int)d;
		int valorE = (int)e;
		
	    //terminal valorInt	
		System.out.println(valorA);
		 System.out.println(valorB);
		  System.out.println(valorC);
		 System.out.println(valorD);
		System.out.println(valorE);*/
			
		//String teste
		/*String nome1 = "Maria";
		 String nome2 = "João";
		 String nome3 = "Israel";
		String nome4 = "Kevin";
		String nome5 = "Paula";
		 String nome6 = "Nanda";
		 String nome7 = "Kelly";
		String nome8 = "Samyres";
		String nome9 = "Bruna";
		 String nome10 ="Ana";
		

        //Criar variaveis double
		double a = 54.2;
		 double b = 56.9;
		 double c = 432.44;
		double d = 43;
		double e = 32;
		 double f = 44.50;
		 double g = 332.1;
		double h = 1.5;
		double i = 66.6;
		 double j = 3333.3;
		
		//fazer a variavel int ler o double de forma com o numero inteiro
		int valorA = (int)a;
		 int valorB =(int)b;
		 int valorC = (int)c;
		int valorD = (int)d;
		int valorE = (int)e;
		 int valorF = (int)f;
		 int valorG = (int)g;
		int valorH = (int)h;
		int valorI = (int)i;
		 int valorJ = (int)j;
		
		//mostrar no terminal 
		System.out.printf("Valor de %s é no total de: "+valorA,nome1);
		 System.out.printf(", e o valor de %s fica por: %d%n",nome2,valorB);
		 System.out.printf("O %s fez uma compra de R$:"+valorC,nome3);
		System.out.println();
		System.out.printf("E o %s deve o valor:"+valorD,nome4);
		 System.out.printf(" com a %s que foi:"+valorE,nome5);
		 
		 //depois tentar somalo
		 //quebra de linha
		System.out.println();
		System.out.printf("%s pediu R$:"+valorF,nome6);
		 System.out.printf(" e a %s, pediu %.2f",nome7,g);
		 System.out.println();
		System.out.printf("%s deve R$:"+valorH,nome8);
		System.out.println(" juntando com aquela divida antiga de "+valorI);
		 System.out.printf("%s ela esqueceu de pegar os "+valorJ,nome9);
		 
		 //quebra de linha
		 System.out.println();
		System.out.printf("E a %s quase esqueceu de dar %d Reais.",nome10,valorG);*/
		
		/*//variavel 3 variaveis int
		int numero1,numero2,soma;
		numero1 = 4;
		numero2 = 6;
		
		//soma dos numeros
		soma = numero1 + numero2;
		
		//variavel double media
		double media = soma /2.0;
				
		System.out.println("Numero1:"+numero1);
		 System.out.println("Numero2:"+numero2);
		  System.out.println("Soma:"+soma);
		   System.out.println("Média:"+media);*/
		
		//duas variaveis int
		/*int valorInteiro1 = 67;
		int multiplicador = 76;
		
		//double
		double valorComPonto = 9.0;
		
		//calcular o valor
		int produto = valorInteiro1 * multiplicador;
		double resultadoD = valorInteiro1 / valorComPonto;
		
		//mostar na tela td
		System.out.println("Valor Inteiro:"+valorInteiro1);
		System.out.println("Multiplicador:"+multiplicador);
		System.out.println("Valor com Ponto:"+valorComPonto);
		System.out.println("Produto:"+produto);
		System.out.printf("Resultado da Divisão: %.2f",resultadoD);*/
		
		/*// variavel int
		int valorInteiro = 4;
		
		//variavel double
		double valorDouble = 3.5;
		
		// fazer a divisão
		double resultado = valorInteiro / valorDouble;
		
		//declarar o resto por 7 do valor inteiro
		int resto = valorInteiro % 7;
		
		//mostrar na tela tds
		System.out.println("Valor Inteiro: "+valorInteiro);
		System.out.println("Valor Double: "+valorDouble);
		System.out.printf("Resultado: %.2f%n",resultado);
		System.out.println("Resto da Divisão; "+resto);*/
		
		/*//int lado
		int lado = 10;
		
		//double raio
		double raio = 12.5;
		
		//area quadrada (lado*lado)
		int areaQuadrada = lado*lado;
		
		//perimetro quadrado (4*lado)
		int perimetroQuadrado  = 4*lado;
		
		//a area do circulo com math.pi *area *area
		double areaCircular = Math.PI *raio *raio;
		
		//mostrar tudo na tela
		System.out.println("Lado: "+lado);
		System.out.printf("Raio: %.1f%n",raio);
	    System.out.println("Area Quadrada:"+areaQuadrada);
	    System.out.println("Perimetro Quadrado: "+perimetroQuadrado);
	    System.out.println("Area Circular: "+areaCircular);*/
		
		//4 variaveis double hrTrabalhada taxaHr salarioBruto descontoImposto
		double horaTrabalhada = 7;
		double taxaHora = 6.94;
		double descontoImposto = 0.15; //15%
		
		//multiplicar para descobrir o valor semanal
		double salarioBruto = horaTrabalhada * taxaHora;
		
		//calcular o imposto no salario
		double valorDesconto = salarioBruto * descontoImposto;
		
		//calcular o salario liquido
		double salarioLiquido = salarioBruto - descontoImposto;
		
		//mostara no terminal
		System.out.println("Hora Trabalhada: "+horaTrabalhada);
		System.out.printf("Taxa por Hora; %.2f%n",taxaHora);
		System.out.println("Desconto do Imposto: "+descontoImposto);
		System.out.printf("Salario Bruto: %.2f%n",salarioBruto);
		System.out.printf("Valor do Desconto: %.2f%n",valorDesconto);
		System.out.printf("Salario Líquido: %.2f%n",salarioLiquido);
		
		
		
		
		 
		 
		
		
	}

}
