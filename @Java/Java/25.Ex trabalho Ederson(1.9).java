import java.util.Scanner;
import java.util.ArrayList;

/*Classificador de Notas Acadêmicas: Crie um programa que leia uma nota (0-10) e classifique como "Aprovado",
"Recuperação" ou "Reprovado" usando if-else aninhado. Inclua switch para faixas de conceito (A, B, C). Extensão: Use em
sistemas de gerenciamento educacional.*/

/*A logica é simples primeiro entra no while para o professor dar quantas notas quiser,então a nota passa pelos if para ver
se o aluno ta aprovado,recupreção,reprovado depois dessa verificação,vai passar por outra verificação onde dara o "concetios"*/

public class Main{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        float nota;
        char conceito;
        boolean aux=true;
        System.out.print("\nPara parar digite -1\n");
        while(aux){
            System.out.println("\nFale a nota do aluno:");
            nota = input.nextFloat();
            if(nota==-1){
                aux=false;
                break;
            }
            if(nota>=7){
                System.out.print("Aprovado");
                conceito='A';
            }
            else{
                if(nota<7 && nota>=5){
                    System.out.print("Recuperação");
                    conceito='B';
                }
                else{
                    System.out.print("Reprovado");
                    conceito='C';
                }
            }
            switch(conceito){
                case 'A':
                    System.out.printf("\nNota:%.2f",nota);
                    System.out.print("\nConceito A");
                    break;
                case 'B':
                    System.out.printf("\nNota:%.2f",nota);
                    System.out.print("\nConceito B");
                    break;
                case 'C':
                    System.out.printf("\nNota:%.2f",nota);
                    System.out.print("\nConceito C");
                    break;
            }
        }
    }
}
