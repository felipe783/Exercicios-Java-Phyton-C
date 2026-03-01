import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Fale o primeiro intervalo:");
        int intervalo1 = input.nextInt();
        input.nextLine(); //O enter entra como input dai isso skipa ele
        System.out.println("Fale o segundo intervalo:");
        int intervalo2 = input.nextInt();
        input.nextLine();
        if(intervalo1>intervalo2){ //aqui troca os intervalos pra o intervalo1 ser menor q o 2
            int aux=intervalo1;
            intervalo1=intervalo2;
            intervalo2=aux;
        }
        //Primos
        for(int i=intervalo1;i<intervalo2;i++){ 
            boolean primo=true;
            //contador começa em 2 pra sempre ser diferente de i
            for(int contador=2;contador<i;contador++){ //menor q i pq no if vai entrar como i%i e isso sempre da 0 e vai sair
                if(i % contador==0){ //Ver se tem mais de 1 divisor
                    primo=false;
                    break; //sai do loop pra encontrou mais de 1 divisor
                }
            }
            if(primo){ 
                System.out.printf("\n %d é primo",i);
            }
        }
    }
}
