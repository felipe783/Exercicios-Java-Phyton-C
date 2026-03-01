import java.util.Scanner;

/*Conversor de Temperaturas: Desenvolva um programa que converta temperaturas entre Celsius, Fahrenheit e Kelvin. O
usuário informa a unidade de origem, o valor e a unidade de destino. Use variáveis primitivas e constantes para fórmulas.
Extensão: Integre em uma aplicação de monitoramento ambiental para sensores IoT.*/

/*A logica foi o seguinte,se ele veio da origem então logicamente vc pode descartar aquela conversão,e fazer as outras duas,dai pra ver pra 
qual ele qer converter é so colocar 1 if e um else(pq se não foi 1 é outro)em cada caso,e fazer as formulas pra cada um*/  

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] unidade = new int[2]; //Cria o vetor unidade
        double valor;
        System.out.println("==========================================");
        System.out.println("1=Celsius");
        System.out.println("2=Fahrenheit");
        System.out.println("3=kelvin");
        System.out.println("==========================================");
        System.out.println("Fale a unidade de origem[1/2/3]:");
        unidade[0] = input.nextInt(); //Le a string na posição 0
        System.out.println("Fale o valor:");
        valor = input.nextFloat();
        System.out.println("Fale a unidade de destino[1/2/3]:");
        unidade[1] = input.nextInt(); //Le a string na posição 1
        //Os calculos
        switch (unidade[0]) { //da onde vai sair o valor
            case 1: //Sai de Celsius
                //Esses if é pra ver qual o destino(so tem dois pq a origem descarta)
                if (unidade[1] == 2) {//Fahrenheit
                    valor = (1.8 * valor) + 32;
                } else {//Kelvin
                    valor = valor + 273.15;
                }
                break;
            case 2: //Fahrenheit
                if (unidade[1] == 1) {//Celsius
                    valor = (valor - 32) / 1.8;
                } else {//Kelvin
                    valor = (valor - 32) * (5.0/9.0) + 273; //Se so for 5/9 sempre vai dar 0 pq é divsão de inteiro
                }
                break;
            case 3: //kelvin
                if (unidade[1] == 1) {//Celsius
                    valor = valor - 273;
                } else {//Farenheit
                    valor = (valor - 273) * 1.8 + 32;
                }
                break;
        }
        System.out.printf("\nO valor convertido %.2f", valor);
    }
}
