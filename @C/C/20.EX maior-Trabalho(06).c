#include <math.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

/*Peça ao usuário para preencher a matriz e mostre o maior e o menor valor
presentes, além da posição (linha, coluna) em que aparecem.*/

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
		}
	}
	float maior,menor;
	menor=A[0][0];
	maior=A[0][0];
	for(i=0;i<linha;i++){
		for(j=0;j<coluna;j++){
			if(A[i][j]>maior){
				maior=A[i][j];
			}
			if(A[i][j]<menor){
				menor=A[i][j];
			}
		}
	}
	for(i=0;i<linha;i++){
		for(j=0;j<coluna;j++){
			if(A[i][j]==maior){
				printf("\nO maior [%.2f] esta na posicao [%d] [%d]:",maior,i,j);
			}
			if(A[i][j]==menor){
				printf("\nO menor:[%.2f] esta na posicao [%d] [%d]:",menor,i,j);
			}
		}
	}
	
	
	
}
