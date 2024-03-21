package classes;

public class investimentos {
    private agencia agencia;
    private cliente cliente;
    private conta conta;
    private String gerente;
    private double saldo;
    private double investimento;

    public investimentos(agencia agencia, cliente cliente, conta conta, String gerente, double saldo, double investimento) {
        this.agencia = agencia;
        this.cliente = cliente;
        this.conta = conta;
        this.gerente = gerente;
        this.saldo = saldo;
        this.investimento = investimento;
    }

    public void impostoInvestimento() {
        double imposto = investimento * 0.1; // 10% de imposto
        System.out.println("Imposto sobre o investimento: " + imposto);
    }

    public void verificaSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public void imprimir() {
        System.out.println("Agência: " + agencia);
        System.out.println("Cliente: " + cliente);
        System.out.println("Conta: " + conta);
        System.out.println("Gerente: " + gerente);
        System.out.println("Saldo: " + saldo);
        System.out.println("Investimento: " + investimento);
    }
}
