package orientadaObj4;

public class Pessoa {
	String nomeDoAluno;
	double segundaNota;
	double primeiraNota;
	int numeroDaChamada;
	int idadeAluno;
	
	public double mediaDoAluno () 
	    {
		return (primeiraNota + segundaNota) / 2;
	    }
}
