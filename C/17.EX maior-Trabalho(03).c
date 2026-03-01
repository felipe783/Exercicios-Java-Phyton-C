#include <math.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

/*-Faça um programa que monte uma matriz 2x4 com números inteiros, calcule e
mostre. A quantidade de elementos entre 10 e 15 em cada linha. A média dos
elementos pares da matriz.*/

int main(){
	int A[2][4]={0};
	int i,j,soma=0,cont=0;
	float media;
	int vetor[2]={0};
	i=0;
	j=0;
	for(i=0;i<2;i++){
		for(j=0;j<4;j++){
			printf("\nFale os valores pares %d %d:",i,j);
			scanf("%d",&A[i][j]);
			if(A[i][j]%2==0){
				soma+=A[i][j];
				cont++;
			}
			if(A[i][j]>10 and A[i][j]<25){
				vetor[i]= vetor[i]+1;
			}
		}
	}

	media =soma/cont;
	i=0;
	for (i=0;i<2;i++){
		printf("\n linha %d: %d\n ",i,vetor[i]);
	}
	printf("\nmedia:%.2f",media);
		
}
