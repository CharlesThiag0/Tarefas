package printF;

import java.util.Locale;

public class Printf {

	public static void main(String[] args) {
		//double ACOMPANHADO DE %n (Quebra de linha)
		double a = 2.0;
		double b = 5.0;
		
		System.out.printf("O numero A em 2 casas decimais %.2f%n",a);
		System.out.printf("O numero B em 4 casas decimais %.4f%n",b);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Locale.US  definiu que ira mostrar o A com ponto final: A= %.2f%n",a);
		
		//int ACOMPANHADO DE %n (Quebra de linha)
		int c = 5;
		int d = 10;
		
		System.out.printf("O numero A= %d%n",c);//%d de denominador ACOMPANHADO DE %n (Quebra de linha)
		System.out.printf("O numero B= %d%n",d);
		
		//String
		String e = "nome1";
		String f = "nome2";
		
		System.out.printf("O %s é o primeiro%n",e);//%s Sujeito ACOMPANHADO DE %n (Quebra de linha)
		System.out.printf("E o %s é o segundo%n",f);
		
		//Char ACOMPANHADO DE %n (Quebra de linha)
		char g = 'M';
		char h = 'F';
		
		System.out.printf("O genero é %c%n",g);
		System.out.printf("O genero é %c%n",h);
		
		//Geral
		System.out.printf("O %s tem a idade %d, e é do gênero %c com R$ %.2f%n",e, d, g, b);//(Na sequência)

		
		
	}

}
