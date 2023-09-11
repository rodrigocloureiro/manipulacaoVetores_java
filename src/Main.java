import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 1- Inversão de Array -> Escreva um programa que recebe um array de 10 números inteiros do usuário e
        os mostra na ordem inversa. */
        System.out.println("1- Inversão de Array");
        int[] numeros = new int[10];

        System.out.println("Informe 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("********************");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
