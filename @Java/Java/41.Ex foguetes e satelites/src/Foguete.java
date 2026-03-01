public class Foguete {

    private String nome;
    private float combustivel;
    private float carga;
    private String status;
    private boolean statusBO = true;

    public Foguete(String nome, float combustivel, float carga, String status){
        this.nome = nome;
        this.combustivel = combustivel;
        this.carga = carga;
        this.status = status;
    }
    public String getFog(){
        return nome;
    }
    public void abastecer(float abastecimento){
        this.combustivel += abastecimento;
    }

    public void lancar(String status){
        if(this.combustivel>50){
            this.status = "Lançado";
        }
        else{
            this.status="Falha";
            statusBO = false;
        }

    }

    @Override //So colocar um "...println(foguete)" ele vai imprimir bonito
    public String toString(){
        return ("\nNome: " + nome + "\nCombustivel: " + combustivel + "\nCarga: " + carga + "\nStatus: " + status);
    }
}