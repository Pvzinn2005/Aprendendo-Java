package Cadastro;

public class Gerente extends Funcionario{

    private double novoSalario;
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
        
    }

    public void calculaSalario(){
        this.novoSalario = super.getSalarioBase() + this.bonus;
    }

    public double getNovoSalario(){
        return this.novoSalario;
    }

    // Método para exibir informações do veículo
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + this.novoSalario);
    }

}

