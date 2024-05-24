public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(1000.0);

        // Acessando e manipulando a conta através dos métodos públicos
        minhaConta.depositar(101);
        minhaConta.sacar(200.0);

        // Exibindo o saldo atual da conta
        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
    }
}
