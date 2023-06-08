package exercicios;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media, exameFinal = 0;
        System.out.print("Insira a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Insira a quarta nota: ");
        nota4 = sc.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7) {
            System.out.print("Parabéns! Você foi aprovado com a média " +
                    media + " sem prova final!");
        } else {
            System.out.print("Insira a nota do exame final: ");
            exameFinal = sc.nextDouble();

            if (media + exameFinal / 2 >= 5) {
                System.out.print("Parabéns! Você foi aprovado" +
                        "com a média " + media + " pelo exame final!");
            } else {
                System.out.print("Infelizmente sua média foi " + media + " e você não atingiu a média necessária" +
                        "para aprovação.");
            }
        }
    }
}
