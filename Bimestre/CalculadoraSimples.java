package Bimestre;
// Importando a classe JOptionPane do pacote javax.swing
import javax.swing.JOptionPane;

// Classe CalculadoraSimples

public class CalculadoraSimples {
    public static void main(String[] args) {
        // Solicitando ao usuário que insira o primeiro número
        String primeiroNumero = JOptionPane.showInputDialog("Digite o primeiro número:");
        // Solicitando ao usuário que insira o segundo número
        String segundoNumero = JOptionPane.showInputDialog("Digite o segundo número:");

        // Definindo as operações possíveis
        String[] operacoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        // Solicitando ao usuário que escolha uma operação
        String operacaoSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha a operação", "Operação", JOptionPane.QUESTION_MESSAGE, null, operacoes, operacoes[0]);

        // Convertendo os números inseridos pelo usuário para double
        double num1 = Double.parseDouble(primeiroNumero);
        double num2 = Double.parseDouble(segundoNumero);
        double resultado = 0;

        // Realizando a operação selecionada
        switch (operacaoSelecionada) {
            case "Adição":
                resultado = num1 + num2;  // Adição
                break;
            case "Subtração":
                resultado = num1 - num2;  // Subtração
                break;
            case "Multiplicação":
                resultado = num1 * num2;  // Multiplicação
                break;
            case "Divisão":
                // Verificando se o divisor é zero antes de realizar a divisão
                if (num2 != 0) {
                    resultado = num1 / num2;  // Divisão
                } else {
                    // Exibindo uma mensagem de erro se o divisor for zero
                    JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
                    // Terminando o programa se o divisor for zero
                    System.exit(0);
                }
                break;
        }

        // Exibindo o resultado em uma caixa de diálogo JOptionPane
        JOptionPane.showMessageDialog(null, "O resultado da " + operacaoSelecionada + " é: " + resultado);
    }
}

