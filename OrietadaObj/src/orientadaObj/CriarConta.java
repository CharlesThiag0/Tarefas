package orientadaObj;

public class CriarConta {
	
public static void main (String [] args) {//ponto de iniciar a aplicação 
		Conta primeiraConta = new Conta();//criar um obj
		primeiraConta.cliente = "charles";
		primeiraConta.saldo = 199;
		
		//crair um obj2
		//Conta segundaConta = new Conta();
		//segundaConta.cliente = "thiago";
		//segundaConta.saldo = 200;;
		
		//criar um obj3
		Conta terceiraConta = new Conta();
		terceiraConta.cliente = "santos";
		terceiraConta.saldo = 0.1;
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("1    "+primeiraConta.saldo);
		System.out.println("2    "+segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
	
	
}