package orientadaObj3;


public class Casa {
	public static void main (String[] args) {
		FundamentosDaCasa ProjetoDaCasa = new FundamentosDaCasa();
		ProjetoDaCasa.altura = 25;
		ProjetoDaCasa.largura = 100;
		ProjetoDaCasa.area = ProjetoDaCasa.altura * ProjetoDaCasa.largura;
		System.out.printf("%.1f de altura com %.1f de "
				+ "largura ficara com a area de %.2f%n",
				ProjetoDaCasa.altura, ProjetoDaCasa.largura, ProjetoDaCasa.area);
	}
	
}
