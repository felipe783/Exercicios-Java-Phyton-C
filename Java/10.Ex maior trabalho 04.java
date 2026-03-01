import java.util.Scanner;

/*Faça um algoritmo que carregue uma matriz 3x2.Recalcule a matriz digitada,
onde cada linha será multiplicada pelo maior elemento da linha em questão.*/

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float [][] matriz =new float[3][2];
        int i=0,j=0;
        System.out.println("=====================================");
        System.out.println("Digite os valores da matriz 3x2");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.printf("Fale o numero na matriz [%d] [%d]:",i,j);
                matriz[i][j] = input.nextFloat();
            }
        }
        System.out.println("=====================================");
        float [] maior= new float [3];
        maior[0]=matriz[0][0];
        System.out.println("Sua matriz");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.printf("%6.2f",matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("=====================================");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                if(matriz[i][j]>maior[i]){ //o maior[i] vai ver o maior por linha e guardar no vetor maior
                    maior[i]=matriz[i][j];
                }
            }
        }
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){ //Multipicar a linha pelo maior
                matriz[i][j] *= maior[i];
            }
        }
        System.out.println("Sua matriz depois de ser multiplicada pelo maior numero em cada linha:");
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.printf("%6.2f",matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
