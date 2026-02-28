import java.util.Scanner;

public class verdade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Verificador de Maior idade: ");
    System.out.println();

    System.out.println("Insira sua idade: ");
    int idade = sc.nextInt();

    if (idade >= 18) {
      System.out.println("Voce e maior de idade!");
    } else {
      System.out.println("Voce e menor de idade!");
    }

    sc.close();

  }
}
