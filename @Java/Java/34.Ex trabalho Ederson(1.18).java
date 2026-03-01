import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Validador de CPF: Desenvolva uma função que verifique validade de CPF (algoritmo padrão), retornando boolean. Chame
com escopo controlado. Extensão: Integre em sistemas de cadastro governamental ou e-commerce.*/

public class Main {
    //o int[] fala q é um vetor pro programa
    /**Muda o cpf de string pra numero**/
    /*Minha logica pra essa função:como o input do Cpf é string e ele não iria mudar,então eu coloquei em um vetor cada numero
    separado,e pq fiz isso?
    se eu ler o Cpf como long/double e este cpf começar com 0 ele vai ignorar o 0,e pra arrumar achei
    muito complexo,e prefiri usar essa minha ideia do vetor*/
    public static int[] transformar(String cpf) {
        int[] cpf_int = new int[11];
        int i;
        /**transforma o cpf em numero**/
        for (i = 0; i < 11; i++) {
            /*Tranforma cada numero em Int,o 0 tem um numero ascii de 48,basicamente oq ce ta fazendo é 48-numero
            Ex:o 1 em ascii é 49 o codigo ira fazer 49-48,isso dara 1 em valor numerico*/
            cpf_int[i] = cpf.charAt(i) - '0';
        }
        return cpf_int;
        //Ele devolve o objeto "cpf_int" com os valores preenchidos em cada posição
    }
    /**Valida o cpf**/
    public static boolean validar(String cpf){
        int[] cpf_int = transformar(cpf); /*chama a função transformar*/
        char primeiro;
        boolean aux=true;
        int i,cont=0,j=10,multiplicação=0,soma=0,verificador_01=0,verificador_02=0;
        /**Validar tamanho,e cpf com os mesmos numero**/
        if(cpf.length() != 11){
            return false;
        }
        primeiro = cpf.charAt(0);
        /*Se todos os valores são iguais então basta pegar apenas 1 numero do cpf e verificar todos com ele*/
        /**Preencher o vetor e ver se todos os numeros são iguais**/
        for(i=0;i<11;i++){
            if(cpf.charAt(i)==primeiro){
                cont++;
            }
        }
        if(cont==11){ //Se o cont foi usado 11 todos os numero são iguais
            return false;
        }
        /**Validar os digitos**/
        /*Pra calcular os digitos verificadores,são pegos os 9 primeiros numeros(para o 1º dígito) e os 10 primeiros (para o 2º dígito)
        e multiplica eles pelos pessos decrescentes o primeiro de 10-2 e o segundo de 11-2,dai ver o resto da soma da multiplicação
        se der 0/1 o validador=0 se não o validador=11-resto da soma*/
        //Ta em um while pq acho q daria conflito com os 2 ultimos if
        while(aux){
            /**Primeiro digito verificador**/
            for(i=0;i<9;i++){
                multiplicação=cpf_int[i]*j; //Aqui é a multiplicação
                j--; //o j decrescer pq diz na regra pra multiplicar com pesos decrescentes
                soma+=multiplicação; //a soma
            }
            if(soma%11==0 || soma%11==1){ //ver os restos
                verificador_01=0;
            }
            else{
                verificador_01=11-(soma%11);
            }
            //Segundo digito verificador
            soma=0;
            multiplicação=0;
            /**Segundo**/
            j=11;
            for(i=0;i<9;i++){
                if(j==2){ //Esse if é pra sair do loop pra pegar o validador_01 e incluir no calculo(vem da formula do cpf)
                    break;
                }
                multiplicação=cpf_int[i]*j;
                j--;
                soma+=multiplicação;
            }
            soma += verificador_01*2;
            if(soma%11==0 || soma%11==1){
                verificador_02=0;
            }
            else{
                verificador_02=11-(soma%11);
            }
            aux=false;
            break;
        }
        if(verificador_01==cpf_int[9] && verificador_02==cpf_int[10] ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String cpf;
        boolean Cpf_validado;
        System.out.println("Digite o cpf[sem pontos/traços]:");
        cpf = input.nextLine();
        Cpf_validado=validar(cpf); //Aqui ja chama a função,e define o valor da variavel
        if(Cpf_validado){
            System.out.println("Cpf valido");
        }
        else{
            System.out.println("Cpf invalido");
        }
        /*Aqui ele puxa a função validar,então ele volta pra cima,e como a validar tambem puxa a transformar então as duas
        são puxadas*/
    }
}
