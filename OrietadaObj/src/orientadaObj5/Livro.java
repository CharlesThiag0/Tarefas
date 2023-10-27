package orientadaObj5;

public class Livro {
	//variaveis
	String autor;
	String tituloDoLivro;
	int numeroDePaginas;
	int dataDeLancamento;
	
	public void mostrarDetalhes () {
		System.out.printf("Autor : %s%n",autor);
		System.out.printf("Titulo do livro : %s%n",tituloDoLivro);
		System.out.printf("Total de Paginas : %s%n",numeroDePaginas);
		System.out.printf("Lançamento : %s%n",dataDeLancamento);
	}
}

