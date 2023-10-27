package orientadaObj0;

public class Banco {
	String nome;
	int agencia;
	double saldo;
	int numero;

	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean tranferir(double valor, Banco destino) {
		if (sacar(valor)) {
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
}