package Excecoes;

public class Financiamento {
    public double valorTotal;
    public double entrada;
    public Integer parcelas;

    public Financiamento(Double valorTotal, double entrada, Integer parcelas) {

        if (entrada < valorTotal * 0.2) {
            throw new RuntimeException("Entrada deve ser pelo menos 20% do valor");
        }
        else if(parcelas < 6){
            throw new RuntimeException("O número de parcelas deve ser no mínimo 6");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }
}
