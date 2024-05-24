public class ContaBancaria {
    // Atributos privados encapsulados
    private double saldo;

    // Construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 100) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }
}
