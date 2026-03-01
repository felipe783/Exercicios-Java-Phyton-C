#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>

/*Faça um algoritmo que monte uma matriz com as dimensões do usuário e crie
um vetor de duas posições onde a soma dos pares deve ser inserida na
posição zero do vetor e a soma dos impares na posição um do vetor.*/

int main(){
    int i,j;
    // i é linha e j coluna
	int linha,coluna;
	int soma[2];
	//Definir a dimensão matriz
	printf("\nFale a dimensao da linha:");
	scanf("%d",&linha);
	printf("\nFale a dimensao da coluna:");
	scanf("%d",&coluna);
    int A[linha][coluna];
    //Entrada dados
    for(i=0;i<linha;i++){
        for(j=0;j<coluna;j++){
            printf("\nFale o valor na posicao [%d][%d]:",i,j);
            scanf("%i",&A[i][j]);
            //Ver se é par ou impar e somar
            if(A[i][j]%2==0){
                soma[0] +=A[i][j];
            }
            else{
                soma[1] +=A[i][j];
            }
        }
    }
    printf("\nA soma dos pares:[%i]\n",soma[0]);
    printf("\nA soma dos impares:[%i]\n",soma[1]);
    return 0;
}
