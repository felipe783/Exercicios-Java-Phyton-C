import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i;
        String senhacerta = "1234";
        String usuariocerto = "admin";
        Scanner scanner = new Scanner(System.in);
        for(i=0;i<3;i++){
            System.out.print("Digite o usuario:");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha:");
            String senha = scanner.nextLine();
            //3 tentativas
            if (senha.equals(senhacerta) && usuario.equals(usuariocerto)){ //esse equals pra objetos (String, List, etc). é o ==
                System.out.println("Senha correta");
                break;
            }
            else{
                System.out.println("Senha incorreta ou usuario incorreto");
            }
        }
        if(i<3){
            System.out.println("Voce entrou no sistema");
        }
        else{
            System.out.println("Bloqueado");
        }
    }
}
