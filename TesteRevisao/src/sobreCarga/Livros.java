package sobreCarga;

public class Livros {
	private String nome;
	private String autor;
	private int lancamento;
	
	public Livros () {
		
	}
	
	public Livros (String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
	}
	
	public Livros (String nome, String autor, int lancamento) {
		this.nome = nome;
		this.autor = autor;
		this.lancamento = lancamento;
	}
	
}
