#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(){
    int n1,n2,d2,d1,cima,baixo,resto,A,B,mdc,sc,sb;
    char a,b,c;
    printf("Fale:");
    scanf("%i %c %i %c %i %c %i",&n1,&a,&d1,&b,&n2,&c,&d2);
    switch(b){
        case '+':{
            cima=(n1*d2+n2*d1);
            baixo=(d1*d2);
            break;
        }
        case '-':{
            cima=(n1*d2-n2*d1);
            baixo=(d1*d2);
            break;
        }
        case '*':{
            cima=(n1*n2);
            baixo=(d1*d2);
            break;
    
        }
    }
    A=cima;
    B=baixo;
    while(B!=0){
        resto=A%B;
        A=B;
        B=resto;
    }
    mdc=A;
    sc=cima/mdc;
    sb=baixo/mdc;
    printf("%i/%i=%i/%i", cima, baixo, sc, sb);
    getch();
}    
