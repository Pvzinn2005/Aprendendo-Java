package exrcicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, insira um número válido.");
        } finally {
            scanner.close();
        }
    }
}
