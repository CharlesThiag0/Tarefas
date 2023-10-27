package getSet3;

public class Main {
	public static void main(String[] args) {
	//criar obj
	Cliente cliente1 = new Cliente("0","não registrado", 0);
	cliente1.setNome("Charles");
	System.out.println(cliente1.getNome());
	
	cliente1.setPedido("pizza");
	System.out.println(cliente1.getPedido());
	
	cliente1.setPreco(20.99);
	System.out.println(cliente1.getPreco());
	
	double valorTotal = cliente1.total(cliente1.getPreco(), 2);
	System.out.println(valorTotal);
	
	}
}	
