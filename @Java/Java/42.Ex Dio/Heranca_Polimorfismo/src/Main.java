public class Main {
    public static void main(String[] args) {

        // =========================
        // TODO: HERANÇA
        // =========================
        /*
        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Felipe");
        manager.setLogin("felipe");
        manager.setPassword("123");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

        // Teste com métodos comentados
        manager.setName("Felipe");
        // manager.setLogin("felipe");
        // manager.setPassword("123");

        System.out.println(manager.getName());
        // System.out.println(manager.getLogin());
        // System.out.println(manager.getPassword());
        */

        // =========================
        // TODO: POLIMORFISMO
        // =========================

        // Objeto comum
        Employee employee = new Employee();

        // Polimorfismo: referência do tipo Employee apontando para Manager
        Employee manager = new Manager();

        // Classe abstrata não pode ser instanciada diretamente
        // AbsEmployee employee = new AbsEmployee(); // ERRO

        // Forma correta: usar uma classe que estende a abstrata
        AbsEmployee manager2 = new AbsManager();

        manager.setName("Felipe");

        // Métodos específicos de Manager não são acessíveis aqui
        // manager.setLogin("felipe");
        // manager.setPassword("123");

        System.out.println(manager.getName());

        /*
        =========================
        TODO: OBSERVAÇÕES IMPORTANTES
        =========================

        TODO: FINAL:
        - Impede que a classe seja herdada
        - Última da hierarquia

        TODO: SEALED:
        - Permite herança, mas só para classes específicas
        - Controla quem pode dar extends

        =========================
        TODO: HERANÇA
        =========================
        Uma classe pode usar coisas de outra.
        É como se uma "filha" aproveitasse o que a "mãe" já tem.
        Evita repetir código e deixa tudo mais simples.

        =========================
        TODO: POLIMORFISMO
        =========================
        Um mesmo tipo pode se comportar de jeitos diferentes.
        Você usa ele de forma geral, mas por trás cada um age do seu próprio jeito.

        =========================
        TODO: CLASSE ABSTRATA
        =========================
        É um modelo base.
        Não pode ser usado direto, só serve pra outras classes usarem.

        =========================
        TODO: FINAL
        =========================
        Essa classe não pode ser usada como base pra outras.
        Ela é o fim da linha.

        =========================
        TODO: SEALED
        =========================
        Só algumas classes podem usar ela como base.
        Você controla quem pode usar.
        */
    }
}