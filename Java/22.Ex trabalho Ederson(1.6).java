import java.util.Scanner;
import java.util.ArrayList;

/*Verificador de Elegibilidade para Voto: Usando operadores relacionais e lógicos, crie um programa que leia idade,
nacionalidade (boolean) e verifique se a pessoa pode votar (idade >= 16 e nacionalidade verdadeira). Inclua expressões
complexas com precedência. Extensão: Aplique em sistemas eleitorais ou de governança digital.*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade,aux;
        boolean nacional;
        System.out.println("Sua idade:");
        idade = input.nextInt();
        System.out.println("Vc é brasileiro(Sim=1/Não=2)");
        aux = input.nextInt();
        if(aux==1){
            nacional=true;
        }
        else{
            nacional=false;
        }
        if(nacional==true && idade>=16){
            System.out.println("Vc pode votar");
        }
        else{
            System.out.println("Vc pode não votar");
        }
    }
}
