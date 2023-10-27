package orientadaObj6;

public class Calculadora {//Class responsavel de criar as variaveis e seu tipo
	int numeroA;
	int numeroB;
	
	public int soma () {//criei uma variavel int para poder armazenar o metudo(calculo) que neste caso
		return numeroA + numeroB;//o return é responsavel de voltar o resultado para a variavel
	}
	public int subtracao () {
		return numeroA - numeroB;
	}
	public int multiplicacao () {
		return numeroA * numeroB;
	}
	public int divisao () {

		return numeroA / numeroB;	
	}
	
	public static void main (String[] args ) {//cabeçalho padrão para poder ser executado o progama
		Calculadora dadosCalculos = new Calculadora();//criei um obj dadosCalc que dentro dele foi instalado a
		dadosCalculos.numeroA = 20;                  //class Calculadora podendo desfrutar das variaveis armazenadas
		dadosCalculos.numeroB = 11;//Aki armazenei um valor 
		
		Calculadora dadosCalculos2 = new Calculadora();
		dadosCalculos2.numeroA = 30;
		dadosCalculos2.numeroB = 11;
		
		//SOMA
		int soma = dadosCalculos.soma();//Criei uma variavel soma para poder armazenar o metudo (Caso futuramente
		System.out.println(soma);      //necessite desse resultado e mesmo nao usando deixar mais facil de ser lido)
		int soma2 = dadosCalculos2.soma();
		System.out.println(soma2);
		
		//SUBTRAÇÃO
		int subtracao = dadosCalculos.subtracao();
		System.out.println(subtracao);
		int subtracao2 = dadosCalculos2.subtracao();
		System.out.println(subtracao2);
		
		//MULTIPLICAÇÃO
		int multiplicacao = dadosCalculos.multiplicacao();
		System.out.println(multiplicacao);
		int multiplicacao2 = dadosCalculos2.multiplicacao();
		System.out.println(multiplicacao2);
		
		//DIVISAO
		int divisao = dadosCalculos.divisao();
		System.out.println(divisao);
		int divisao2 = dadosCalculos2.divisao();
		System.out.println(divisao2);
	}
}
