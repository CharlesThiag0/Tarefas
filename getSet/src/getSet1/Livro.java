package getSet1;

public class Livro {
	private String titulo;
	private String autor;
	private int anoDeLancamento;
	private String brinde;
	private double preco;
	private Endereco endereco = new Endereco();
	private Telefone telefone = new Telefone();

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return this.autor;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getAnoDeLancamento() {
		return this.anoDeLancamento;
	}

	public void setBrinde(String brinde) {
		this.brinde = brinde;
	}
	
	public String getBrinde() {
		return this.brinde;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setRua(String rua) {
		this.endereco.rua = rua;
	}
	
	public String getRua() {
		return this.endereco.rua;
	}
	
	public void setNumeroDaCasa(int numeroDaCasa) {
		this.endereco.numeroDaCasa = numeroDaCasa;
	}
	
	public int getNumeroDaCasa() {
		return this.endereco.numeroDaCasa;
	}
	
	public void setBairro(String bairro) {
		this.endereco.bairro = bairro;
	}
	
	public String getBairro() {
		return this.endereco.bairro;
	}
	
	public void setEstado (String estado) {
		this.endereco.estado = estado;
	}
	
	public String getEstado() {
		return this.endereco.estado;
	}
	
	public void setTelefone(String telefone) {
		this.telefone.telefone = telefone;
	}
	
	public String getTelefone() {
	return this.telefone.telefone;
	}
	
}
