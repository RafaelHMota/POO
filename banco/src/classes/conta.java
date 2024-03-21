package classes;

public class conta {
    private int numero;
    private double saldo;

    public conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void imprimir() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
