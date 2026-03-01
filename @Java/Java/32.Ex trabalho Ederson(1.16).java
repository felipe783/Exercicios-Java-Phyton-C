import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Analisador de Sequência Fibonacci: Gere a sequência até um limite usando laços aninhados, com continue para pular números
pares. Extensão: Relacione a algoritmos em finanças ou biologia computacional.*/

//Fibonacci é os dois numeros anteriores somados da o proximo "quadradro"
public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int limite=0,i,x=1,y=1,num1=0,num2=0;
        ArrayList<Integer> Fibonnaci = new ArrayList<>(); //o interger é o int
        boolean aux=true;
        System.out.println("Fale o numero limite:");
        limite = input.nextInt();
        //Fibonnaci;
        for(i=1;i>0;i++){
            x=x+y;
            y=x+y;
            //Aqui vai ver se o x/y vão ser maior q o limite,se for não add no array
            if(x>limite || y>limite){ //se colocar x || y >limite da erro pq tem q ser booleno o x e y,dai pra dar certo tem q comparar cada um sozinho
                break;
            }
            Fibonnaci.add(x);
            Fibonnaci.add(y);
        }
        //Imprimir os valores
        for(i=0;i<Fibonnaci.size();i++){//size é o tamho do array
            if(Fibonnaci.get(i)%2==0){ //ver se é par se for so ignora ele
                continue;
            }
            else{ //Se não imprimi
                System.out.printf("\n%d",Fibonnaci.get(i));
            }
        }
    }
}
