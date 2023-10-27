package orientadaObj10;

import java.util.Scanner;

public class Compras {
	String produto;
	int codigo;
	double preco;
	double total;
	
	public static void metudoScanner () {
	Scanner sc = new Scanner(System.in);
	}
	
	public double rotaPreco () {
	//	codigo = sc.nextInt();
		if (codigo == 131313) {
		return preco = 5.99;
		} else if (codigo == 141414){
			return preco = 10.00;
		} else if (codigo == 151515) {
			return preco = 9.99;
		} else {
			return 0;
		}
	}
	
	public double desconto () {
		return (preco * 0.08);
	}
	
	public static void main (String [] args) {
		//Scanner sc = new Scanner(System.in);
		
		Compras dadosCliente1 = new Compras();
		//loop
		System.out.println("Digite o codigo do produto");
		double codigoDoProduto1 = dadosCliente1.rotaPreco();
		if (codigoDoProduto1 == 0) {
			System.out.println("Codigo inválido");
			//codigoDoProduto1 = dadosCliente1.codigo = sc.nextInt();
		}
		double precoDoProduto1 = dadosCliente1.preco;
		double descontoDoProduto1 = dadosCliente1.desconto();
		double valorFinal1 = precoDoProduto1 - descontoDoProduto1;
		
		/*Compras dadosCliente2 = new Compras();
		int codigoDoProduto2 = dadosCliente2.codigo =sc.nextInt();
		if (codigoDoProduto2 == 141414) {
			String nomeDoProduto2 = dadosCliente2.produto = "Feijão";
		} else {
			System.out.println("Codigo inválido");;
		}
		double precoDoProduto2 = dadosCliente2.preco = 5.80;
		double descontoDoProduto2 = dadosCliente2.desconto();
		double valorFinal2 = precoDoProduto2 - descontoDoProduto2;
		
		Compras dadosCliente3 = new Compras();
		int codigoDoProduto3 = dadosCliente3.codigo = sc.nextInt();
		if (codigoDoProduto3 == 151515) {
			String nomeDoProduto3 = dadosCliente3.produto = "Macarrão";
		} else {
			System.out.println("Codigo inválido");;
		}
		double precoDoProduto3 = dadosCliente3.preco = 4.99;
		double descontoDoProduto3 = dadosCliente3.desconto();
		double valorFinal3 = precoDoProduto3 - descontoDoProduto3;*/
		
		System.out.printf("%.2f%n",valorFinal1);
		//System.out.printf("%.2f%n",valorFinal3);
		//System.out.printf("%.2f",valorFinal2);
	}
}
