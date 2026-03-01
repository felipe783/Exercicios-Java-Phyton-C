import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Contador de Votos em Eleição: Leia votos (em loop while) até digitar "fim", use for para contar opções e break para encerrar.
Extensão: Expanda para sistemas de votação eletrônica.*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean aux=true;
        int i=0,primeiro=0,segundo=0;
        ArrayList<String> Votos=new ArrayList<>();
        String fim;
        System.out.println("==========================");
        System.out.println("Candidato Ederson-178");
        System.out.println("Candidato Ederson de Quinta-777");
        System.out.println("==========================");
        while(aux){
            System.out.println("Fale o numero do seu candidato:");
            Votos.add(input.nextLine());//adiciona o input no vetor
            /*Esse if verifica se ele digitou certo,ou se quer acabar*/
            //Se for diferente dos 178/777 entra nesse if
            if(!Votos.get(i).equalsIgnoreCase("178") && !Votos.get(i).equalsIgnoreCase("777")){
                if(Votos.get(i).equalsIgnoreCase("fim")){ //Se digitou fim sai do while
                    aux=false;
                    break;
                }
                else{
                    System.out.println("Digite o numero certo");
                }
            }
            else{
                if(Votos.get(i).equalsIgnoreCase("178")){
                    primeiro++;
                }
                else{
                    if(Votos.get(i).equalsIgnoreCase("777")){
                        segundo++;
                    }
                }
            }
            i++;
        }
        System.out.printf("\nQuantidade de votos para o primeiro candidato:%d",primeiro);
        System.out.printf("\nQuantidade de votos para o segundo candidato:%d",segundo);
    }
}
