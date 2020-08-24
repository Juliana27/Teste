package teste;

public class ProgramaTeste1 {
	public static void main(String[] args) {
		Carro carro = new Carro("VW","Gol", "2000");
		carro.quantCarro = 1;
		carro.informaQuant();
		carro.adicionaPessoa();
		carro.adicionaPessoa();
		carro.informaQuant();
		carro.removePessoa();
		carro.informaQuant();
		
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getAno());
		
	}
}
