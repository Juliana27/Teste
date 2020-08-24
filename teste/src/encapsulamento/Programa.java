package encapsulamento;

public class Programa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("Juliana", 27, 12, 1992);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getDataNascimento());
		System.out.println(pessoa.calculaIdade());
		
		pessoa.setNome("Juliana Brito");
		
		System.out.println(pessoa.getNome());

	}

}
