#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(){
    int aux=1,i,j,moradores[100],consumo[100],moradores_total=0,consumo_total=0,cidade=1;//esses moradores/consumo é tipo a lista de python para tirar é moradora[0....] 
    float media_total;
    while(aux!=0){
        printf("Fale quantas casas:");
        scanf("%i",&aux);
        moradores_total=0;
        consumo_total=0;
        if(aux==0){
            //Segundo Gpt ele entao em loop 
            break;
        }
        //Consumo medio e vetor
        for(i=0;i<aux;i++){
        printf("Quantidade de moradores e o consumo:");
        scanf("%i %i",&moradores[i],&consumo[i]);
        }
        //Ordenaçao Bubble sort
        for( i = 0; i < aux - 1; i++) {
            for( j = 0; j < aux - i - 1; j++) {
                if (consumo[j] / moradores[j] > consumo[j + 1] / moradores[j + 1]) {//essa parte dei ctrl C mesmo e se foda
                    int temp = moradores[j];
                    moradores[j] = moradores[j + 1];
                    moradores[j + 1] = temp;

                    temp = consumo[j];
                    consumo[j] = consumo[j + 1];
                    consumo[j + 1] = temp;
                }
            }
        }
        //Totais
        for (i = 0; i < aux; i++) {
            moradores_total += moradores[i];
            consumo_total += consumo[i];
        }
        //Media 
        media_total=(float)consumo_total/moradores_total;
        printf("Cidade #%i\n",cidade);
        for (i = 0; i < aux; i++) {
            printf("%i-%i\n", moradores[i], consumo[i] / moradores[i]);
        }
        printf("Consumo medio %.2f \n",media_total);
        cidade++;
    }
    return 0;
}
