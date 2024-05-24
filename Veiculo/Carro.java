class Carro extends Veiculo{
    private int portas;

    public Carro(){
        super();
        this.portas = 4; 
    }

    public Carro(String marca, String modelo, int portas){
        super(marca, modelo);
        this.portas = portas;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Portas: " + portas);
    }
}