#include <math.h>
#include <conio.h>
#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <locale.h>

/*Faça um algoritmo que monte uma matriz com as dimensões do usuário e crie
um vetor onde cada posição armazena a soma dos elementos da coluna
correspondente.*/

int main(){
    int i,j;
    // i é linha e j coluna
	int linha,coluna;
	float soma[i];
	//Definir a dimensão matriz
	printf("\nFale a dimensao da linha:");
	scanf("%d",&linha);
	printf("\nFale a dimensao da coluna:");
	scanf("%d",&coluna);
    float A[linha][coluna];
    // Deixa o vetor com zero tudo
    for(j = 0; j < coluna; j++){
        soma[j] = 0;
    }
    //Dados
    for(i=0;i<linha;i++){
        for(j=0;j<coluna;j++){ //Coluna
            printf("Fale o valor na posicao[%d][%d]:",i,j);
            scanf("%f",&A[i][j]);
            soma[j] += A[i][j];    
        }
    } 
    for(j=0;j<coluna;j++){
        printf("\nA soma dos elementos da coluna %d e:[%.2f]\n",j,soma[j]);
    }
    return 0;
}
