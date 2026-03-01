import java.util.Scanner;
import java.util.ArrayList;

/*Gerador de Tabuada: Use laços for e while para gerar a tabuada de um número informado, com opção de parar (break) se
ultrapassar limite. Inclua laços aninhados para múltiplas tabuadas. Extensão: Use em ferramentas educacionais interativas.*/
public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        boolean aux=true;
        int i,numero;
        String parar;
        while(aux){
            System.out.println("Fale o numero:");
            numero = input.nextInt();
            System.out.println("Fale ate que numero voce quer multiplicar:");
            int max=input.nextInt();
            input.nextLine(); //Isso tira o Enter,pq senão o codigo passa direto do input parar;
            for(i=0;i<max+1;i++){
                System.out.printf("\n%d*%d=%d",i,numero,numero*i);
            }
            System.out.println("\nQuer parar [Sim/Não]:");
            parar = input.nextLine();
            if(parar.equalsIgnoreCase("Sim")){
                aux=false;
                break;
                /*o ignorecase ele vai ignorar caixa alta vai ser tudo igual
                 Ex:parar=PARAR*/
            }
            else{
                continue;
            }
        }
    }
}
