public class Moto extends Veiculo {
    private boolean temPartidaEletrica;

    public Moto() {
        super();
        this.temPartidaEletrica = false;
    }

    public Moto(String marca, String modelo, boolean temPartidaEletrica) {
        super(marca, modelo);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Partida Eletrica :" + (temPartidaEletrica ? "Sim" : "Não"));
    }

    
}