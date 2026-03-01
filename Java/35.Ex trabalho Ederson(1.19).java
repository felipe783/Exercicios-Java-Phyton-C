import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Conversor de Moedas: Funções para converter entre real, dólar e euro, com parâmetros de taxa. Use global para taxas fixas.
Extensão: Aplique em fintech ou apps de viagem.*/
//Dolar-5,33
//Euro-6,25
public class Main {
    static Scanner input = new Scanner(System.in);
    static float[] taxas = {1.0F,5.33F,6.55F}; //Cria um vetor com todas as conversões,e é global
    static float valor_convertido;
    /**Calcular as taxas**/
    public static float cambio(float valor, int veio_daqui, int vai_praca){
        /*A logica daqui é o seguinte,temos o valor de origem[veio_daqui],e pra onde ele vai[vai_praca]
        e como as taxas estão em um vetor então o origem pega o numero na posição */
        /**Converte o valor pra moeda de onde veio**/
        valor_convertido= valor * taxas[veio_daqui]; 
        /*Aqui ele faz a conversão de reais pra euro/dolar*/
        /**Converte o valor pra onde ele vai**/
        return valor_convertido/ taxas[vai_praca];
        /*Aqui se voce sabe quantos voce tem em reais so basta converter pra moeda deseja*/
    }
    /**Imprimir os resultados**/
    public static void main(String[] args){
        int[] moeda = new int[3];
        float valor;
        float convertido;
        System.out.println("=========================================");
        System.out.println("Real[0]");
        System.out.println("Dólar[1]");
        System.out.println("Euro[2]");
        System.out.println("=========================================");
        System.out.printf("De qual moeda você quer converter:");
        moeda[0] = input.nextInt();
        System.out.printf("Para qual moeda você quer converter:");
        moeda[1] = input.nextInt();
        System.out.printf("O valor a ser convertido:");
        valor = input.nextFloat();
        convertido=cambio(valor, moeda[0], moeda[1]); //Inputs na função
        System.out.printf("\nValor convertido: %.2f", convertido);
    }
}
