import java.util.Scanner;
import java.util.ArrayList;

public class Criacao{
    public static Scanner input = new Scanner(System.in);

    public static Satelite criar_satelites(){ //Cria um função com a tipagem "Satelite" e add as variaveis
        //String nome, float massa, String orbita, float energia, String status
        System.out.println("Nome: ");
        String nome = input.nextLine().toLowerCase();

        System.out.println("Massa: ");
        float massa = input.nextFloat();

        System.out.println("Orbita: ");
        String  orbita = input.nextLine();

        System.out.println("Energia: ");
        float energia = input.nextFloat();

        System.out.println("Status: ");
        String status = input.nextLine();

        return new Satelite(nome, massa, orbita, energia, status);
    }



    public static Foguete criar_foguetes(){
        //String nome, float combustivel, float carga, String status
        System.out.println("Nome: ");
        String nome = input.nextLine().toLowerCase();

        System.out.println("Combusivel: ");
        float combustivel = input.nextFloat();

        System.out.println("Carga: ");
        float carga = input.nextFloat();

        System.out.println("Status: ");
        String status = input.nextLine();

        return new Foguete(nome, combustivel, carga, status);
    }

    public static void Mostrar(ArrayList<Satelite> lista_satelites,ArrayList<Foguete> lista_foguetes){
        System.out.println("-----------------------------");
        System.out.println("Satelite=1");
        System.out.println("Foguete=2");
        System.out.println("Sair=3");
        System.out.println("-----------------------------");

        while(true){ //Inputs
            System.out.println("Qual deseja criar?");
            int resposta = input.nextInt();
            input.nextLine();
            if (resposta==3){
                System.out.println("Encerrando programa...");
                System.exit(0);
                break;
            }
            else{
                if(resposta==1){ //Satelite
                    Satelite satelite = Criacao.criar_satelites();
                    lista_satelites.add(satelite);
                }
                else{ //Foguete
                    Foguete foguete =  Criacao.criar_foguetes();
                    lista_foguetes.add(foguete);
                }
            }
        }
    }
}
