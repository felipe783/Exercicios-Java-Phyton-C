import java.util.Scanner;
import java.util.ArrayList;
//O if ta dando errado
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.1415926;
        int i = 0, cont = 0;
        float comprimento, largura, Raio1, Raio2;
        ArrayList<Float> C = new ArrayList<>();
        ArrayList<Float> L = new ArrayList<>();
        ArrayList<Float> R1 = new ArrayList<>();
        ArrayList<Float> R2 = new ArrayList<>();
        ArrayList<Double> AreaCirc = new ArrayList<>();
        ArrayList<Float> AreaRet= new ArrayList<>();
        boolean aux = true;
        //O codigo tem que parar em 0,0,0,0
        while (aux) {
            comprimento = input.nextFloat();
            largura = input.nextFloat();
            Raio1 = input.nextFloat();
            Raio2 = input.nextFloat();
            //Se for 0,0,0,0 sai do while
            if (comprimento == 0 && largura == 0 && Raio1 == 0 && Raio2 == 0) {
                break;
            }
            C.add(comprimento);
            L.add(largura);
            R1.add(Raio1);
            R2.add(Raio2);
        }
        float diametro=0;
        float maiorRaio=0;
        for(i=0;i<R1.size();i++){
            diametro=(R1.get(i)*2)+(R2.get(i)*2);
            maiorRaio=Math.max(R1.get(i),R2.get(i));
            //Ver se cabe ou não
                //Horizontal                                  //Vertical
            if((maiorRaio<=C.get(i) && diametro<=L.get(i)) || (maiorRaio<=L.get(i)&& diametro<=C.get(i))  ){
                System.out.println("S");
            }
            else{
                System.out.println("N");
            }
        }
    }
}
