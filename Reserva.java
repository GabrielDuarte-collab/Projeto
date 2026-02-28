import java.util.Scanner;

public class Reserva {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Calculadora ===");
        System.out.println();

        System.out.print("Insira o primeiro numero da conta: ");
        int num1 = sc.nextInt();

        System.out.print("Insira o segundo numero da conta: ");
        int num2 = sc.nextInt();
        
        int Soma = num1 + num2;
        System.out.printf("Soma: %d\n" ,Soma);

        int Sub = num1 - num2;
        System.out.printf("Subtração: %d\n" ,Sub);

        int Mult = num1 * num2;
        System.out.printf("Multiplição: %d\n" ,Mult);



        sc.close();
        
     }
}