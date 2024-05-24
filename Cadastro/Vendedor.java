package Cadastro;

public class Vendedor extends Funcionario {
    private double comissao;
    private double novoSalario;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return this.comissao;
    }

    public void calculaSalario() {
        this.novoSalario = (super.getSalarioBase() * this.comissao) + super.getSalarioBase();
    }

    // Método para exibir informações do veículo
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + this.novoSalario);
    }
}
