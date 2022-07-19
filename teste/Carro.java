package dio.teste;

public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
			String Cor;
		    String Modelo;
		    int CapacidadeTanque;
			
		   Carro(){
			   
		   }
		   
		   Carro(String Cor, String Modelo, int CapacidadeTanque){
			   this.Cor = Cor;
			   this.Modelo = Modelo;
			   this.CapacidadeTanque = CapacidadeTanque;
			   
		   }

		    void setCor(String Cor) {
		        this.Cor = Cor;
		    }

		    String getCor() {
		        return Cor;
		    }

		    void setModelo(String Modelo) {
		        this.Modelo = Modelo;
		    }
		    
		    String getModelo() {
		        return this.Modelo;
		    
		    }
		    void setCapacidadeTanque(int CapacidadeTanque) {
		        this.CapacidadeTanque = CapacidadeTanque;
		    }

		    int getCapacidadeTanque() {
		        return CapacidadeTanque;
		    }

		   		    		    
		    double totalValorTanque(double ValorCombustivel) {
		        return CapacidadeTanque * ValorCombustivel;
		    }
		    
		   
}



