import java.util.Scanner;

/*Definir um algoritmo que leia 2 vetores com 6 elementos cada. O algoritmo
deve gerar uma matriz C de 6x2 onde a 1º coluna são valores de A e a 2º
coluna valores de B*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float[] vetorA = new float[6];
        float[] vetorB = new float[6];
        float[][] C  = new float [6][2];
        int i,j;
        //Leitura de dados(vetores)
        System.out.printf("\nVetor A\n");
        for(i=0;i<6;i++){
            System.out.printf("\nFale o numero na posição [%d] do vetor A:",i+1);
            vetorA[i] = input.nextFloat();
        }
        System.out.printf("\n====================================================\n");
        System.out.printf("\nVetor B\n");
        for(i=0;i<6;i++){
            System.out.printf("\nFale o numero na posição [%d] do vetor B:",i+1);
            vetorB[i] = input.nextFloat();
        }
        for(i=0;i<6;i++){ //Linhas
            for(j=0;j<2;j++){ //Colunas
                C[i][j]=vetorA[i];
                if(j==1){
                    C[i][j]=vetorB[i];
                }
            }
        }
        for(i=0;i<6;i++){
            for(j=0;j<2;j++){
                System.out.printf("%6.2f",C[i][j]);
            }
            System.out.printf("\n");
        }
        /*Explicação do formato:
        %6.2f
        6: largura mínima do campo (inclui casas decimais, ponto e dígitos à esquerda)
        .2: duas casas decimais
        f: tipo float/double*/
    }
}

