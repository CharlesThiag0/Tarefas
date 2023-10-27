package orientadaObj4;

public class Aluno {
	public static void main (String[] args) {
		Pessoa aluno1 = new Pessoa();
		aluno1.nomeDoAluno = "Charles thiago";
		aluno1.numeroDaChamada = 8;
		aluno1.idadeAluno = 22;
		aluno1.primeiraNota = 7.0;
		aluno1.segundaNota = 8.0;
		aluno1.mediaDoAluno();
		
		System.out.println("Aluno : " + aluno1.nomeDoAluno);
		System.out.println("Idade : " + aluno1.idadeAluno);
		System.out.println("Numero da chamada : " + aluno1.numeroDaChamada);
		System.out.println("Primeira nota : " + aluno1.primeiraNota);
		System.out.println("Segunda nota: " + aluno1.segundaNota);
		System.out.println("Media : " + aluno1.mediaDoAluno());
		
		Pessoa aluno2 = new Pessoa();
		aluno2.nomeDoAluno = "Thiago santos";
		aluno2.numeroDaChamada = 19;
		aluno2.idadeAluno = 21;
		aluno2.primeiraNota =10;
		aluno2.segundaNota = 9;
		aluno2.mediaDoAluno();
		
		System.out.println();
		
		System.out.println("Aluno : " + aluno2.nomeDoAluno);
		System.out.println("Idade : " + aluno2.idadeAluno);
		System.out.println("Numero da chamada : " + aluno2.numeroDaChamada);
		System.out.println("Primeira nota : " + aluno2.primeiraNota);
		System.out.println("Segunda nota: " + aluno2.segundaNota);
		System.out.println("Media : " + aluno2.mediaDoAluno());
		
		
	}
}
