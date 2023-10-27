package getSet1;

public class Main {
	public static void main(String[] args) {
	Livro livro1 = new Livro();
	
	livro1.setTitulo("CyberPunk");
	System.out.println(livro1.getTitulo());
	
	livro1.setAutor("Obsoft");
	System.out.println(livro1.getAutor());
	
	livro1.setAnoDeLancamento(2077);
	System.out.println(livro1.getAnoDeLancamento());
	
	livro1.setBrinde("chaveiro");
	System.out.println(livro1.getBrinde());
	
	livro1.setPreco(13.99);
	System.out.println(livro1.getPreco());
	
	livro1.setRua("Rua das palmas");
	System.out.println(livro1.getRua());
	
	livro1.setNumeroDaCasa(389);
	System.out.println(livro1.getNumeroDaCasa());
	
	livro1.setBairro("Cidade Nova");
	System.out.println(livro1.getBairro());
	
	livro1.setEstado("Ceará");
	System.out.println(livro1.getEstado());

	livro1.setTelefone("984225206");
	System.out.println(livro1.getTelefone());
	}
	
}
