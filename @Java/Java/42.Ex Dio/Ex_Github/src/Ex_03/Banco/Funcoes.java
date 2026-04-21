package Ex_03.Banco;

public class Funcoes{
    Conta conta;

    double saldo = conta.getSaldo();
    double chequeEspecial = conta.getChequeEspecial();
    boolean usando = conta.getUsando();

    //Sacar
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;
        }
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            if (saldo < 0) {
                usando = true;
            }
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Pagar boleto
    public void pagarBoleto(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
            return;
        }

        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;

            //O cuque vai receber o saldo negativo
            if (saldo < 0) {
                usando = true;
                chequeEspecial = Math.abs(saldo); //Receber o saldo
            }
            System.out.println("Boleto pago");
            //Cobra a taxa de 20%
            if (usando && saldo >= 0) {
                double taxa = chequeEspecial * 0.2;
                saldo -= taxa;
                System.out.println("Taxa cobrada: " + taxa);
                usando = false; //Parou de usar
            }
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }


}
