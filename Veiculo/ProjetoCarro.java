public class ProjetoCarro {

    public static void main(String[] args){
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Toyota", "Corola", 4);
        veiculos[1] = new Moto("Honda", "CBR 1000RR", true);
        veiculos[2] = new Carro("Ford", "Fusion", 4);

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInfo();
            System.out.println(); 
        }
    }
} 
