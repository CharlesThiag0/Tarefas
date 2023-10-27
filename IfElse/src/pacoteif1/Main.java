package pacoteif1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    //Scanner,import,new,System.in(Para escanear a entrada de dados)
	Scanner sc = new Scanner(System.in);
	
	//Pedido do numero
	System.out.println("Digite a hora atual");
	
	//Recolhimento do dados
    int hora = sc.nextInt();
	
	//if, else(Caminho do dados)
    if (hora <= 11) {
    	System.out.println("Bom dia");
    } 
    else if (hora <= 18) {
    	System.out.println("Boa tarde");
    }
    else {
    	System.out.println("Boa noite");
    }

	//encerrar Scanner
    sc.close();
	
		
	}

}
