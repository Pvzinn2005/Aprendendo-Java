package Bimestre;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        // Solicitando ao usuário que insira a temperatura
        String temperatura = JOptionPane.showInputDialog("Digite a temperatura:");

        // Definindo as unidades de temperatura possíveis
        String[] unidades = {"Celsius", "Fahrenheit"};
        // Solicitando ao usuário que escolha a unidade de temperatura
        String unidadeSelecionada = (String) JOptionPane.showInputDialog(null, "Escolha a unidade de temperatura", "Unidade", JOptionPane.QUESTION_MESSAGE, null, unidades, unidades[0]);

        // Convertendo a temperatura inserida pelo usuário para double
        double temp = Double.parseDouble(temperatura);
        double resultado = 0;

        // Realizando a conversão de temperatura
        switch (unidadeSelecionada) {
            case "Celsius":
                resultado = temp * 9/5 + 32;  // Convertendo de Celsius para Fahrenheit
                JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: " + resultado);
                break;
            case "Fahrenheit":
                resultado = (temp - 32) * 5/9;  // Convertendo de Fahrenheit para Celsius
                JOptionPane.showMessageDialog(null, "A temperatura em Celsius é: " + resultado);
                break;
        }
    }
}
