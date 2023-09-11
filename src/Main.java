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

        /* 2- Menor e Maior Valor -> Escreva um programa que recebe um array de números inteiros do usuário e
        determina o menor e o maior número dentro desse array. Não utilize funções prontas para essa finalidade. */
        System.out.println("\n2- Maior e Menor Valor");

        int[] arrNumeros = new int[6];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Informe 6 números:");
        for (int i = 0; i < arrNumeros.length; i++) {
            arrNumeros[i] = sc.nextInt();
            if (arrNumeros[i] > maior) maior = arrNumeros[i];
            if (arrNumeros[i] < menor) menor = arrNumeros[i];
        }

        System.out.println("********************");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        /* 3- Nome em Posição -> Crie um programa onde o usuário informa 5 nomes. Após inserir todos os nomes,
        o programa deve pedir ao usuário um índice (entre 0 e 4). O programa deve então mostrar o nome que está
        na posição correspondente a esse índice. */
        System.out.println("\n3- Nome em Posição");

        String[] nomes = new String[5];
        sc.nextLine();

        System.out.println("Informe 5 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }

        System.out.println("Informe um valor entre 0 e 4: ");
        int indice = sc.nextInt();
        System.out.println("********************");
        if (indice >= 0 && indice <= 4) System.out.println(nomes[indice]);
        else System.out.println("Valor inválido!");

        /* 4- Cópia Invertida -> Escreva um programa que receba um array de 5 strings do usuário. Em seguida,
        copie esse array para outro, mas de forma invertida (o último elemento se torna o primeiro, o penúltimo
        se torna o segundo, e assim por diante). Mostra o array invertido na tela. */
        System.out.println("\n4- Cópia Invertida");

        System.out.println("Informe 5 strings:");
        String[] arrStrings = new String[5];
        String[] arrInvertido = new String[5];
        sc.nextLine();

        for (int i = 0; i < arrStrings.length; i++) {
            arrStrings[i] = sc.nextLine();
        }

        System.out.println("********************");
        for (int i = 0; i < arrStrings.length; i++) {
            arrInvertido[i] = arrStrings[(arrStrings.length - 1) - i];
            System.out.println(arrInvertido[i]);
        }

        /* 5- Contagem de Caracteres -> Peça ao usuário para inserir uma série de palavras (strings).
        Armazene essas palavras em um array e, em seguida, calcule e mostre quantos caracteres no total
        foram inseridos, somando todos os caracteres de todas as palavras. */
        System.out.println("\n5- Contagem de Caracteres");

        String[] arrPalavras = new String[4];
        int totalCaracteres = 0;

        System.out.println("Informe 4 palavras:");
        for (int i = 0; i < arrPalavras.length; i++) {
            arrPalavras[i] = sc.nextLine();
            totalCaracteres += arrPalavras[i].length();
        }

        System.out.println("********************");
        System.out.printf("Foram digitados %d caracteres", totalCaracteres);

//        System.out.println("\n6- Identificando Números Duplicados");
    }
}
