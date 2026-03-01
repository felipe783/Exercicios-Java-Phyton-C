#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(){
    int x,ano,dia,mes;
    printf("Fale os dias:");
    scanf("%i",&x);
    ano = x/365;
    mes = (x % 365)/30;
    dia=(x % 365) % 30;
    printf("%i",ano);
    printf("\n%i",mes);
    printf("\n%i",dia);
    getch();
}
