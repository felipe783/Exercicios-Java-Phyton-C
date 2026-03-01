import java.util.Scanner;

/*Faça um algoritmo que monte uma matriz com as dimensões do usuário,
calcule e mostre a soma dos elementos da diagonal secundária.*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j,linha,coluna;
        float soma=0;
        System.out.println("A matriz obrigatoriamente tem q sem quadrada [linha]=[coluna]");
        System.out.println("Fale o tamanho da linha:");
        linha = input.nextInt();
        System.out.println("Fale o tamanho da coluna:");
        coluna = input.nextInt();
        float [][] matriz=new float [linha][coluna];
        //Entrada de dados da matriz
        for(i=0;i<linha;i++){ //LINHA
            for(j=0;j<coluna;j++){ //COLUNA
                System.out.printf("\nFale o numero na posição [%d][%d]:",i,j);
                matriz[i][j]=input.nextFloat();
                if(i+j==linha-1){
                    soma +=matriz[i][j];
                }
            }
        }
        //Bunito
        System.out.println("======================================================================");
        System.out.println("Sua matriz");
        for(i=0;i<linha;i++){
            for(j=0;j<coluna;j++){
                System.out.printf("%6.2f",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("======================================================================");
        System.out.printf("A soma da diagonal secundaria é:%.2f",soma);
    }

}

