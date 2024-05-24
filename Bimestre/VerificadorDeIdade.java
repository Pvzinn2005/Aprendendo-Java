package Bimestre;

import javax.swing.JOptionPane;

public class VerificadorDeIdade {
    public static void main(String[] args) {
        // Solicitando ao usuário que insira a idade
        String idade = JOptionPane.showInputDialog("Digite a sua idade:");

        // Convertendo a idade inserida pelo usuário para int
        int idadeNum = Integer.parseInt(idade);

        // Verificando se o usuário é maior de idade ou menor de idade
        if (idadeNum >= 18) {
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é menor de idade.");
        }
    }
}
