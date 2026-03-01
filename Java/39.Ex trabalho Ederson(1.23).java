import java.util.Scanner;
import java.util.ArrayList;

/*Simulador de Fila de Atendimento: Array de strings para nomes em fila, adicione/remova elementos e itere. Extensão:
Relacione a sistemas de saúde ou bancos.*/

/**Logica é ver qual a escolha do usuario,e entrar em um loop se o usuario digitar 0 saio do loop,
 e com isso usando as funções .add,.set,.remove,para adicionar/substituir/remover **/
public class Main {
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args){
       boolean aux=true;
       String temp,temp2;
       int escolha,i;
       ArrayList<String> nomes= new ArrayList<>();
       nomes.add("Jorge");
       nomes.add("Ana");
       nomes.add("Felipe");
       nomes.add("Maria");
       nomes.add("Pedro");
       System.out.println("========================");
       System.out.println("Encerrar=0");
       System.out.println("Remover=1");
       System.out.println("Adicionar=2");
       System.out.println("Subtituir=3");
       System.out.println("========================");
       while(aux){
           System.out.println("O que voce deseja fazer:");
           escolha = input.nextInt();
           input.nextLine(); //Tira o "Enter"
           if(escolha==0){
               aux = false;
               break;
           }
           else{
               if(escolha==1){//Remover
                   System.out.println(nomes); //imprime a lista
                   System.out.println("Qual nome voce deseja remover?");
                   temp = input.nextLine();
                   for(i=0;i<nomes.size();i++){
                       if(nomes.get(i).equalsIgnoreCase(temp)){
                           nomes.remove(i);
                           System.out.printf("\nO nome %s foi removido\n",temp);
                           System.out.println(nomes);
                           break;
                       }
                   }
               }
               else{
                   if(escolha==2){ //Adicionar
                       System.out.println(nomes); //imprime a lista
                       System.out.println("Qual nome voce deseja adicionar?");
                       temp = input.nextLine();
                       nomes.add(temp);
                       System.out.printf("\nO nome %s foi adicionado\n",temp);
                       System.out.println(nomes);
                       break;
                   }
                   else{ //Substituir
                       System.out.println(nomes);
                       System.out.println("Qual nome voce deseja substituir?");
                       temp = input.nextLine();
                       System.out.println("Por qual nome?");
                       temp2 = input.nextLine();
                       for(i=0;i<nomes.size();i++){
                           if(nomes.get(i).equalsIgnoreCase(temp)){
                               nomes.set(i,temp2);
                               System.out.printf("\nO nome %s foi substituido por %s\n",temp,temp2);
                               System.out.println(nomes);
                               break;
                           }
                       }
                   }
               }
           }
       }
   }
}

