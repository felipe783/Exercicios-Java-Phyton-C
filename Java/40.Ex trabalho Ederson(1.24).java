import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*CProcessador de Dados Climáticos: Armazene temperaturas diárias em array, calcule média e desvios com iteração. Extensão:
Expanda para análise ambiental em IoT.*/

public class Main{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        int dias,i;
        float soma=0,media;
        double variancia,soma_variancia=0;
        System.out.print("Quantos dias voce deseja registrar?\n");
        dias = input.nextInt();
        float[] temperatura=new float[dias];
        double[] dif_temps=new double[dias];
        for(i=0;i<dias;i++){
            System.out.printf("\nTemperatura do dia %d:\n",i+1);
            temperatura[i] = input.nextFloat();
            soma += temperatura[i]; //Somar pra media
        }
        media = soma/dias;
        soma=0;
        for(i=0;i<dias;i++){  //Tudo isso é da formula de "Desvio padrão de temperatura"
            dif_temps[i] = media-temperatura[i]; //Ver a diferença por dia
            dif_temps[i] = Math.pow(dif_temps[i],2); //Eleva oo quadrado
            soma_variancia += soma +dif_temps[i]; //Soma os numeros elevados ao quadrado
        }
        variancia = soma_variancia/dias; //Media do desvio padrão
        variancia = Math.sqrt(variancia); //Tira a raiz
        System.out.printf("\nA temperatura media:%.2f",media);
        System.out.printf("\nO desvio pedrão:%.2f",variancia);
    }
}
