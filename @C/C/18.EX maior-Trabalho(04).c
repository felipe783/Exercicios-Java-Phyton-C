#include <math.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

/*Faça um algoritmo que carregue uma matriz 3x2.Recalcule a matriz digitada,
onde cada linha será multiplicada pelo maior elemento da linha em questão.*/

int main(){
	int A[3][2]={0};
	float maior[]={0};
	int i,j;
	//Matriz
	for(i=0;i<3;i++){
		for(j=0;j<2;j++){
			printf("\nFale o valor na posicao %d  %d:",i,j);
			scanf("%d",&A[i][j]);
			
		}
	}
	maior[i];
	//Deixar bunito
	printf("\nSua matriz:\n");
	for(i=0;i<3;i++){
		for(j=0;j<2;j++){
			printf("%d",A[i][j]);
		}
		printf("\n");
	}
	
	for(i=0;i<3;i++){
		for(j=0;j<2;j++){
			if(A[i][j]>maior[i]){ //ta assim pq o j vai rodar inteiro e vai pro I e com isso o "maior" vai receber por linha
				maior[i]=A[i][j];
			}
		}
	}
	
	for(i=0;i<3;i++){
		for(j=0;j<2;j++){
			A[i][j] = maior[i] * A[i][j];
		}
	}	
	printf("\n==========================================================================\n");
	printf("\nA sua matriz multiplicada pelo maior numero em cada linha:\n");
	for(i=0;i<3;i++){
		for(j=0;j<2;j++){
			printf("%3d",A[i][j]);
		}
		printf("\n");
	}	
		
	 
	
}
