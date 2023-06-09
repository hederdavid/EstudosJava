package exercicios;
import java.util.Scanner;
public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte num;

        System.out.print("Insira um número: ");
        num = scanner.nextByte();

        for (int i = 0; i <=10 ;i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
