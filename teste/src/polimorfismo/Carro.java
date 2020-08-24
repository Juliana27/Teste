package polimorfismo;

public class Carro extends Veiculo {

	public int quantidadeDePortas;

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}
	
	public double calculaImposto() {
		return this.getValorVenal() * 0.07;
	}
}
