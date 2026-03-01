import java.util.Scanner;

/*Peça ao usuário para preencher a matriz e mostre o maior e o menor valor
presentes, além da posição (linha, coluna) em que aparecem.*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,j,linha,coluna;
        float maior,menor;
        System.out.println("Fale o tamanho da linha[i]:");
        linha= input.nextInt();
        System.out.println("Fale o tamanho da coluna[j]:");
        coluna= input.nextInt();
        float [][] matriz= new float [linha][coluna];
        //Emtrada de dados matriz
        for(i=0;i<linha;i++){
            for(j=0;j<coluna;j++){
                System.out.printf("\nFale o numero na posição [%d][%d]:",i,j);
                matriz[i][j]= input.nextFloat();
            }
        }
        maior=matriz[0][0];
        menor=matriz[0][0];
        //Ver o maior,e menor
        //E mostra a matriz do cara
        System.out.println("====================================================================");
        System.out.println("Sua matriz:");
        for(i=0;i<linha;i++){
            for(j=0;j<coluna;j++){
                System.out.printf("%8.2f",matriz[i][j]);
                if(matriz[i][j]>maior){
                    maior=matriz[i][j];
                }
                if(matriz[i][j]<menor){
                    menor=matriz[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("====================================================================");
        for(i=0;i<linha;i++){
            for(j=0;j<coluna;j++){
                if(maior==matriz[i][j]){
                    System.out.printf("\nO maior numero esta na posição [%d][%d] e é:[%.2f]",i,j,maior);
                }
                if(menor==matriz[i][j]){
                    System.out.printf("\nO menor numero esta na posição [%d][%d] e é:[%.2f]",i,j,menor);
                }
            }
        }
    }
}
