import java.util.Scanner;
import java.util.ArrayList;

/*Analisador de Notas de Turma: Armazene notas em array de doubles, itere para média, máximo e reprovados. Extensão:
Aplique em plataformas educacionais.*/

public class Main {
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
       int num_alunos, i, tipo, num_notas, aluno;
       float Soma_Notas, Soma_Pesos,soma_NP,mediaP,media;
       System.out.println("Quantos Alunos:");
       num_alunos = input.nextInt();
       input.nextLine();
       for (aluno = 0; aluno < num_alunos; aluno++) {
           System.out.printf("\nAluno %d\n", aluno + 1);
           System.out.println("Quantas notas:");
           num_notas = input.nextInt();
           input.nextLine();
           float[] nota = new float[num_notas];
           float[] pesos = new float[num_notas];
           System.out.println("\n Media[1] ou Media Ponderada[2]");
           tipo = input.nextInt();
           input.nextLine();
           for (i = 0; i < num_notas; i++) {
               System.out.printf("Fale as nota %dº:\n", i + 1);
               nota[i] = input.nextFloat();
               if (tipo != 1) {
                   System.out.println("Fale o peso:\n");
                   pesos[i] = input.nextFloat();
               }
           }
           //Media
           Soma_Notas = 0;
           if (tipo == 1) {
               for (i = 0; i < num_notas; i++) {
                   Soma_Notas += nota[i];
               }
               media = 0;
               media = Soma_Notas/num_notas;
               System.out.printf("\nA media é: %.2f\n",media);
               if (media >= 7) {
                   System.out.println("\nAprovado");
               }
               else {
                   if ((media < 7) && (media >= 3)) {
                       System.out.println("\nExame");
                   }
                   else {
                       System.out.println("\nReprovado");
                   }
               }
           }
           //Media P
           else{
               Soma_Pesos=0;
               soma_NP=0;
               for(i=0;i<num_notas;i++){
                   Soma_Pesos += pesos[i];
                   soma_NP += nota[i]*pesos[i];
               }
               mediaP=0;
               mediaP=soma_NP/Soma_Pesos;
               System.out.printf("\nA media pondera:%.2f\n", mediaP);
               if(mediaP>=7){
                   System.out.println("\nAprovado");
               }
               else{
                   if((mediaP<7)&&(mediaP>=3)){
                       System.out.println("\nExame");
                   }
                   else{
                       System.out.println("\nReprovado");
                   }
               }
           }
       }
   }
}

