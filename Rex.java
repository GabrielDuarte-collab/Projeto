import java.util.Scanner;

public class Rex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva a frase a ser repetida: ");
        String Frase = sc.nextLine();
        int cont = 1;

        while (cont <= 1000) {

            System.out.println(Frase);

            cont = cont + 1;
        }
        System.out.println("Acabou!");
        
        sc.close();
    }
}