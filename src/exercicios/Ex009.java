package exercicios;
import java.util.Scanner;
public class Ex009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String confirmacao;
        int num = 0;

        System.out.print("Este programa faz a soma dos 100 primeiros números inteiros positivos, deseja executar?" +
                " S / N: ");
        confirmacao = scanner.next();

        if(confirmacao.toUpperCase().equals("S")) {
            for(int i = 0; i <=100; i++) {
                num = num + i;
                System.out.println("A soma dos 100 primeiros números inteiros positivos é: " + num);
            }
        } else {
            System.out.println("Beleza então, até breve ^^");
        }
    }



}
