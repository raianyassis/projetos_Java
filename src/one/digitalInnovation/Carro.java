package dio.teste;

public class Carro {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }

    String Cor;
    String Modelo;
    int CapacidadeTanque;

    public Carro(){

    }

    public Carro(String Cor, String Modelo, int CapacidadeTanque){
        this.Cor = Cor;
        this.Modelo = Modelo;
        this.CapacidadeTanque = CapacidadeTanque;

    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getCor() {
        return Cor;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getModelo() {
        return this.Modelo;

    }
    public void setCapacidadeTanque(int CapacidadeTanque) {
        this.CapacidadeTanque = CapacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return CapacidadeTanque;
    }


    public double totalValorTanque(double ValorCombustivel) {
        return CapacidadeTanque * ValorCombustivel;
    }


}