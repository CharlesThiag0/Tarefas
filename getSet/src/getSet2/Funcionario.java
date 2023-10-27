package getSet2;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;
	private String cargo;
	private Endereco endereco = new Endereco();
	
	//construtor
	public Funcionario (String nome ,int idade ,double salario ,String cargo) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	//metudos get
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade () {
		return this.idade;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public String getCargo () {
		return this.cargo;
	}
	
	public String getRua () {
		return this.endereco.rua;
	}
	
	public int getNumeroDaCasa() {
		return this.endereco.numeroDaCasa;
	}
	
	public int getCep() {
		return this.endereco.cep;
	}
	
	//metudos set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public void setSalario (double salario) {
		this.salario = salario;
	}
	
	public void setCargo (String cargo) {
		this.cargo = cargo;
	}
	
	public void setRua (String rua) {
		this.endereco.rua = rua;
	}
	
	public void setNumeroDaCasa (int numeroDaCasa) {
		this.endereco.numeroDaCasa = numeroDaCasa;
	}
	
	public void setCep (int cep) {
		this.endereco.cep = cep;
	}
		
}
