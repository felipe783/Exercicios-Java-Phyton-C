#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>

//Soma linhas da matriz

int main(){
	setlocale(LC_ALL, ""); //pra ficar bonito
	int matriz[3][3] = {};
	int i,j;
	int soma[3]={0},somaTotal=0;
	for(i=0;i<3;i++){ //Matriz
		for(j=0;j<3;j++){
	 		printf("Fale o numero na posição [%d][%d]: ",i,j);
	 		scanf("%d",&matriz[i][j]);
	 	}
	}
	printf("\n================================================\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
			printf("%3d",matriz[i][j]); // esse é pra reservar "3" casas decimais e ficar bonito
		}
		printf("\n");
	}
	printf("\n================================================\n");
	for(i=0;i<3;i++){ //vetor
		for(j=0;j<3;j++){
			somaTotal += matriz[i][j];
			soma[i] += matriz[i][j]; //soma por linhas
		}
	}
	printf("\nSoma total %d",somaTotal);
	for(i=0;i<3;i++){
		printf("\nSoma da linha [%d]:%d",i,soma[i]);
	}
		
}
