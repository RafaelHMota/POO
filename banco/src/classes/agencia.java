package classes;

public class agencia {
    private int codigo;
    private String nomeAgencia;
    private String endereco;
    private String nomeGerente;
    private boolean movimentacao;

    public agencia(int codigo, String nomeAgencia, String endereco, String nomeGerente, boolean movimentacao) {
        this.codigo = codigo;
        this.nomeAgencia = nomeAgencia;
        this.endereco = endereco;
        this.nomeGerente = nomeGerente;
        this.movimentacao = movimentacao;
    }

    public void imprimir() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome da Agência: " + nomeAgencia);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nome do Gerente: " + nomeGerente);
        System.out.println("Movimentação: " + (movimentacao ? "Ativa" : "Inativa"));
    }
}
