import java.util.*;
import java.lang.Math;

public class DevDojo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int resto, numeroDecimal, i, termo, bit, subir;

        i = 0;
        termo = 0;
        bit = 0;
        subir = 1;
        String binario, binarioInvertido, resultado;

        binario = "";
        binarioInvertido = "1";
        resultado = "";
        System.out.println("Programa criado com a finalidade de converter um número decimal negativo para um número binário positivo.");
        System.out.println("Insira o número decimal que irá ser convertido para um número binário: ");
        numeroDecimal = input.nextInt();
        if (numeroDecimal < 0) {
            numeroDecimal = (int) (numeroDecimal * -1);
            while (numeroDecimal > 0) {
                resto = numeroDecimal % 2;
                binario = String.valueOf(resto) + binario;
                numeroDecimal = (int) ((double) numeroDecimal / 2);
            }
            while (i < binario.length()) {
                if (binario.charAt(i) == "0") {
                    binarioInvertido = binarioInvertido + "1";
                    i = i + 1;
                } else {
                    binarioInvertido = binarioInvertido + "0";
                    i = i + 1;
                }
            }
            i = binarioInvertido.length();
            for (i = i - 1; i >= 0; i--) {
                bit = Integer.parseInt(binarioInvertido.charAt(i));
                termo = subir + bit;
                if (termo > 1) {
                    if (termo == 2) {
                        resultado = "0" + resultado;
                        subir = 1;
                    } else {
                        resultado = "1" + resultado;
                        subir = 0;
                    }
                } else {
                    resultado = Integer.toString(termo) + resultado;
                    subir = 0;
                }
            }
            System.out.println("O número decimal inserido, convertido para um número na base binária é: " + resultado);
        } else {
            while (numeroDecimal > 0) {
                resto = numeroDecimal % 2;
                binario = String.valueOf(resto) + binario;
                numeroDecimal = (int) ((double) numeroDecimal / 2);
            }
            System.out.println("O número decimal inserido, convertido para um número na base binária é: " + binario);
        }
    }
}
