package orientadaObj5;

public class DadosLivros {

	public static void main(String[] args) {
		//criar o obj
		Livro dadosLivros = new Livro ();
		dadosLivros.autor = "Charles";
		dadosLivros.dataDeLancamento = 2077;
		dadosLivros.numeroDePaginas = 683;
		dadosLivros.tituloDoLivro = "CyberPunk";
		
		dadosLivros.mostrarDetalhes();
	}

}
