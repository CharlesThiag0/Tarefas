package temporizador;

import java.util.Scanner;

public class ProjetoTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//leitura de dados
		
		int hora = sc.nextInt();//recolher dados
		int minutos = sc.nextInt();
		int segundos = sc.nextInt();
		
		//calculo
		int tempoEmSegundos = hora * 3600 + minutos * 60 + segundos; 
		
		//loop em whille
		while (tempoEmSegundos > 0) {
			hora = tempoEmSegundos / 3600;
				/*minutos = (tempoEmSegundos - hora *  3600) / 60;
				segundos = (tempoEmSegundos - hora *  3600 - minutos *  60) / 60;*/
			segundos = tempoEmSegundos % 60;
			minutos = tempoEmSegundos / 60 % 60;   
				
			tempoEmSegundos --;
			System.out.println(hora+":"+minutos+":"+segundos);
		}
		
        sc.close();
	}

}
