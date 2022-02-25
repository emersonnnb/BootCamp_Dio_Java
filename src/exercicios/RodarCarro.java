package exercicios;

public class RodarCarro {

	public static void main(String[] args) {

		Carro carro1 = new Carro ();
		
		//CONSTRUTOR SIMPLES DEFAULT
		carro1.setCor("Azul");
		carro1.setModelo("Fiat");
		carro1.setCapacidadeTanque(30);		
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(6));
		
		
		Carro carro2 = new Carro("Preto", "BMW", 50);
		
		//CONSTRUTOR SIMPLES COMPLETO
		System.out.println("-------------------------------------");
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(2));
			
			
	}

}
