package orientadaObj11;

import java.util.Scanner;

public class Produto {
	String nome;
	int quantidadeNoEstoque;
	int codigo;
	double preco;
	
	public double desconto () {
		return preco * 0.08;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto dados1 = new Produto ();
		String nome1 = dados1.nome = sc.nextLine();
		int codigo1 = dados1.codigo = sc.nextInt();
		double preco1 = dados1.preco = sc.nextDouble();
		int quantidade1 = dados1.quantidadeNoEstoque = sc.nextInt();
		double desconto1 = dados1.desconto();
		
		System.out.printf("O %s está com o codigo %d e com o preço de  %.2f, com %d em estoque com o desconto de %.2f "
				, nome1, codigo1, preco1, quantidade1, desconto1);
				
		sc.close();
		
	}
}
