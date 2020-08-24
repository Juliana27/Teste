package heranca;

public class Programa {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setMarca("Nissan");
		carro.setModelo("March");
		carro.setQuantidadeDePortas(4);
		carro.acelera();
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		System.out.println(carro.getQuantidadeDePortas());
		
		
		Motocicleta moto = new Motocicleta();
		moto.setMarca("Ducati");
		moto.setModelo("Streetfighter");
		moto.setCilindradas("850");
		System.out.println(moto.getMarca());
		System.out.println(moto.getModelo());
		System.out.println(moto.getCilindradas());

	}

}
