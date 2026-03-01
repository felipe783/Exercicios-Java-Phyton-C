import java.util.Scanner;
import java.util.ArrayList;

/*Escolhedor de Roupas por Clima: Peça temperatura e clima (sol/chuva), use condicionais para sugerir roupas. Aninhe com
switch para estações. Extensão: Relacione a apps de lifestyle ou IA pessoal.*/
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float temp;
        int clima;
        System.out.print("Fale a temperatura:");
        temp= input.nextFloat();
        System.out.print("Fale o clime[Sol=1,Chuva=2]:");
        clima=input.nextInt();
        switch(clima){ //Ve o clima
            case 1: //Sol
                if(temp<0){
                    System.out.println("Calça,blusa");
                }
                else{
                    if(temp>0 && temp<=20){
                        System.out.println("Calça,camisa");
                    }
                    else{ //Maior q 20
                        System.out.println("Shorts,Camiseta");
                    }
                }
                break;
            case 2: //Chuva
                if(temp<0){
                    System.out.println("Calça,Blusa");
                }
                else{
                    if(temp>0 && temp<=20){
                        System.out.println("Calça,Blusa");
                    }
                    else{ //Maior q 20
                        System.out.println("Calça,camiseta");
                    }
                }
                break;
        }
    }
}
