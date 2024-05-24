package exercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner para entrada pelo teclado

        System.out.println("Digite o valor do salario minimo:");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Digite o salario do funcionario:");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalarios = salarioFuncionario / salarioMinimo;
        System.out.println("O funcionario ganha " + quantidadeSalarios + " salário minimo(s)");

        scanner.close(); // Fechando o Scanner após a sua utilização
    }
}
