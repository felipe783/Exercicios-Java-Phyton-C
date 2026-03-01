import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main{
    public static float soma(float a, float b){
        /*Se for void não daria pra imprimir,tipo a variavel resultado estaria recebendo 5(3+2),mas agora se fosse void
        o resuldado não poderia receber a função soma pq ela não retorna nada,mas mesmo assim tem como imprimir mensagens na tela
        criar vetor.......*/
        return a+b;
    }
    public static float subtração(float x, float y){
        return x-y;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float[] resultado=new float[4];
        System.out.println("Fale os numeros q seram somados:");
        resultado[0]=input.nextFloat();
        resultado[1]=input.nextFloat();
        System.out.println("Fale os numeros q seram subtraidos:");
        resultado[2]=input.nextFloat();
        resultado[3]=input.nextFloat();
        System.out.printf("\nA soma é %.2f",soma(resultado[0],resultado[1]));
        System.out.printf("A subtração é %.2f",subtração(resultado[2],resultado[3]));
    }
}
