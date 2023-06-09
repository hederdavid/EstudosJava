package exercicios;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario;

        System.out.println("Insira o seu salário: ");
        salario = scanner.nextFloat();

        if (salario < 34712) {
            System.out.println("Você deve pagar 9.70% de imposto, que equivale a " + (salario * 9.7) / 100 + " reais");
        } else if (salario > 34712 && salario < 68507) {
            System.out.println("Você deve pagar 37.35% de imposto, que equivale a " + (salario * 37.35) / 100 + " reais");
        } else {
            System.out.println("Você deve pagar 49.50% de imposto, que equivale a " + (salario * 49.5) / 100 + " reais");
        }
    }
}
