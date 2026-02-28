import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        // coleta
        System.out.println("Preencha a matriz 3x3:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Digite o valor para posição [" + linha + "][" + coluna + "] ");
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        // apresentacao
        System.out.println("\nMatriz preenchida:");
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + "   ");

            }

            System.out.println();
        }

        sc.close();
    }
}



