package exercicioum;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		        /*                   1            
		        // criar variavel string product1 e 2
		String product1 = "Computer";
		String product2 = "Office desk";
				//variavei int 3ege code gender
		int ege = 30;
		int code = 5290;
				//variavel char
		char gender = 'F';					
				//variavel double price 1 2 measure
		double price1 =2100.0;
		double price2 =650.50;
		double measure = 53.234567;			
				//mostrar no terminal
		System.out.println("Products:");
		        //terminal product1  which price is , price1 
		System.out.printf("%s which  price is %.2f %n",product1,price1); 	
		        //product2 , which price is,price2 
	    System.out.printf("%s , wich price is $ %.2f %n",product2,price2); 
	            //Record: ege years old , code 5290  and gender:
	    System.out.println();
	    System.out.printf("Record: %d years old , code %d and gender:"+ gender,ege , code);
	            //measue with eight decimal places : MEASURE 
	    System.out.println();
	    System.out.println();
	    System.out.printf("Measue with eight decimal places : %.8f %n",measure);
	           //Rouded (three decimal pleaces: MEASURE
	    System.out.printf("Rouded (three decimal pleaces): %.3f %n", measure);
	           //baixar locale
	    Locale.setDefault(Locale.US);
	           //US decimal point: MEASURE
	    System.out.printf("US decimal point: %.3f",measure);*/
		/*                          2
		
		//Criar duas variaveis String  Product
		String Product1 = "Smartphone";
		String Product2 = "Headphones";
		
		//Criar duas variaveis Int ege product code
		int ege = 25;
		int productCode = 1234;
		
		//uma variavel char  gender 
		char gender = 'M';
		
		//3 variavel double price1,2  measurement
		double price1 = 799.99;
		double  price2 = 99.50;
		double measurement = 123.456789;
		  
		//exibir o nome com o valor dos produtos formatados com 2 casas decimais
		System.out.printf("Product %s R$ %.2f, %s it is R$ %.2f %n",Product1,price1,Product2,price2);
		
		//linha em branco
		System.out.println();
		
		//exibir a frase Record: EGE years old, code PRODUCTCODE and gender: GENDER 
		System.out.printf("Record: %d years old, code %d and gender: %c %n",ege,productCode,gender);
		
		//linha em branco
		System.out.println();
		
		//exibir a medida com 8 casa decimais
		System.out.printf("Measurement: %.8f %n",measurement);
		
		//exibir a medica com 3 casas decimais
		System.out.printf("Measurement in a rounded way %.3f %n",measurement);
		
		//exibir novamente mas com o ponto locale US
		Locale.setDefault(Locale.US);
		System.out.printf("Measurement: %.3f",measurement);*/
		/*                             3
		//variavel String Product1,2 laptop mouse
		String Product1 = "Laptop";
		String Product2 = "Mouse";
		
		              //variavel int ege, Productcode
		 int ege = 28;
		 int Productcode  = 5465;
		 
		              //variavel char gender
		 char gender = 'F';
		 
		              //variavel double price1,2 measurement 
		double price1 = 1299.99;
		double price2 = 19.95;
		double measurement = 87.7654432;
		
		              //exibir o produto com o preço formatado em 2casas
		System.out.printf("O produto %s está por apenas R$ %.2f e o %s por %.2f %n",Product1,price1,Product2,price2);
		
		              //linha em branco
		System.out.println();
		
                      //exibir o texto Record: X years old, code Y and gender: Z	
		System.out.printf("Registro: %d anos, o código é %d e o gênero: %c %n",ege,Productcode,gender);
		
		              //vazio
		System.out.println();
		
		              //exibir medida com 8 casas decimais
		System.out.printf("Medida %.8f %n",measurement);
		
		              //medida com3 casas decimais
		System.out.printf("Medida %.3f %n",measurement);
		
		              //definir ponto de local US
		Locale.setDefault(Locale.US);
		
		              // novamente a medida em 3 casas decimais
		System.out.printf("%.3f ",measurement);*/
		
		//4 variavel String produto1,2,3,4,5
		   String Produto1 = "Tablet";
		  String Produto2 = "Teclado";
		 String Produto3 = "Monitor";
		String Produto4 = "Celular";
	   String Produto5 = "Fone";
		
		//2variaveis int idade codigo de barra
	   int idade1 = 23;
		 int idade2 = 17;
		  int codigoB1 = 54942;
		   int codigoB2 = 12213;
		    int codigoB3 = 23413;
		  int codigoB4 = 22134;
		 int bilhete = 6400443;
		
		//variavel char genero
		char genero1 = 'M';
		char gereno2 = 'F';
		
		//5variaveis double preco1,2,3,4,5 , medida
		double preco1 = 332.99;
		  double preco2 = 1243.50;
		double preco3 = 999.99;
		  double preco4 = 20.99;
		double preco5 = 50.99;
		  double medida = 85.7484233;
		double angulo = 90.8803;
		
		//exibir nome do produto e preco de forma formatada
		System.out.printf(" %s está por %.2f e o codigo de barras %d%n",Produto1,preco1,codigoB1);
		  System.out.printf(" %s custa %.2f, codigo %d%n",Produto2,preco5,codigoB2);
		  System.out.printf(" %s esta por apenas %.2f com o codigo de barras %d%n",Produto3,preco2,codigoB3);
		  System.out.printf(" %s esta no valor de %.2f e este é o codigo do produto %d%n",Produto4,preco3,codigoB4);
		System.out.printf(" %s custa apenas %.2f com o desconto, usando o bilhete %d%n",Produto5,preco4,bilhete);
		
		//linha em branco
	     System.out.println();
	    
	    //exibir a frasse com idade codigo e genero de forma formatada
	     System.out.printf("Registro: %d anos, genero %c%n",idade1,genero1);
	      System.out.printf("Registro: %d anos e de genero %c%n",idade2,genero1);
	      System.out.printf("Registro: %d genero %c%n",idade2,gereno2);
	      
	    //linha em branco
	     System.out.println();
	     
	     //exibir medidas e angulo em 8casas decimais
	     System.out.printf("Medida no total de: %.8f%n",medida);
	     System.out.printf("Angulo total de %.5f%n",angulo);
	     
	     //mudar para locale US
	     Locale.setDefault(Locale.US);
	     
	     //mostrar medida e angulo com 3 casas decimais deforma formatada
	     System.out.printf(" Medida em %.3f%n",medida);
	     System.out.printf(" Angulo em %.3f%n", angulo);
	     
	     
	     
	      
	      
	     
		
		
		
		
		
		
		
		 
		
		
		
		
	    
	}
}
