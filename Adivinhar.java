import java.util.Scanner;
import java.util.Random;

public class Adivinhar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int aleatorio = gerador.nextInt(100) + 1;

        System.out.println("---- JOGO DA ADIVINHAÇÃO ----");

        System.out.println("Obs,Você tem 1000 tentativas validas!");
        System.out.println();
        int ntentativas = 1000;

        while (true) {
            System.out.print("Adivinhe o valor que esta entre 1 e 100: ");
            int N = sc.nextInt();
            if (N == aleatorio) {
            System.out.println("Parabens,voce e o cara!");
            break;
            } else {
            ntentativas = ntentativas - 1;
            System.out.printf("Voce tem ainda %d\n", ntentativas);
            }
            if (ntentativas < 1000) {
            System.out.println("Voce errou, tente novamente!");
            System.out.println(aleatorio);
            continue;
            } else {
            System.out.printf("Acabou as tentativas, o numero correto e: %d\n", aleatorio);

            }
        }
        sc.close();
    }
}
