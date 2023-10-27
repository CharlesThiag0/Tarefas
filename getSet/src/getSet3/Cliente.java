package getSet3;

public class Cliente {
	private String nome;
	private String pedido;
	private double preco;
	
	//construtor
	public Cliente (String nome ,String pedido ,double valor) {
		this.nome = nome;
		this.pedido = pedido;
		this.preco = valor;
	}
	
	//getters
	public String getNome() {
		return this.nome;
	}
	
	public String getPedido () {
		return this.pedido;
	}
	
	public double getPreco () {
		return this.preco;
	}
	
	//setters
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setPedido (String pedido) {
		this.pedido = pedido;
	}
	
	public void setPreco (double valor) {
		this.preco = valor;
	}
	
	//total conta
	public double total (double valor ,int quantidade) {
		double total = 0;
		for (int i = quantidade; i > 0; i--) {
			total += valor;
		}
		return total;
	}
	
	
}