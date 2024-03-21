package principal;

import classes.*;

public class principal {
    public static void main(String[] args) {
        // Criando objetos cliente
        cliente cliente1 = new cliente("João", 30, 'M', "Rua A, 123", "Cidade A");
        cliente cliente2 = new cliente("Maria", 25, 'F', "Rua B, 456", "Cidade B");

        // Criando objetos Agencia
        agencia agencia1 = new agencia(1, "Agência A", "Av. Principal, 789", "Carlos", true);
        agencia agencia2 = new agencia(2, "Agência B", "Av. Secundária, 1011", "Ana", false);

        // Criando objetos Conta
        conta conta1 = new conta(1001, 5000);
        conta conta2 = new conta(1002, 10000);

        // Criando objetos Investimentos
        investimentos investimento1 = new investimentos(agencia1, cliente1, conta1, "Carlos", 5000, 10000);
        investimentos investimento2 = new investimentos(agencia2, cliente2, conta2, "Ana", 10000, 20000);

        // Testando métodos
        cliente1.imprimir();
        System.out.println();
        cliente2.imprimir();
        System.out.println();

        agencia1.imprimir();
        System.out.println();
        agencia2.imprimir();
        System.out.println();

        conta1.sacar(2000);
        conta1.depositar(1000);
        conta1.imprimir();
        System.out.println();

        investimento1.imprimir();
        investimento1.impostoInvestimento();
        investimento1.verificaSaldo();
        System.out.println();

        investimento2.imprimir();
        investimento2.impostoInvestimento();
        investimento2.verificaSaldo();
    }
}