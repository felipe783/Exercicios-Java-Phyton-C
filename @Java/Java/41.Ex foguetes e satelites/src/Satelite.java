public class Satelite {

    private String nome;
    private float massa;
    private String orbita;
    private float energia;
    private String status;
    private boolean statusBO = true;

    public Satelite(String nome, float massa, String orbita, float energia, String status){
        this.nome=nome;
        this.massa=massa;
        this.orbita=orbita;
        this.energia=energia; //Seria a energia gasta MAX de 100
        this.status=status;
    }

    public String getSat(){
        return nome;
    }

    public void ativar_paineis(float energia_extra){
        this.energia -= energia_extra;
        if(this.energia<=0){
            System.out.println("Satelite "+ nome + " energia passou do limite MAX \nConsumo: " + energia );
            this.status="Desativado";
            statusBO=false;
        }
        else{
            System.out.println("Satelite "+ nome + " Paineis ativado  \nConsumo: " + energia );
        }
    }

    public void enviar_dados(String mensagem){
        if(statusBO){
            System.out.println("Satélite: " + nome + "\nEnviado: "+ mensagem);
        }
        else{
            System.out.println("Satélite desativado");
        }
    }

    @Override //So colocar um "...println(foguete)" ele vai imprimir bonito
    public String toString(){
        return ("\nNome: " + nome + "\nMassa: " + massa + "\nOrbita: " + orbita +"\nEnergia: " + energia + "\nStatus: " + status);
    }
}
