#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>

/*Definir um algoritmo que leia vetor A e B e gere um C, todos com 6 elementos.
a) As posições pares de C são os elementos das posições pares de A;
b) As posições impares de C são os elementos das posições impares de B;*/

int main(){
    int i,tamanho;
    printf("\nFale o tamanho dos dois vetores:");
    scanf("%d",&tamanho);
    float vetorA[tamanho],vetorB[tamanho],vetorC[tamanho];
    printf("\n==========================================\n");
    printf("\nVetor A\n");
    for(i=0;i<tamanho;i++){ //Vetor A
        printf("Fale os valores do vetor A na posicao [%d]:",i+1);
        scanf("%f",&vetorA[i]);
    }
    printf("\n==========================================\n");
    printf("\nVetor B\n");
    for(i=0;i<tamanho;i++){ //Vetoe B
        printf("Fale os valores do vetor B na posicao [%d]:",i+1);
        scanf("%f",&vetorB[i]);
    }
    //Letra A
    for(i=0;i<tamanho;i++){
        if(i%2==0){
            vetorC[i]=vetorA[i];
        }
        else{
            vetorC[i]=vetorB[i];
        }
    }
    printf("\n==========================================\n");
    printf("\nO vetor C\n");
    for(i=0;i<tamanho;i++){
        printf("\n%.2f",vetorC[i]);
    }
    return 0;   
}
