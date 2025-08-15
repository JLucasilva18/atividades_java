import java.util.Scanner;
public class MainAtividade3 {
    public static void main(String[] args) {
        Scanner dg = new Scanner(System.in);
        System.out.print("digite um valor para N: ");
        int N = dg.nextInt();

        boolean encontrou = false;

        for (int i = 1; i <= N / 2; i++) {
            int soma = 0;
            int j = i;
            while (soma < N) {
                soma += j;
                j++;
            }
            if (soma == N) {
                encontrou = true;
                break;
            }
        }

        if (encontrou) {
            System.out.println("ponte Aberta");
        } else {
            System.out.println("ponte Fechada");
        }
    }
}
