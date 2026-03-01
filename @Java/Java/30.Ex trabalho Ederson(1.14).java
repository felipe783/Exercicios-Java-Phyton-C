import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Simulador de Lançamento de Dados: Com do-while, simule lançamentos de dados até somar 7, contando tentativas. Use
continue para ignorar pares. Extensão: Aplique em jogos ou análise probabilística em software de entretenimento*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random rnd=new Random(); //Aqui cria um objeto de randomização
        boolean aux=true;
        int tentativas=0;
        do{
            //Dois "dados"
            /*Normalmente iria de 0 a 5 mas o +1 desloca tudo "pra direita" então vai 1 a 6(os dois inclusos)*/
            int x=rnd.nextInt(6)+1;
            int y=rnd.nextInt(6)+1;
            tentativas++;
            if(x%2==0 && y%2==0){ //vai pular se x/y for par
                continue;
            }
            if(x+y==7){
                aux=false;
                break;
            }
        }while(aux);
        System.out.printf("Foi preciso %d tentativas para a soma dar 7",tentativas);
    }
}
