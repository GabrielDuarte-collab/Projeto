import java.util.Scanner;

public class AprendFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float N = 0;
        do {
            System.out.println("Insira um numero qualquer: ");
            N = sc.nextFloat();

            if (N > 0) {
                System.out.printf("O numero N: %f é positivo!\n", N);
            } else if (N < 0) {
                System.out.printf("O numero N: %f é negativo!\n", N);
            } else {
                System.out.println("O numero e zero!");
            }
        } while (N != 0);
        sc.close();
    }
}