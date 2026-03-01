import java.util.Scanner;

/*Faça um algoritmo que monte uma matriz com as dimensões do usuário e crie
um vetor de duas posições onde a soma dos pares deve ser inserida na
posição zero do vetor e a soma dos impares na posição um do vetor.*/

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] vetor= new int [2];
        int i,j,coluna,linha,soma_pares=0,soma_impares=0;
        System.out.println("Fale o tamanho da linha[i]:");
        linha = input.nextInt();
        System.out.println("Fale o tamanho da coluna[j]:");
        coluna = input.nextInt();
        int[][] matriz =new int [linha][coluna];
        //zera toda a matriz
        for (i= 0;i<linha;i++) {
            for (j=0;j<coluna;j++){
                matriz[i][j] = 0;
            }
        }
        for(i=0;i<linha;i++){
            for(j=0;j<coluna;j++){
                System.out.printf("Fale o numero na posição [%d][%d]:",i,j);
                matriz[i][j]= input.nextInt();
                if(matriz[i][j]%2==0){
                    soma_pares += matriz[i][j];
                }
                else{
                    soma_impares += matriz[i][j];
                }
            }
        }
        System.out.println("===================================================================");
        System.out.println("Sua matriz:");
        //printar  a matriz
        for (i= 0;i<linha;i++) {
            for (j=0;j<coluna;j++){
               System.out.printf("%4d",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("===================================================================");
        vetor[0]=soma_pares;
        vetor[1]=soma_impares;
        System.out.printf("\nA soma dos pares:%d",vetor[0]);
        System.out.printf("\nA soma dos impares:%d",vetor[1]);
    }
}
