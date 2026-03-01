    import java.util.Scanner;
    import java.util.ArrayList;

    /*Simulador de Desconto em Compras: Leia o valor de uma compra e aplique descontos progressivos (ex.: 10% se > 100, 20%
    se > 500) usando operadores e casting. Exiba o valor final. Extensão: Integre em e-commerce para engenharia de software web.*/

    public class Main{
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            boolean aux=true;
            float valor;
            System.out.println("Se quiser digite  parar 0");
            while(aux){
                System.out.printf("\nFale a compra:");
                valor = input.nextFloat();
                if(valor==0){
                    aux=false;
                    break;
                }
                if(valor>100){
                    valor=valor-(valor*0.1f); /*Esse 0.1f é pra falar q é float,pq no java todos os numeros demacimais são double */
                                      //Sem o f tbm ficaria float*double=double e valor é float então não tem como guardar um double em float
                }
                else{
                    if(valor>500){
                        valor=valor-(valor*0.5f);
                    }
                }
                System.out.printf("\nO valor da compra fica:%.2f",valor);
            }
        }
    }
