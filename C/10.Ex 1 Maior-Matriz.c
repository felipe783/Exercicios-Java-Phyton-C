#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>

//FAZER A DIAGONAL PRINCIPAL
int main(){
	int i,j;
	int matriz[4][4];
	for (i=0;i<4;i++){  //LINHAS
		for(j=0;j<4;j++){ //COLUNAS
			if(j==i){
				printf(" 1 ");
			}
			else{
				printf(" 0 ");
			}
		}
		printf("\n");//Quebra a linha pq ce nao fudeo
	}
}
