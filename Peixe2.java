import java.util.Scanner;

public class Peixe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Verificado de Peso do peixe ===");
        System.out.println();
        while (true) {
            System.out.print("Insira o peso do peixe: ");
            int P = sc.nextInt();
            if (P == 0) {
                System.out.println("Sistema esta encerrando.");
                break;
            } else if (P > 50) {
                int E = P - 50;
                int M = E + 4;
                System.out.printf("O valor da multa e R$ %d\n", M);
                System.out.printf("O excesso e %d\n", E);
            } else {
                System.out.println("O valor da multa e do excesso e 0!");
            }

        }
     sc.close();
    }

}