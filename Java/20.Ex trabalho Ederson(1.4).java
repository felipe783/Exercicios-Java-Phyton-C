import java.util.Scanner;
import java.util.ArrayList;


/*Simulador de Orçamento Pessoal: Peça ao usuário para inserir receitas e despesas mensais, calcule o saldo e exiba uma
mensagem de alerta se negativo. Use tipos primitivos para valores monetários. Extensão: Relacione a finanças pessoais ou
empresariais em sistemas de ERP.*/

/*Aqui pega os valores e faz uma subtração pra ver o quanto sobrou de dinheiro,e entra nos if*/

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float receita = 0, despesas = 0, saldo = 0;
        boolean aux=true;
        System.out.println("Digite 0 na receita e despesas para parar o programa");
        while(aux){
            System.out.println("\nFale a receita do mes:");
            receita = input.nextFloat();
            System.out.println("\nFale as despesas do mes:");
            despesas = input.nextFloat();
            saldo=0;
            saldo = receita - despesas;
            if(receita==0 && despesas==0){
                aux=false;
                break;
            }
            if(saldo<0){
                System.out.println("Ta no vermelho");
                System.out.printf("\nSeu saldo:%.2f",saldo);
            }
            else{
                if(saldo==0){
                    System.out.println("Saldo zerado");
                }
                else{
                    System.out.println("Ta positivo");
                    System.out.printf("\nSeu saldo:%.2f",saldo);
                }
            }
            saldo=0;
        }

    }
}
