import java.util.Scanner;
import java.util.ArrayList;

class Missao{

    private String satelite;
    private String foguete;
    private int id;
    private static int contador=1;

    public Missao(String satelite,String foguete){
        this.satelite= satelite;
        this.foguete = foguete;
        this.id= contador++; //Ter um id pro cara escolher qual quiser ter o relatorio
    }

    public int getID(){
        return id;
    }

    public String getSat(){
        return satelite;
    }

    public String getFog(){
        return foguete;
    }

    @Override
    public String toString(){
        return "\n-----------\n" + "\nID: " + id + "\nSatelite: " + satelite + "\nFoguete: " + foguete;
    }
}

public class Main{
    public static Scanner input = new Scanner(System.in);

    public static Satelite criar_satelites(){ //Cria um função com a tipagem "Satelite" e add as variaveis
        //String nome, float massa, String orbita, float energia, String status
        System.out.println("Nome: ");
        String nome = input.nextLine();

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
        String nome = input.nextLine();

        System.out.println("Combusivel: ");
        float combustivel = input.nextFloat();

        System.out.println("Carga: ");
        float carga = input.nextFloat();

        System.out.println("Status: ");
        String status = input.nextLine();

        return new Foguete(nome, combustivel, carga, status);
    }

    public static void main(String[] args){
        ArrayList<Foguete> lista_foguetes = new ArrayList<>();
        ArrayList<Satelite> lista_satelites = new ArrayList<>();

        Foguete foguete1 = new Foguete("Apollo", 1000.0f, 500.0f, "Pronto para lançamento");
        Satelite satelite1 = new Satelite("Hubble",200f,"Lua",100f,"Lançado");

        Foguete foguete2 = new Foguete("Apollo02", 1000.0f, 500.0f, "Pronto para lançamento");
        Satelite satelite2 = new Satelite("Hubble02",200f,"Lua",100f,"Lançado");
        lista_satelites.add(satelite2);
        lista_satelites.add(satelite1);

        lista_foguetes.add(foguete1);
        lista_foguetes.add(foguete2);
        /*
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
                break;
            }
            else{
                if(resposta==1){ //Satelite
                    Satelite satelite = criar_satelites();
                    lista_satelites.add(satelite);
                }
                else{ //Foguete
                    Foguete foguete =  criar_foguetes();
                    lista_foguetes.add(foguete);
                }
            }
        }
        */

        System.out.println("-----------------------------");
        System.out.println("Sim=1");
        System.out.println("Não=2");
        System.out.println("-----------------------------");
        ArrayList<Missao> lista_missao = new ArrayList<>();
        while(true){
            System.out.print("Deseja iniciar a missão?\n");
            int resposta = input.nextInt();
            input.nextLine();
            if(resposta==2){
                System.out.println("Protocolo de envio de missão cancelado");
                break;
            }
            else{
                System.out.println("Coloque o nome do foguete: ");
                String nome_foguete = input.nextLine();


                System.out.println("Coloque o nome do satelite: ");
                String nome_satelite = input.nextLine();


                Missao missao = new Missao(nome_satelite,nome_foguete);
                lista_missao.add(missao);
                System.out.println("Missão enviada! \nID: " + missao.getID());
            }

        }

        for(Missao missao:lista_missao){
            System.out.println(missao);
        }
        System.out.println("\n-----------------------------");
        System.out.println("Sim=1");
        System.out.println("Não=2");
        System.out.println("-----------------------------");
        System.out.println("Deseja ver os relatorios das missões?");
        int resposta = input.nextInt();
        if(resposta==2){
            System.out.println("Encerrando programa...");
            System.exit(0);
        }
        else{
            while(true){
                System.out.println("-----------------------------");
                System.out.println("Para sair digite 0");
                System.out.println("-----------------------------");
                System.out.println("Digite o ID da missão");
                int respostaID = input.nextInt();
                if(respostaID==0){
                    System.out.println("Encerrando programa...");
                    System.exit(0);
                    break;
                }
                for(Missao m: lista_missao){
                    if(m.getID()== respostaID){ //Achou o ID então eu tenho os nomes
                        System.out.println("Missão encontrada!");
                        for(Satelite s:lista_satelites){
                            if(m.getSat().equals(s.getSat())){
                                System.out.println(s);
                            }
                        }
                        for(Foguete f:lista_foguetes){
                            if(m.getFog().equals(f.getFog())){
                                System.out.println(f);
                            }
                        }
                    }
                }
            }
        }

    }
}
