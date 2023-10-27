package orientadaObj12;

public class ByteBank {

	public static void main(String[] args) {
		DadosByteBank usuario1 = new DadosByteBank();
		//String nome1 = usuario1.titular = "Charles";
		double saldo1 = usuario1.saldo = 210;
		//if(usuario1.saca(20)) {
		//	System.out.println("Saque efetuado com sucesso");
		///} else {
			// System.out.println("Saque falhou");
		//}
		//int numero1 = usuario1.numero = 984225206;
		//int agencia1 = usuario1.agencia = 131313;
		
		DadosByteBank usuario2 = new DadosByteBank();
		double saldo2 = usuario2.saldo = 190;
		usuario2.tranferir(10, usuario1);
		System.out.println(usuario2.saldo);
		System.out.println(usuario1.saldo);
		//usuario2.saldo = 200;
		//usuario2.saldo += 100;
		//usuario1.depositar(100);
		//usuario2.depositar(10);
		
		//if(sacar1 == true) {
		//	System.out.println("Saque efetuado com sucesso");
	//	} else {
		//	System.out.println("Não foi permitido, saldo insuficiente");
	//}
		//System.out.printf("O usuario 1 : %s esta com o saldo de %.2f R$%n",nome1 ,saldo1);
		//System.out.printf("Com a agencia %d , para entrar em contato use o %d%n",agencia1 ,numero1);
		//System.out.println(sacar1);
		//System.out.println(saldo1);
		//System.out.println(usuario1.saldo);
	}
}