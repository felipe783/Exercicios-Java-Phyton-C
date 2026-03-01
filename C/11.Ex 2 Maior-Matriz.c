#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

//FAZER UMA MATRIZ COM OS MAIORES VALORES

int main(){
	int i,j;
	int matrizA[3][3]{ //Uma forma de definir os valores da matriz
		{5,8,2},
		{7,4,9},
		{6,1,3}
	};
	int matrizB[3][3] = {3,9,1,2,5,7,8,0,4}; //Segunda forma 
	int matrizC[3][3]={0}; //Forma de declarar a matriz,e falando q ele é igual a zero(nula) 
	
	for(i=0;i<3;i++){ //LINHAS
		for(j=0;j<3;j++){ //COLUNAS
			if(matrizA[i][j]<matrizB[i][j]){
				matrizC[i][j]=matrizA[i][j];
			}
			else{
				matrizC[i][j]=matrizB[i][j];
			}
			printf(" %i ",matrizC[i][j]);
		}
		printf("\n");//quebra linhas
	}
	
}
