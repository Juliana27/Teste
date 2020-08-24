package exercicioFinal;

public class Supervisor extends Funcionario{
	
	private String setor;
	
	
	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public double calculaImposto() {
		return this.getSalario() * 0.05;
	}

}
