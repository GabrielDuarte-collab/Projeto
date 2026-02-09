import java.util.Scanner;

public class Contagem_regressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Contagem Regressiva ===");
        System.out.println();

        System.out.print("insira um o numero N: ");
        int N = sc.nextInt();

        for (int number = N; number >= 0; number--) {
            System.out.println("Execução n°" + number);
        }
        sc.close();
    }
}
