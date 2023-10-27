package orientadaObj7;

public class Convite {
	String email;
	String nome;
	char genero;
	int idade;
	double contribuicaoParaFesta;

	public static void main (String[] args) {
		Convite dadosConvite = new Convite();
		String email1 = dadosConvite.email = "charlesthiagosantos@gmail.com";
		char genero1 =dadosConvite.genero = 'M';
		int idade1 = dadosConvite.idade = 22;
		String nome1 = dadosConvite.nome = "Charles";
		double contribuicao1 =dadosConvite.contribuicaoParaFesta = 500.00;
		
		Convite dadosConvite2 = new Convite();
		String email2 = dadosConvite2.email = "sdfsdf23@gmail.com";
		char genero2 = dadosConvite2.genero =  'M';
		int idade2 = dadosConvite2.idade = 21;
		double contribuicao2 = dadosConvite2.contribuicaoParaFesta = 654.60;
		String nome2 = dadosConvite2.nome = "Thiago";
		
		System.out.printf("O %s de %s com o genero %c esta com %d de idade e contribuiu com %.2f%n",
							email1, nome1, genero1, idade1, contribuicao1);
		
		System.out.printf("O %s de %s com o genero %c esta com %d de idade e contribuiu com %.2f%n",
				email2, nome2, genero2, idade2, contribuicao2);
	}
	
}
