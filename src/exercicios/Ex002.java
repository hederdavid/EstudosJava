package exercicios;
import java.util.Scanner;
public class Ex002 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double grausCelsius, grausFahrenheit;

        System.out.print("Insira uma temperatura em graus Celsius que será convertida em graus Fahrenheit: ");
        grausCelsius = sc.nextDouble();
        grausFahrenheit = (9 * grausCelsius + 160) / 5;
        System.out.print("A temperatura Cº" + grausCelsius + " convertido em graus Fahrenheit é: Fº" + grausFahrenheit);


    }
}
