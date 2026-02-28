import java.util.Scanner;

public class Objetivo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero N: ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma = soma + i;
        }
        System.out.printf("A soma e igual a %d\n", soma);

        sc.close();
    }
}