import java.util.Scanner;

public class swicht {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        System.out.print("Insira um numero qualquer: ");
        N = sc.nextInt();
        if (N > 0) {
            N = 1;
        } else if (N < 0) {
            N = 2;
        } else {
            System.out.println("O numero é zero!");
        }
        switch (N) {
            case 1:
                System.out.printf("O numero N: %d é positivo!\n", N);
                break;
            case 2:
                System.out.printf("O numero N: %d é negativo!\n", N);
                break;
            default:
                System.out.println("O numero é zero!");
        }
        sc.close();
    }
}