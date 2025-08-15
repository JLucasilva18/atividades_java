import java.util.Scanner;

public class AtividadeSem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 3, colunas = 6;
        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == 0 || i == linhas - 1 || j == 0 || j == colunas - 1) {
                    System.out.print(matriz[i][j] + "\t");
                } else {
                    System.out.print("-\t");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
