package exercicios;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dia;
        System.out.print("Que dia é hoje?: ");
        dia = scanner.next();
        switch (dia.toUpperCase()) {
            case "DOMINGO":
                System.out.println("Hoje não é dia útil.");
                break;

            case "SEGUNDA":
                System.out.println("Hoje é dia útil.");
                break;

            case "TERÇA":
                System.out.println("Hoje é dia útil.");
                break;

            case "QUARTA":
                System.out.println("Hoje é dia útil.");
                break;

            case "QUINTA":
                System.out.println("Hoje é dia útil.");
                break;

            case "SEXTA":
                System.out.println("Hoje é dia útil.");
                break;

            case "SABADO":
                System.out.println("Hoje não é dia útil.");
                break;

            default:
                System.out.println("Entrada inválida.");
                break;
        }
    }
}
