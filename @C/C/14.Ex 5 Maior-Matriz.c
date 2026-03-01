#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>

//Uma matriz 2x2 e falar quantos numeros entre 15 e 20

int main(){
	setlocale(LC_ALL, "");
	int matriz[2][2]= {0};
	int i,j,cont=0;
	for(i=0;i<2;i++){ //Matriz
		for(j=0;j<2;j++){
	 		printf("\nFale o numero na posição [%d][%d]: ",i,j);
	 		scanf("%d",&matriz[i][j]);
	 		if (matriz[i][j]>15 && matriz[i][j]<20 ){
	 			cont++;
			}
	 	}
	}
	printf("\nNumeros que estão entre 20 e 15: %d",cont);
}
