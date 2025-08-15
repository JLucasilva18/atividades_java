import java.util.Scanner;

public class MainAtividade2 {
    public static void main(String[] arg){
        Scanner dg = new Scanner(System.in);
        double[] tempe = new double[7];
        double soma = 0, maior = Double.MIN_VALUE, menor = Double.MAX_VALUE;

        for (int i = 0; i < 7; i++) {
            System.out.print("tmperatura do dia " + (i + 1) + ": ");
            tempe[i] = dg.nextDouble();
            soma += tempe[i];

            if (tempe[i] > maior) {
                maior = tempe[i];
            }

            if (tempe[i] < menor) {
                menor = tempe[i];
            }
        }

        double media = soma / 7;

        System.out.println("\nmédia da semana: " + media);
        System.out.println("maior temperatura: " + maior);
        System.out.println("menor temperatura: " + menor);
    }
}

