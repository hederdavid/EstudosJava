package exercicios;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempo, velocidade, distancia, litrosUsados;
        System.out.print("Insira o tempo gasto na viagem (em horas): ");
        tempo = sc.nextDouble();
        System.out.print("Insira a velocidade média da viagem em km/h: ");
        velocidade = sc.nextDouble();
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;
        System.out.println("A velocidade média da viagem foi " + velocidade + " km/h, o tempo gasto foi " + tempo + " horas, " +
                "a distância percorrida foi " + distancia + " km e a quantidade de litros usados foi " + litrosUsados);
    }
}
