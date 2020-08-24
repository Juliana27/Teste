package exercicioFinal;

public class Programa {

	public static void main(String[] args) {

		Funcionario gerente = new Gerente();
		gerente.setSalario(1000.0);
		System.out.println(gerente.calculaImposto());
		
		Funcionario atendente = new Atendente();
		atendente.setSalario(1000.0);
		System.out.println(atendente.calculaImposto());
		
		Funcionario supervisor = new Supervisor();
		supervisor.setSalario(1000.0);
		System.out.println(supervisor.calculaImposto());

	}

}
