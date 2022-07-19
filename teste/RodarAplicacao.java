package dio.teste;

public class RodarAplicacao {

	private static double ValorCombustivel;
	private static String Modelo;
	private static int CapacidadeTanque;
	private static String Cor;

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		
		carro1.setCor("Azul");
		carro1.setModelo("BMW Série 3");
		carro1.setCapacidadeTanque(59);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());	
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.totalValorTanque(ValorCombustivel= 6));
		
		Carro carro2 = new Carro(Cor= "Cinza", Modelo= "Mercedes-Benz Classe C ", CapacidadeTanque= 66);
		
		System.out.println(carro2.getModelo()); 
		System.out.println(carro2.getCor());	
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(ValorCombustivel= 6.46));
		
		}

}