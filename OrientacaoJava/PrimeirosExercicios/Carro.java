class Carro{
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor
    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor=cor;
        this.modelo=modelo;
        this.capacidadeTanque=capacidadeTanque;
    }


    //Característica do carro
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //capacidade do Tanque
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    //Valor do tanque
    public double totalValorTanque(double valorCombustivel){
        return capacidadeTanque*valorCombustivel;
    }
}