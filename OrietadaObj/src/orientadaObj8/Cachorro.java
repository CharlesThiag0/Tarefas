package orientadaObj8;

public class Cachorro {
	String nomeDoCachorro;
	int idade;
	String raca;
	double valor;
	double peso;
	
	public double desconto () {
		return  (valor * 0.91);	
	}
	
	public static void main (String[] args) {
		Cachorro dadosCachorro = new Cachorro();
		int idade = dadosCachorro.idade = 2;
		String nome = dadosCachorro.nomeDoCachorro = "Celta";
		String raca = dadosCachorro.raca = "Vira-lata";
		double preco = dadosCachorro.valor = 20000;
		double peso = dadosCachorro.peso = 24.200;
		double desconto = dadosCachorro.desconto();
		
		System.out.printf("A %s é %s com %d de idade e esta pesando %.3f e esta com o valor de %.1f R$, com o desconto fica %.2f",
							nome, raca, idade, peso, preco, desconto);
	}
}