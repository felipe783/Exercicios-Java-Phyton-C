import java.util.ArrayList;
import java.util.Scanner;

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
public class Missao_geral {
    public static Scanner input = new Scanner(System.in);

    public static void Missao_Enviar(ArrayList<Missao> lista_missao,
                                     ArrayList<Satelite> lista_satelites,
                                     ArrayList<Foguete> lista_foguetes){

        System.out.println("-----------------------------");
        System.out.println("Sim=1");
        System.out.println("Não=2");
        System.out.println("-----------------------------");

        while(true){
            System.out.print("\nDeseja iniciar a missão?\n");
            int resposta = input.nextInt();
            input.nextLine();
            if(resposta==2){
                System.out.println("Protocolo de envio de missão cancelado");
                break;
            }
            else{
                System.out.println("Coloque o nome do foguete: ");
                String nome_foguete = input.nextLine().toLowerCase();

                System.out.println("Coloque o nome do satelite: ");
                String nome_satelite = input.nextLine().toLowerCase();

                for(Foguete f:lista_foguetes){ //Lançar o foguete
                    if(f.getFog().equals(nome_foguete)){
                        if(f.lancar()){
                            System.out.println("Foguete Lançado");
                            Missao missao = new Missao(nome_satelite,nome_foguete);
                            lista_missao.add(missao);
                            System.out.println("Missão enviada! \nID: " + missao.getID());
                        }
                        else{
                            System.out.println("Missão falha! \nPor conta da falta de combustivel");
                        }
                    }
                }
            }
        }
    }

    public static void Relatorios(ArrayList<Missao> lista_missao,ArrayList<Satelite> lista_satelites,ArrayList<Foguete> lista_foguetes){
        Scanner input = new Scanner(System.in);
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
            System.out.println("-----------------------------");
            System.out.println("Para sair digite 0");
            System.out.println("-----------------------------");
            while(true){
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
