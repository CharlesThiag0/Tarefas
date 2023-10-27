package orientadaObj9;

import java.util.Scanner;

public class Bimestre {
	String nomeDoAluno ;
	double nota1;
	double nota2;
	
public void pontoExtra (double valor) {
	this.nota1 += valor;
}
	
	public double media () {
		return (nota1 + nota2 ) / 2;
	}
	
	public boolean opcao () {
		if ((nota1 + nota2) / 2 >= 60.00) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		Bimestre aluno1 = new Bimestre();
		Scanner sc = new Scanner (System.in);
		String nome1 = aluno1.nomeDoAluno = sc.next();
		
		do {
			System.out.println("Nota1");
		aluno1.nota1 = sc.nextDouble();
		System.out.println("Nota2");
		aluno1.nota2 = sc.nextDouble(); 
		
		if (aluno1.nota1 < 0 || aluno1.nota1 > 100 ||
				aluno1.nota2 < 0 || aluno1.nota2 > 100) {
			System.out.println("Sua nota foi invalida, digite novamente");
		}
		
		}while (aluno1.nota1 < 0 || aluno1.nota1 > 100||
				aluno1.nota2 < 0 || aluno1.nota2 > 100);
		aluno1.pontoExtra(90);
		double segundoBimestre = aluno1.nota2;
		double primeiroBimestre = aluno1.nota1;
		double mediaAluno1 = aluno1.media();
		
		
		System.out.printf("%s sua nota no primeiro Bismestre foi : %.2f%n"
								,nome1 ,primeiroBimestre );
		System.out.printf("Segundo Bismestre %.2f ficando com sua media de : %.2f%n"
								,segundoBimestre , mediaAluno1);
		
		if (aluno1.opcao() == true) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}