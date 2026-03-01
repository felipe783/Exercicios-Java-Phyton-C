#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>

/*Faça um algoritmo que monte um vetor com a dimensão do usuário e mostre a
diferença do maior e menor valor do vetor.*/

int main(){
    int tamanho,i;
    float maior,menor,dif;
    printf("\nFale o tamanho do vetor:");
    scanf("%d",&tamanho);
    float vetor[tamanho];
    for(i=0;i<tamanho;i++){
        printf("\nFale o numero na posicao [%i] no vetor:",i+1);
        scanf("%f",&vetor[i]);
    }
    //Mesma logica de sempre o maior e menor recebe um valor inicial pra ser comparado depois so correr pro abraço
    maior=vetor[0];
    menor=vetor[0];    
    for(i=0;i<tamanho;i++){
        if(vetor[i]>maior){
            maior=vetor[i];
        }
        if(vetor[i]<menor){
            menor=vetor[i];
        }
    }
    dif=maior-menor;
    printf("A diferenca entre o maior e menor e:%.2f",dif);
    return 0;
}
