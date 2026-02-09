import java.util.Scanner;

public class Whileegressivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor maximo da contagem:");
        int N = sc.nextInt();
        int i = N;
        do { // faça,realiza
            System.out.println(i);// ação a ser executado
            i--;// incremento da variavel do controle
        } while (i >= 0);// condição do loop
        sc.close();
    }
}