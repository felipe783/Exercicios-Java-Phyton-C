import java.util.Scanner;

/*Calculadora de IMC (Índice de Massa Corporal): Crie um programa que leia o peso (em kg) e a altura (em metros) de uma
pessoa via console, calcule o IMC (IMC = peso / altura2) e exiba o resultado com uma mensagem descritiva (ex.: "Abaixo do
peso", "Normal", etc.). Inclua pseudocódigo no comentário inicial. Extensão: Aplique em um sistema de saúde para monitorar
pacientes.*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double peso=0,altura=0,imc=0;
        //Aqui é onde entra os valores
        System.out.println("Fale seu peso:");
        peso = input.nextDouble();
        System.out.println("Fale sua altura:");
        altura = input.nextDouble();
        imc=peso/(altura*altura);
        //Os if pra ver se ta no pesinho certo
        if(imc<18.5){
            System.out.println("Baixo peso");
        }
        else{
            if(imc>=18.5 && imc<24.99){
                System.out.println("Normal");
            }
            else{
                if(imc>25 && imc<29.99){
                    System.out.println("Sobrepeso");
                }
                else{
                    System.out.println("Obesidade");
                }
            }
        }
    }
}   
