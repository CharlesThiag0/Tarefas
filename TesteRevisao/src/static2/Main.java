package static2;

public class Main {
	 public static void main(String[] args) {
		TesteStatic usuario = new TesteStatic("Charles", 22);
		TesteStatic usuario1 = new TesteStatic("Thiago", 22);
		TesteStatic usuario2 = new TesteStatic("Santos", 22);
		
		System.out.println(TesteStatic.getQuantidadeDeCadastros());
	}
}
