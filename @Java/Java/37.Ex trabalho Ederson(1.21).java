import java.util.Scanner;
import java.util.ArrayList;

/*Gerenciador de Estoque: Use array de inteiros para quantidades de produtos, itere com for para calcular total e mínimo.
Manipule com métodos como sort. Extensão: Use em sistemas de logística ou ERP.*/

/**A logica é pegar um ArrayList da quantidade transformar em um vetor"normal" e usar ele pra ser ordenado,e depois
 imprimir o vetor,a soma,e o minimo**/
public class Main {
   static Scanner input = new Scanner(System.in);
   static int i,j;
   /**Ordenar o vetor**/
   public static void ordenação(int [] ordenado){
       //Bubble sort
       /*Ele ordena pegando dois numeros vizinhos e compara os dois
       se eles estiverem na ordem errada(não estão de forma crescente),os dois vão trocar*/
       int n = ordenado.length;
       int temp;
       for (i=0;i<n-1;i++){ /*Pq n-1 ele passa por todos os valores,e o ultimo o valor ja estaria no seu lugar pq o resto ja ta ordenado*/
           for (j=0;j<n-1-i;j++){ //Percorre o vetor
               /*O n-1-i e pq o maior valor ja estaria na ultima posição,e por isso o -1 pq senão iria
               mais uma comparação sendo q ela é desnecessaria*/
               if (ordenado[j]>ordenado[j+1]){  //Se o elemento da direira for maior eles trocam
                   temp = ordenado[j];
                   ordenado[j] = ordenado[j+1];
                   ordenado[j+1] = temp;
               }
           }
       }
   }
   public static void main(String[] args){
       ArrayList<Integer> produtos_lista = new ArrayList<>();
       int x,soma=0,menor;
       System.out.print("Para parar digite 0");
       /**Entrada dos dados**/
       for(i=0;i>-1;i++){
           System.out.printf("\nQuantidade do produto %d:",i+1);
           x=input.nextInt();
           if(x==0){ //digitou 0 saiu
               break;
           }
           else{
               produtos_lista.add(x);
           }
       }
       /**Aqui cria um vetor produtos pra ser usado no sort**/
       /*E tambem ja faz a soma da quanatidade,e ve o menor*/
       menor = produtos_lista.get(0);
       int[] produtos = new int [produtos_lista.size()];
       for(i=0;i<produtos_lista.size();i++){
           soma += produtos_lista.get(i);
           produtos[i]=produtos_lista.get(i);
           if(produtos_lista.get(i)<menor){
               menor = produtos_lista.get(i);
           }
       }
       ordenação(produtos);
       /**Imprimir os valores**/
       System.out.print("======================================================\n");
       System.out.println("Os produtos ordenados:");
       for(i=0;i<produtos.length;i++){
           System.out.printf("%d ",produtos[i]);
       }
       System.out.printf("\nA quantidade de produtos:%d",soma);
       System.out.printf("\nA menor quantidade de produtos:%d",menor);
       System.out.print("\n======================================================\n");
   }
}
