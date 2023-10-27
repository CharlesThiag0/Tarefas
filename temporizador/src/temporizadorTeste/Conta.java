package temporizadorTeste;

public class Conta {
	//Adc atributos
	DadosTitular titular;
	double saldo;
	
	public boolean deposito (double valor) {
		if (valor > 0) {
		this.saldo += valor;
		return true;
		} else {
			return false;
		}
	}
	
	public boolean sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tranferencia (double valor, Conta destino) {
		if(sacar(valor)){
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
}