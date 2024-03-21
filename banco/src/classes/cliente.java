package classes;

public class cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String endereco;
    private String cidade;

    public cliente(String nome, int idade, char sexo, String endereco, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
    }
}
