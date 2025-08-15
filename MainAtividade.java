import java.util.Scanner;

public class MainAtividade {
    public static void main(String[] args) {
        Scanner dg = new Scanner(System.in);

        System.out.println("Nome do aluno:");
        String nome = dg.nextLine();

        System.out.println("Digite o nome da faculdade:");
        String nomeFacul = dg.nextLine();

        int matri = 0;
        int mensal = 0;

        switch(nomeFacul.toLowerCase()) {
            case "engenharia de sis.":
                matri = 350;
                mensal = 650;
                break;

            case "direito":
                matri = 350;
                mensal = 550;
                break;

            case "engenharia da nav.":
                matri = 310;
                mensal = 500;
                break;

            case "eng. pesca":
                matri = 210;
                mensal = 440;
                break;

            case "contabilidade":
                matri = 400;
                mensal = 500;
                break;

            case "adm":
                matri = 760;
                mensal = 620;
                break;

            default:
                System.out.println("Faculdade invalida.");
                return;
        }

        int custoTotal = matri + (mensal * 6);

        System.out.println("aluno: " + nome);
        System.out.println("curso: " + nomeFacul);
        System.out.println("matrícula: R$" + matri);
        System.out.println("mensalidade: R$" + mensal);
        System.out.println("custo total semestral: R$" + custoTotal);
    }
}
