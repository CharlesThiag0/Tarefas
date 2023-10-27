package orientadaObj0;

public class UsuarioDoBanco {
	public static void main(String[] args) {
		Banco usuario1 = new Banco();
		usuario1.saldo = 1000;
		usuario1.agencia = 131313;
		usuario1.nome = "Charles";
		usuario1.numero = 0001;
		
		Banco usuario2 = new Banco();
		usuario2.saldo = 0;
		System.out.println(usuario2.saldo);
		
		if(usuario1.tranferir(99, usuario2)) {
			System.out.println("com sucesso");
			System.out.println("SALDO ATUAL1 : " + usuario1.saldo);
			System.out.println("SALDO ATUAL2 : " + usuario2.saldo);

		} else {
			System.out.println("Dinheiro insuficiente");
		}
		
		
		/*System.out.println(usuario1.saldo);
		if(usuario1.depositar(1000)) {
			System.out.println("Efetuado o deposito");
			System.out.println(usuario1.saldo);
		} 
		
		if (usuario1.sacar(901)) {
			System.out.println("Saque efetuado");
			System.out.println("VALOR ATUAL : " + usuario1.saldo);
		} else {
			System.out.println("VALOR INSUFICIENTE");
		}*/

	}
}
