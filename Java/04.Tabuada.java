import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1,num,aux;
        for(aux=0;aux<=10;aux++){
            for(num=0;num<=10;num++){
                System.out.printf("\n%d * %d = %d",aux,num,(aux*num)); //o %d é o %i so q no java(nao sei pq o %i não funciona)
            }
        }
    }
}
