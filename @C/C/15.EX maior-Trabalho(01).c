#include <math.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>

//Definir um algoritmo que leia 2 vetores com 6 elementos cada. O algoritmo
//deve gerar uma matriz C de 6x2 onde a 1º coluna são valores de A e a 2º
//coluna valores de B

int main(){
	int A[6];
	int B[6];
	int C[6][2]={0};
	int j,i;
	for(i=0;i<6;i++){
		printf("\nFale os numeros do Vetor A:");
		scanf("%d",&A[i]);
	}
	for(i=0;i<6;i++){
		printf("\nFale os numeros do Vetor B:");
		scanf("%d",&B[i]);
	}
	printf("\n=========================================================================\n");
	//Matriz
	for(i=0;i<6;i++){ 
		for(j=0;j<2;j++){ 
			C[i][j]=A[i];
			if (j==1){ //Sa porra aqui é pra separar o Vetor B pra ele ir obrigatoriamente pra segunda coluna
				C[i][j]=B[i];
			}
		}
	}
	for(i=0;i<6;i++){
		for(j=0;j<2;j++){
			printf("%3d",C[i][j]);
		}
		printf("\n");
	}
}
