import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Tabuada de Cria ===");
        System.out.println();

        System.out.println("Insira um numero: ");
        int N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + "*" + i + "=" + (N * i));
        }
        for (int i = 1; i <= 10; i++) {
            int mult = N * i;
            System.out.printf("%d * %d = %d\n", N, i, mult);
        }

        sc.close();

    }
}