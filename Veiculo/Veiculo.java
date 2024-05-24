public class Veiculo {

    private String marca;
    private String modelo;

    public Veiculo(){
        this.marca = "Desconhecida";
        this.modelo = "Desconhecido";
    }

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
