#include <math.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

/*-Escreva um algoritmo que leia uma matriz 3x4 e calcule a média dos valores
por linha. Essa média deve ser armazenada em um vetor de 3 linhas.*/

int main(){
	float C[3][4]={0};
	int i,j,cont,aluno;
	float media[3],soma;
	printf("Quantas notas por aluno:");
	scanf("%d",&aluno);
	for(i=0;i<3i++){
		for(j=0;j<4;j++){
			printf("\n Fale o numero na posicao [%d] [%d]:",i,j);
			scanf("%f",&C[i][j]);
		}
	}
	//Entrada de dados
	printf("Insira os valores para a matriz 3x4: \n" );
	for (i=0;i<3;i++){
		for (j=0;j<4;j++){
			printf("insira o valor no elemento %d %d: ",i,j);
			scanf("%f",&C[i][j]);
		}
	}
	
	for (i=0;i<3;i++){
		for (j=0;j<4;j++){
		printf("%.2f ",C[i][j]);
	}
	printf("\n");
	}
	printf("\n===================================================================================\n");
	for(i=0;i<3;i++){ //Linhas
		for(j=0;j<4;j++){ //Colunas
			soma +=C[i][j];	
		}
		soma=0;
		media[i]=soma/aluno;
	}	
	for(i=0;i<3;i++){
        printf("\n %.2f",media[i]);
    }
	getch();
	
}
