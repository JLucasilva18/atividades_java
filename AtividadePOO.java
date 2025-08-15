import java.util.ArrayList;
import java.util.Scanner;

class Disciplina {
    private String nome;
    private String codigo;
    private int duracaoSemanas;
    private int numeroModulo;

    public Disciplina(String nome, String codigo, int duracaoSemanas, int numeroModulo) {
        this.nome = nome;
        this.codigo = codigo;
        this.duracaoSemanas = duracaoSemanas;
        this.numeroModulo = numeroModulo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (" + codigo + ") - " + duracaoSemanas + " semanas - Módulo " + numeroModulo;
    }
}

class Estudante {
    private String nome;
    private int idade;
    private String id;
    private ArrayList<Disciplina> disciplinas;

    public Estudante(String nome, int idade, String id) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public ArrayList<Disciplina> getDisciplinas() { return disciplinas; }

    public void adicionarDisciplina(Disciplina d) {
        disciplinas.add(d);
        System.out.println("Disciplina adicionada: " + d.getNome());
    }

    public void removerDisciplina(String nomeDisciplina) {
        boolean removida = disciplinas.removeIf(d -> d.getNome().equalsIgnoreCase(nomeDisciplina));
        if (removida) {
            System.out.println("disciplina removida: " + nomeDisciplina);
        } else {
            System.out.println("ess disciplina não existe : " + nomeDisciplina);
        }
    }

    public void imprimirDisciplinas() {
        System.out.println("D" + "disciplinas de " + nome + ":");
        if (disciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
        } else {
            for (Disciplina d : disciplinas) {
                System.out.println("- " + d);
            }
        }
    }
}
public class AtividadePOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a carteira de identidade: ");
        String id = sc.nextLine();

        Estudante estudante = new Estudante(nome, idade, id);


        System.out.print("Quantas disciplinas deseja adicionar? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.println("\nCadastro da disciplina " + (i + 1) + ":");
            System.out.print("Nome da disciplina: ");
            String nomeDisc = sc.nextLine();

            System.out.print("Código da disciplina: ");
            String codigo = sc.nextLine();

            System.out.print("Duração (em semanas): ");
            int duracao = sc.nextInt();

            System.out.print("Número do módulo: ");
            int modulo = sc.nextInt();
            sc.nextLine();

            Disciplina d = new Disciplina(nomeDisc, codigo, duracao, modulo);
            estudante.adicionarDisciplina(d);
        }
        System.out.println("\nLista inicial de disciplinas:");
        estudante.imprimirDisciplinas();

        System.out.print("\nDigite o nome da disciplina que deseja remover: ");
        String disciplinaRemover = sc.nextLine();
        estudante.removerDisciplina(disciplinaRemover);

        System.out.println("\nLista atualizada de disciplinas:");
        estudante.imprimirDisciplinas();

        sc.close();
    }
}