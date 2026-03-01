import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Gerador de Senhas Aleatórias: Crie uma função sem retorno que gere e imprima senhas, usando parâmetros para comprimento.
Extensão: Relacione a cibersegurança em engenharia de software.*/

public class Main {
    static int comprimento;
    static Scanner input=new Scanner (System.in);
    static char[] especiais = {'!', '@', '#', '$', '%','/','.','-'};
    static char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M', 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
    'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    static char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
    static char[] escolhido;
    /**Gera as senhas**/
    public static String Senhas_Gerador(int comprimento){
        Random rnd=new Random();//Cria o objeto pra usar a biblioteca
        char escolha;
        ArrayList<Character> lista = new ArrayList<>();
        int posicao,i,aux=0;
        int escolha_vetores,Alfabeto_Random,Numero_Random,Especiais_Random;
        while(aux<comprimento){
            /**Cada vez redefine o numero aleatorio por estar em um loop**/
            escolha_vetores=rnd.nextInt(3); //0,1,2
            Alfabeto_Random=rnd.nextInt(alfabeto.length);
            Numero_Random=rnd.nextInt(numeros.length);
            Especiais_Random=rnd.nextInt(especiais.length);
            /**A logica é q pra cada vetor tem um numero aleatorioa(pq ele tem tamnho diferente)
            e esse numero pega um vetor aleaatorio e dentro desse vetor uma posição aleatoria**/
            if(escolha_vetores==0){ //Especiais
                escolhido=especiais;
                posicao=Especiais_Random;
            }
            else{
                if(escolha_vetores==1){ //Alfabeto
                    escolhido=alfabeto;
                    posicao=Alfabeto_Random;
                }
                else{ //Numeros
                    escolhido=numeros;
                    posicao=Numero_Random;
                }
            }
            lista.add(escolhido[posicao]); //Pega o char aleatorio  e coloca na "lista",pra depois ser transformado em string
            aux++;
        }
        /**Aqui pega a lista e transforma em um vetor char**/
        char[] senha = new char[lista.size()]; //Declaração do vetor
        //Esse for é pra pegar os elementos da lista e transformar em vetor,pq não da pra transformar uma lista(ArrayList) em String
        for(i=0;i<lista.size();i++){
            senha[i]=lista.get(i);
        }
        return new String(senha);//e aqui vai retorna o valor em string
        /*O proprio java com o "New String" juntas todos os elementos do vetor,em uma string*/
    }
    public static void main(String[] args){
        String senha;
        System.out.print("Fale o comprimento da senha:");
        comprimento = input.nextInt();
        senha = Senhas_Gerador(comprimento); /*Senha pega o valor gerado pela função q inicializa com o comprimento*/
        System.out.printf("Sua senha:%s",senha);
    }
}

