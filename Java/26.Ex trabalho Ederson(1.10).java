import java.util.Scanner;
import java.util.ArrayList;

/*Simulador de Tráfego Urbano: Baseado em inputs como velocidade e sinal (verde/amarelo/vermelho), use condicionais
aninhadas e switch para determinar multas ou ações (ex.: if velocidade > limite, multar). Extensão: Aplique em smart cities ou
engenharia de tráfego.*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        float velocidade=0,limite=0;
        int sinal=0;
        System.out.print("\nFale o limite de velocidade da rua:");
        limite=input.nextFloat();
        System.out.print("\nFale a velocidade que o carro estava:");
        velocidade = input.nextFloat();
        System.out.print("\n======================================================");
        System.out.print("\n1=Verde");
        System.out.print("\n2=Amarelo");
        System.out.print("\n3=Vermelho");
        System.out.print("\n======================================================");
        System.out.print("\nFale a cor do sinal seguindo a tabela a acima:");
        sinal= input.nextInt();
        /*nesse switch case ta os casos dos sinais pq dai eu sei se furou ou não,no vermelho então quer dizer que furou,basta agora
        ver se ele estava em excesso de velocidade,se tiver e + multas pro cara,se não so toma multa por furar sinal*/
        switch(sinal){
            case 1: //VEEERDE
                System.out.print("\nSem multa");
                break;
            case 2: //Amarelo
                System.out.print("\nMulta de R$10");
                break;
            case 3: //vermelho
                //descobri q dava pra colocar if dentro do switch case achei pika
                if(velocidade > limite){
                    System.out.print("\nMulta de R$150 + R$2078 por ter furado sinal");
                    System.out.print("\nTotalizando:R$2228 e cassação da carteira");
                }
                else {
                    System.out.print("\nMulta por avançar sinal vermelho");
                }
                break;
        }
        //Aqui fiz sem switch case
        /*if(velocidade>limite){
            if(sinal==3){
                System.out.print("\nMulta de R$150 + R$2078 por ter furado sinal");
                System.out.print("\nTotalizando:R$2228 e cassação da carteira");
            }
            else{
                System.out.print("Multa por excesso de velocidade");
            }
        }
        else{
            if(sinal==2){
                System.out.print("Multa de R$10");
            }
            else{
                System.out.print("Sem multa");
            }
        }*/
    }
}
