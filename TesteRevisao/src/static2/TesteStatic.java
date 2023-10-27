package static2;

public class TesteStatic {
	private String nome;
	private int idade;
	private static int quantidadeDeCadastros;

	public TesteStatic(String nome, int idade) {
		TesteStatic.quantidadeDeCadastros++;
		this.nome = nome;
		this.idade = idade;
	}

	public static int getQuantidadeDeCadastros() {
		return TesteStatic.quantidadeDeCadastros;
	}
	
}
