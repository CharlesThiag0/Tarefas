package temporizadorTeste;

public class DadosConta {
		public static void main(String[] args) {
			Conta usuario1 = new Conta();//Criar um obj
		
			DadosTitular complementorTitular = new DadosTitular();//criar o obj para existir os atributos
			usuario1.titular = complementorTitular; //fazer uma "junção" das duas
			usuario1.titular.nome = "Charles";//denominação do sujeito1 qe ce localiza no class mas esse atributo se tornou
											 //uma classe e para localizado teve que procurar usando (ponto)
			
			System.out.println(usuario1.titular);       //Teste.DadosTitular@7a79be86
			System.out.println(complementorTitular);   //Teste.DadosTitular@7a79be86
			System.out.println(usuario1.titular.nome);   //Charles
		}
}