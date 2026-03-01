#include <math.h>
#include <stdlib.h>
#include <stdlab.h>
#include <conio.h>

//Defina um algoritmo que leia 2 vetores com 6 elementos cada e gere um vetor,também com 6 posições, onde cada elemento desse novo vetor é o maior na comparação dos vetores lidos.
int main(){
	int i,j,vet1[6],vet2[6],vet3[6],vet4[6],x;
	//vetores
	for(i=0;i<6;i++){
		printf("Fale os numeros do vetor A:");
		scanf("%i",&vet1[i]);
	}
	printf("==========================\n");
	for(j=0;j<6;j++){
		printf("Fale os numeros do vetor B:");
		scanf("%i",&vet2[j]);
	}
	//compração
	i=0;
	j=0;
	for(x=0;x<6;x++){
		if(vet1[i]>vet2[j]){
			vet3[x]=vet1[i];
		}
		else{
			vet3[x]=vet2[j];
		}
		i++;
		j++;
	}	
	//Vetor final
	printf("Vetor com os maiores valores:\n");
	for(x=0;x<6;x++){
		printf(" %i",vet3[x]);
	}
	getch();
}
