import java.util.Scanner;

public class ContadorFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Verificador de Idade com Limitador! ---");
        System.out.println();

        System.out.print("Quantas vezes você quer verificar: ");
        int quantidade = sc.nextInt();

        for (int controle = 0; controle < quantidade; controle++) {
            System.out.print("Insira a idade da " + (controle + 1) + "° pessoa: ");
            int idade = sc.nextInt();

            if (idade >= 60) {
                System.out.println("Essa pessoa é Idosa!");
            } else if (idade >= 18) {
                System.out.println("Essa pessoa é maior de idade!");
            } else if (idade < 0) {
                System.out.println("Esse valor é inválido!");
            } else {
                System.out.println("Essa pessoa é menor de idade!");
            }
        }
        sc.close();
    }
}