package orientadaObj4;

public class Retangulo {
	//variaveis
	double altura;
	double largura;

public double CalcularAreaRetangulo() 
  	{
	return altura * largura;//return responsavem por fazer os calculos
    }

public double CalcularPerimetroDoRetangulo () 
	{
	return 2 * (altura + largura); //return resoponsavel por fazer os calculos
	}
	
	public static void main(String[] args ) {
	Retangulo totalRetangulo = new Retangulo();
	totalRetangulo.altura = 10;
	totalRetangulo.largura = 20;
	
	Retangulo totalRetangulo2 = new Retangulo();
	totalRetangulo2.altura = 15;
	totalRetangulo2.largura = 30;
	
	double resultadoRetangulo1 = totalRetangulo.CalcularAreaRetangulo();
	double resultadoPerimetro1 = totalRetangulo.CalcularPerimetroDoRetangulo();
	System.out.println(resultadoRetangulo1);
	System.out.println(resultadoPerimetro1);
	
	double resultadoRetangulo2 = totalRetangulo2.CalcularAreaRetangulo();
	double resultadoPerimetro2 = totalRetangulo2.CalcularPerimetroDoRetangulo();
	System.out.println(resultadoRetangulo2);
	System.out.println(resultadoPerimetro2);
}	
}