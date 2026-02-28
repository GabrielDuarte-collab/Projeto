import java.util.Scanner;
public class ContadorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Impressão " + i);
        }
        sc.close();
    }
}