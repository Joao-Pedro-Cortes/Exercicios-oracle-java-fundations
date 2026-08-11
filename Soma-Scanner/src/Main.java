import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = input.nextInt();

        System.out.print("Resultado: " +(numero1 + numero2) );
    }
}