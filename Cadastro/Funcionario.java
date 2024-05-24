package Cadastro;

public class Funcionario {
    
    private double salBase;
    public String nome;    

    // Construtor
    public Funcionario(String nome, double salario) {
        this.salBase = salario;
        this.nome = nome;
    }

    public double getSalarioBase(){
        return this.salBase;
    }

    public String getNome(){
        return this.nome;
    }

    
}
