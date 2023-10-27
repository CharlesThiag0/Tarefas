package pacoteife14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Scanner,import,new,System.in
		Scanner teclado = new Scanner(System.in);
		
		//pergunta dos horarios do jogo
		System.out.println("Digite a hora inical e final do jogo");
		
		//pegar os dados
		int horaI = teclado.nextInt();
		int horaF = teclado.nextInt();
		int menos = horaI - horaF;
		int horaD = 24;
		int resultado = horaD - menos;
		
		//rota if else 
	    if (resultado <= horaD) {
	    	System.out.println(resultado);
	    }
	    else if (resultado == 0) {
	    	int res = resultado + 24;
	    	System.out.println(res);
	    } 
	    else if (resultado > 24) {
	    	int resu = resultado - 24;
	    	System.out.println(resu);
	    }
		//encerrar scanner
	    teclado.close();
		

	}

}
