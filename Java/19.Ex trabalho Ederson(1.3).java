import java.util.Scanner;
import java.util.ArrayList;

/*Gerenciador de Tarefas Simples: Escreva um programa que leia uma lista de tarefas diárias (via entrada de texto) e as exiba
formatadas no console, com numeração. Demonstre uso de comentários e boas práticas. Extensão: Expanda para um app de
produtividade em engenharia de software.*/

public class Main   {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> Lista=new ArrayList<>();
        int i;
        String tarefas;
        boolean aux=true;
        System.out.print("\nSe quiser encerrar digite 0");
        /*Esse while é pra entrar em loop para o usuario falar as tarefas,e quando digitar 0 sai do loop*/
        while(aux){
            System.out.print("\nFale a tarefa:");
            tarefas=input.nextLine();
            if(tarefas.equals("0")){
                aux=false;
                break;
                /*Esse ponto equals verifica se o conteudo do objetos são iguais,
                Ja o == ve se os dois valores apontam pro mesmo objeto*/
            }
            else{
                Lista.add(tarefas);
            }
        }
        System.out.printf("\nSua lista:");
        for(i=0;i<Lista.size();i++){ //O size vem o tamanho da lista,e esse for imprime a lista com os numeros
            System.out.printf("\n%d-%s",i+1,Lista.get(i)); //O get pega o valor na posição i no vetor
        }
    }
}
