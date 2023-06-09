package exercicios;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, i;
        for( i = 0; i <=500; i++) {
            if (i % 2 == 0) {

            } else {
                soma += i;
                System.out.println(soma);
            }
        }
    }
}


