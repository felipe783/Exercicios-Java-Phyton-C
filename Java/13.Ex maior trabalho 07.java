import java.util.Scanner;

/*Faça um algoritmo que monte uma matriz com as dimensões do usuário e crie
um vetor onde cada posição armazena a soma dos elementos da coluna
correspondente.*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j,coluna,linha;
        System.out.println("Fale o tamanho do linha[i]:");
        linha=input.nextInt();
        System.out.println("Fale o tamanho do coluna[j]:");
        coluna=input.nextInt();
        float [][] matriz=new float [linha][coluna];
        float [] soma=new float [coluna];
        //Matriz
        for(i=0;i<linha;i++){
            for(j=0;j<coluna;j++){
                System.out.printf("Fale o numero na posição [%d][%d]:",i,j);
                matriz[i][j] = input.nextFloat();
                soma[j] += matriz[i][j];
                //O J pq ele quer por coluna
            }
        }
        for(j=0;j<coluna;j++){
            System.out.printf("\nA soma da coluna [%d] é:%.2f",j,soma[j]);
        }
    }
}
