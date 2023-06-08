package exercicios;

import java.util.Scanner;
public class Ex005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Verifica a ordem dos números e realiza a troca, se necessário
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Exibe os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);
    }
}
