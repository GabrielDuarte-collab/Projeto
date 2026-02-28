import java.util.Scanner;

public class CD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificado da cor do CD!");
        System.out.println();
        while (true) {
            System.out.println("Insira a cor do CD: ");
            String CD = sc.nextLine();

            if (CD.equals("azul")) {
                System.out.println("Este CD custa R$10,00!");
                break;
            } else {
            }
            if (CD.equals("vermelho")) {
                System.out.println("Este CD custa R$20,00!");
                break;
            } else {
            }
            if (CD.equals("amarelo")) {
                System.out.println("Este CD custa R$30,00!");
                break;
            } else {
                System.out.println();
                System.out.println("Cor invalida!");
            }

        }
        sc.close();
        }
}



