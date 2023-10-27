package orientadaObj12;

public class DadosByteBank {
	String titular;
	double saldo;
	int numero;
	int agencia;
	
	public void depositar (double valor) {
		this.saldo += valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor ) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

    public boolean tranferir (double valor, DadosByteBank destino) {
    	if(saca(valor)) {
    		destino.depositar(valor);;
    		return true;
    	} else {
    		return false;
    	}
    }
	}

