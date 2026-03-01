import java.util.Scanner;
import java.util.ArrayList;


/*Validador de Senhas: Leia uma senha e verifique critérios (comprimento >=8, tem maiúscula, número) com if-else. Use switch
para níveis de força. Extensão: Integre em segurança de software para autenticação.*/
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        char[] numeros = {'0','1','2','3','4','5','6','7','8','9'};
        char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M', 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String senha;
        int i = 0,j=0,x=0,cont_Letras=0,cont_Numeros=0;
        //Dados
        System.out.println("Fale sua senha:");
        senha = input.nextLine();
        char letras;
        if(senha.length()>=8){ //Ve o tamanho ta string
            for(i=0;i<senha.length();i++){ 
                letras=senha.charAt(i);
                for(j=0;j<alfabeto.length;j++){ //aqui ve as letras
                    if(letras==alfabeto[j]){
                        cont_Letras++;
                    }
                }
                for(x=0;x<numeros.length;x++){ //aqui ve os numeros,é separado pq numeros é menor q alfabeto
                    if(letras==numeros[x]){
                        cont_Numeros++;
                    }
                }
            }
           /*Essa matriz tem a logica do seguinte a variavel letras ta recebendo o um char de senhas na posição i
           Ja o for de dentro percorre todos os vetores(alfabeto,numeros),e ve se tem algum char(que foi pego no charAt)
           igual a eles dai aumenta em 1 o contador*/
            System.out.printf("\nSua senha tem %d numeros",cont_Numeros);
            System.out.printf("\nSua senha tem %d letras Maiusculas",cont_Letras);
        }
        else{
            System.out.print("\nSua senha não tem 8 ou mais caracteres");
        }
    }
}
