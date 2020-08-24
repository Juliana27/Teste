package teste;

public class Carro {
	
	private String marca;
	private String modelo;
	private String ano;
	private String variante;
	
	public Carro(String marca, String modelo, String ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}




	protected int quantCarro = 0;

	void adicionaPessoa() {
		if (quantCarro < 5) {
			quantCarro = quantCarro + 1;
		} else {
			System.out.println("Carro lotado");
		}
	}
	
	void removePessoa() {
		if (quantCarro > 0) {
			quantCarro = quantCarro - 1;
		} else {
			System.out.println("Carro vazio");
		}
	}
	void informaQuant() {
		System.out.println("Quantidade de pessoas no carro: " + quantCarro);
	}
		

	

}
