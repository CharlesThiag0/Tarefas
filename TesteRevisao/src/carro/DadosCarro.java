package carro;

public class DadosCarro {
	private String nomeDoCarro;
	private int ano;
	private double preco;

	public DadosCarro(String nomeDoCarro, int ano, double preco) {
		if (nomeDoCarro != null) {
			this.nomeDoCarro = nomeDoCarro;
		} else {
			this.nomeDoCarro = "Saveiro Surf";
			System.out.println("Nome não encontrado, Determinamos " + this.nomeDoCarro);
		}

		if (ano >= 1891) {
			this.ano = ano;
		} else {
			this.ano = 2017;
			System.out.println("Ano inválido, Determinamos " + this.ano);
		}

		if (preco > 0) {
			this.preco = preco;
		} else {
			this.preco = 40000.0;
			System.out.println("Preco Inválido, Determinamos " + this.preco);
		}

	}

	public DadosCarro(String nomeDoCarro, double preco) {
		this(nomeDoCarro, 2017, preco);
	}

}
