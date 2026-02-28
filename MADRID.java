import java.util.Scanner;

public class MADRID {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos tem na sala?");
        int quantidadeAlunos = sc.nextInt();
        sc.nextLine();

        String nomes[] = new String[quantidadeAlunos];
        int idades[] = new int[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Nome do aluno: ");
            nomes[i] = sc.nextLine();

            System.out.print("Idade do aluno: ");
            idades[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println(idades[i] + " Anos - " + nomes[i]);
        }

        sc.close();
    }
}