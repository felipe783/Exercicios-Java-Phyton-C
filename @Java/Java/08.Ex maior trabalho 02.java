import java.util.Scanner;

/*Escreva um algoritmo que leia uma matriz 3x4 e calcule a média dos valores
por linha. Essa média deve ser armazenada em um vetor de 3 linhas.*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float [][] matrizNotas = new float[3][4]; //Aqui todos os valores começam em 0 por padrão
        int notas;
        float [] media=new float[3];
        float soma;
        int i,j;
        System.out.print("\nQuantas notas por aluno:");
        notas = input.nextInt();
        input.nextLine();
        float [] vetor = new float[notas];
        //Matriz das notas
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.printf("\nFale a nota do aluno na posição [%d] [%d]:",i,j);
                matrizNotas[i][j] = input.nextFloat();
            }
        }
        //Printar a matriz
        System.out.println("================================================================");
        System.out.println("Sua matriz");
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                System.out.printf("%6.2f",matrizNotas[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==================================================================");
        //Criar o vetor soma e media;
        soma=0;
        for(i=0;i<3;i++){ //Linhas
            for(j=0;j<4;j++){ //Colunas
                soma += matrizNotas[i][j];
            }
            media[i]=soma/notas;
            soma=0;
        }
        //Printar o vetor media
        System.out.println("As medias:");
        for(i=0;i<3;i++){
            System.out.printf("\n %6.2f",media[i]);
        }
    }
}
