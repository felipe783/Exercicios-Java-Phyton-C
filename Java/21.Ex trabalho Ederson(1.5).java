import java.util.Scanner;
import java.util.ArrayList;

/*Calculadora de Juros Compostos: Implemente um programa que calcule juros compostos usando operadores aritméticos e
expressões (fórmula: A = P * (1 + r/n)^(n*t)). Peça inputs do usuário e use casting para precisão decimal. Extensão: Use em um
software bancário para simulações de investimentos.*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T=0,n=0;
        double A=0,P=0,R=0;
        System.out.println("Fale o capital inicial[P]:");
        P = input.nextDouble();
        System.out.println("Fale a taxa de juros[R]:");
        R = input.nextDouble();
        System.out.println("Fale o número de capitalizações por ano[n]:");
        n = input.nextInt();
        System.out.println("Fale o tempo(em anos)[T]:");
        T = input.nextInt();

        R=R/100; //transforma em porcentagem
        A=P*Math.pow(1+R/n,n*T); //Eleva  o 1+R na potencia n*t
        System.out.printf("\nA montante é:%.2f",A);
    }
}
