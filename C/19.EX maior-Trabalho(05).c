#include <math.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

/*Faça um algoritmo que monte uma matriz com as dimensões do usuário,
calcule e mostre a soma dos elementos da diagonal secundária..*/

int main(){
	int i,j;
	int linha,coluna;
	float soma;
	//Definir a dimensão matriz
	printf("\nA Matriz obrigatoriamente tem que ser quadrada\n");
	printf("\nFale o i:");
	scanf("%d",&linha);
	printf("\nFale o j:");
	scanf("%d",&coluna);
	//declaração matriz
	float A[linha][coluna];
	//entrada de dados matriz
	for(i=0;i<linha;i++){
		for(j=0;j<coluna;j++){
			printf("\n Fale o numero na posicao [%d] [%d]:",i,j);
			scanf("%f",&A[i][j]);
			if(i+j==linha-1){
				soma +=A[i][j];
			}
		}
	}
	//ficar bunito
	printf("\n=============================================================================\n");
	printf("\nSua matriz:\n");
	for(i=0;i<linha;i++){
		for(j=0;j<coluna;j++){
			printf(" %.2f ",A[i][j]);
		}
		printf("\n");
	}
	printf("\n=============================================================================\n");
	printf("\n a soma da diagonal secundaria:%.2f",soma);
}
