import java.util.Scanner;

public class Verificador2 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         while (true) {
           System.out.println("=== VERIFICADOR DE IDADE ===");
           System.out.println();

           System.out.println("insida sua idade: ");
           int A = sc.nextInt();
           if (A == 0) {
                System.out.println("O programa foi encerrado.");
                break;
           } else {
             } if (A > 0) {
                if (A >= 18) {
                  if (A >= 60) {
                    System.out.println("Você é um idoso.");
                  }else {
                      System.out.println("Você é maior de idade.");
                   }else {
                     System.out.println("Voce e uma criança.");
                   }else {
                     System.out.println("Entrada invalida!Digite novamente.");
                        
 
                     continue;
      }
     }
     sc.close();
    }
  }
 }
}