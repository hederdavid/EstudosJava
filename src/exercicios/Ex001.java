package exercicios;
import java.util.Scanner;
public class Ex001 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;
        System.out.print("Insira um número: ");
        num1 = sc.nextInt();
        System.out.print("Insira outro número: ");
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.print("A soma entre o número " + num1 + " e o número " + num2 + " é: " + soma);
    }
}
