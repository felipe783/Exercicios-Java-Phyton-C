import java.util.Scanner;

/*Faça um programa que monte uma matriz 2x4 com números inteiros, calcule e
mostre. A quantidade de elementos entre 10 e 15 em cada linha. A média dos
elementos pares da matriz.*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[2][4];
        int[] cont = new int[2]; // Para cada linha, quantos entre 10 e 15
        int soma = 0, aux2 = 0;

        System.out.println("Fale sua matriz 2x4:");

        // Entrada de dados na matriz
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Fale o numero na posição [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
                // Contagem entre 10 e 15 por linha
                if (matriz[i][j] >= 10 && matriz[i][j] <= 15) {
                    cont[i]++;
                }
                // Soma dos pares
                if (matriz[i][j] % 2 == 0) {
                    soma += matriz[i][j];
                    aux2++;
                }
            }
        }

        System.out.println("==============================================");
        System.out.println("Sua matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("==============================================");

        for (int i = 0; i < 2; i++) {
            System.out.printf("A quantidade de números entre 10 e 15 na linha [%d] é: %d\n", i, cont[i]);
        }

        if (aux2 > 0) {
            float media = (float) soma / aux2;
            System.out.printf("A média dos números pares na matriz é: %.2f\n", media);
        } else {
            System.out.println("Não há números pares na matriz.");
        }
    }
}
