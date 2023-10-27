package getSet2;

public class Main {
	public static void main(String[] args) {
		//criar obj
		Funcionario usuario1 = new Funcionario("", 0, 0000, "");
		usuario1.setNome("Charles");
		System.out.println(usuario1.getNome());
		
		usuario1.setIdade(22);
		System.out.println(usuario1.getIdade());
		
		usuario1.setCargo("Limpador de peças");
		System.out.println(usuario1.getCargo());
		
		usuario1.setSalario(1200);
		System.out.println(usuario1.getSalario());
		
		System.out.println();
		
		usuario1.setCep(98989833);
		System.out.println(usuario1.getCep());
		
		usuario1.setNumeroDaCasa(389);
		System.out.println(usuario1.getNumeroDaCasa());
		
		usuario1.setRua("Rua das palmas");
		System.out.println(usuario1.getRua());
	}
}
