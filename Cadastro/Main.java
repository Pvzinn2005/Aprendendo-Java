package Cadastro;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pvzinn", 15000.00, 250);
        gerente.calculaSalario();
        gerente.exibirInfo();

        Gerente subGerente = new Gerente("Tom", 200000.00, 5000);
        subGerente.calculaSalario();
        subGerente.exibirInfo();

        Vendedor vendedor = new Vendedor("Thami", 1000.00, 0.4);
        vendedor.calculaSalario();
        vendedor.exibirInfo();
    }
}
