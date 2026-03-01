#include <math.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>

int main(){
	int num_alunos,i,tipo,num_notas,aluno;
	float Soma_Notas=0,mediaF,Soma_Pesos=0,notas2[num_notas],soma_NP=0,mediaP,media;
	printf("Quantos alunos:");
	scanf("%i",&num_alunos);
	for(aluno=0;aluno<num_alunos;aluno++){
		printf("\n Aluno %i \n",aluno+1);
		printf("Quantas notas:");
		scanf("%i",&num_notas);
		//Tamanho vetor(nao é os valores)
		float nota[num_notas],pesos[num_notas];
		//
		printf("\nMedia[1] ou Media Ponderada[2]:");
		scanf("%i",&tipo);
		//Leitura de notas
		for(i=0;i<num_notas;i++){
			printf("Fale a nota %iº:\n",i+1);
			scanf("%f",&nota[i]);
			//Pesos
			if(tipo != 1){
				printf("Fale o peso:\n");
				scanf("%f",&pesos[i]);
			}
		}
		//Media
		Soma_Notas = 0;
		if(tipo==1){
			for(i=0;i<num_notas;i++){
				Soma_Notas +=nota[i];			
			}
			media=0;
			media=Soma_Notas/num_notas;
			printf("\nA media pondera: %.2f\n",media);
			if(media>=7){
			printf("\nAprovado");
			}
			else{
				if((media<7)&&(media>=3)){
					printf("\nExame");
				}
				else{
					printf("\nReprovado");
				}
			}
		}
		//Media Ponderada
		else{
			for(i=0;i<num_notas;i++){
				Soma_Pesos += pesos[i];
				soma_NP +=nota[i]*pesos[i];
			}
			mediaP=0;
			mediaP=soma_NP/Soma_Pesos;
			printf("\nA media pondera: %.2f\n",mediaP);
			if(mediaP>=7){
				printf("\nAprovado");
			}
			else{
				if((mediaP<7)&&(mediaP>=3)){
					printf("\nExame");
				}
				else{
					printf("\nReprovado");
				}
			}
		}
	}
}
