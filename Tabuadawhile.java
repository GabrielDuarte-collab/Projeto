import java.util.Scanner;

public class Tabuadawhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Tabuada com while ===");
        System.out.println();

        System.out.println("Insira um valor: ");
        int N = sc.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.printf("%d * %d = %d\n", N,i,N*i);
            i++;
        }
        
        sc.close();
    }
}