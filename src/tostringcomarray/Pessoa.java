package tostringcomarray;

public class Pessoa {

    private final String nome;
    private final int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome +" e tenho " + idade +" anos";
    }
}
