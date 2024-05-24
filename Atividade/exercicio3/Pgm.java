package exercicio3;

import java.util.Scanner;

public class Pgm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // valores a digitar
        System.out.println("Digite a quantidade de homens na turma:");
        int homens = scanner.nextInt();
        System.out.println("Digite a quantidade de mulheres na turma:");
        
        int mulheres = scanner.nextInt();
        int total = homens + mulheres;

        
        // calculo de porcentagem
        double percentualHomens = ((double) homens / total) * 100;
        double percentualMulheres = ((double) mulheres / total) * 100;
        System.out.printf("Percentual de homens: %.2f\n", percentualHomens);
        System.out.printf("Percentual de mulheres: %.2f\n", percentualMulheres);
        
    }
}
