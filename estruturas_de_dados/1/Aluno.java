import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Aluno {
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método toString para exibir informações do aluno
    @Override
    public String toString() {
        return "Aluno: " + nome + ", Idade: " + idade;
    }
}

