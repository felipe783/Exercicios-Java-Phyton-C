#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>

int main() {
 
   double a;
   printf("Fale:");
   scanf("%lf", &a);

   int cem = ((int)a / 100);
   int cinq = (((int)a % 100) / 50);
   int vint = ((((int)a % 100) % 50) / 20);
   int dez = (((((int)a % 100) % 50) % 20) / 10);
   int cinc = ((((((int)a % 100) % 50) % 20) % 10) / 5);
   int dois = (((((((int)a % 100) % 50) % 20) % 10) % 5) / 2);
   int um = (((((((int)a % 100) % 50) % 20) % 10) % 5) % 2);

   int m = (100 * (a - (int)a));

   int zcinq = (m / 50);
   int zvint = ((m % 50) / 25);
   int zdez = (((m % 50) % 25) / 10);
   int zcinc = ((((m % 50) % 25) % 10) / 5);
   int zum = ((((m % 50) % 25) % 10) % 5);

   printf("NOTAS:\n");
   printf("%d nota(s) de R$ 100.00\n", cem);
   printf("%d nota(s) de R$ 50.00\n", cinq);
   printf("%d nota(s) de R$ 20.00\n", vint);
   printf("%d nota(s) de R$ 10.00\n", dez);
   printf("%d nota(s) de R$ 5.00\n", cinc);
   printf("%d nota(s) de R$ 2.00\n", dois);
   printf("MOEDAS:\n");
   printf("%d moeda(s) de R$ 1.00\n", um);
   printf("%d moeda(s) de R$ 0.50\n", zcinq);
   printf("%d moeda(s) de R$ 0.25\n", zvint);
   printf("%d moeda(s) de R$ 0.10\n", zdez);
   printf("%d moeda(s) de R$ 0.05\n", zcinc);
   printf("%d moeda(s) de R$ 0.01\n", zum);
   getch(); 
}
