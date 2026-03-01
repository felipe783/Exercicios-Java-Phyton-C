import java.util.Scanner;
import java.util.ArrayList;

/*Analisador de Equações Simples: Peça coeficientes a, b, c de uma equação quadrática e calcule o discriminante (b2 - 4ac) com
operadores. Verifique se tem raízes reais. Extensão: Expanda para ferramentas educacionais ou científicas.*/

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float a,b,c,delta;
        //Esses inputs ai é q le em uma linha as 3 variaveis 
        System.out.println("Fale o coeficiente A/B/C:");
        a=input.nextFloat();
        b=input.nextFloat();
        c=input.nextFloat();
        delta=(float)Math.pow(b,2)-4*a*c; //ta a Math é pra exatidão então ela sempre retorna double pq é padrão dela,por isso mudei pra float
        System.out.printf("\nO discriminante:%.2f",delta);
        if(delta<0){
            System.out.print("\nNão tem raiz real");
        }
        else{
            if(delta==0){
                System.out.print("\nTem uma raiz real");
            }
            else{
                System.out.print("\nTem 2 raizes reais");
            }
        }
    }
}
