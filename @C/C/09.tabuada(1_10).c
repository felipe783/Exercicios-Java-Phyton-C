#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main(){
  int n1,num,aux;
  for(aux=0;aux<=10;aux++){
    for(num=0;num<=10;num++){
      printf("\n%i x %i = %i",aux,num,(aux*num));
    }
  }
  getch();
}
