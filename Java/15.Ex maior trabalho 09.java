import java.util.Scanner;

/*Faça um algoritmo que monte um vetor com a dimensão do usuário e mostre a
diferença do maior e menor valor do vetor.*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i=0,tamanho=0;
        System.out.println("Fale o tamanho do vetor:");
        tamanho= input.nextInt();
        float[] vetor=new float[tamanho];
        for(i=0;i<tamanho;i++){
            System.out.printf("\nFale o valor na posição [%d]:",i+1);
            vetor[i] = input.nextFloat();
        }
        float maior=vetor[0];
        float menor=vetor[0];
        for(i=0;i<tamanho;i++){
            if(vetor[i]>maior){
                maior=vetor[i];
            }
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        float dif=maior-menor;
        System.out.printf("\nA diferença é:%.2f",dif);
    }
}

