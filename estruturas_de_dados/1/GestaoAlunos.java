import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestaoAlunos {
    private List<Aluno> alunos;

    // Construtor que inicializa a lista de alunos
    public GestaoAlunos() {
        alunos = new ArrayList<>();
    }

    // Método para adicionar um aluno à lista
    public void adicionarAluno(String nome, int idade) {
        alunos.add(new Aluno(nome, idade));
        System.out.println("Aluno " + nome + " adicionado com sucesso!");
    }

    // Método para excluir um aluno pelo nome
    public void excluirAluno(String nome) {
        Iterator<Aluno> it = alunos.iterator();
        while (it.hasNext()) {
            Aluno aluno = it.next();
            if (aluno.getNome().equals(nome)) {
                it.remove();
                System.out.println("Aluno " + nome + " excluído com sucesso!");
                return;
            }
        }
        System.out.println("Aluno " + nome + " não encontrado!");
    }

    // Método para buscar um aluno pelo nome e exibir suas informações
    public void buscarAluno(String nome) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                System.out.println(aluno);
                return;
            }
        }
        System.out.println("Aluno " + nome + " não encontrado!");
    }

    // Método para exibir todos os alunos cadastrados
    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public static void main(String[] args) {
        GestaoAlunos gestao = new GestaoAlunos();

        // Adicionando alunos
        gestao.adicionarAluno("Carlos", 20);
        gestao.adicionarAluno("Maria", 22);
        gestao.adicionarAluno("Ana", 19);

        // Listando todos os alunos
        System.out.println("\nLista de alunos:");
        gestao.listarAlunos();

        // Buscando um aluno
        System.out.println("\nBuscando aluno 'Carlos':");
        gestao.buscarAluno("Carlos");

        // Excluindo um aluno
        System.out.println("\nExcluindo aluno 'Maria':");
        gestao.excluirAluno("Maria");

        // Listando novamente após a exclusão
        System.out.println("\nLista de alunos após exclusão:");
        gestao.listarAlunos();

        // Tentando excluir um aluno que não existe
        System.out.println("\nTentando excluir aluno 'João' que não existe:");
        gestao.excluirAluno("João");

        // Buscando um aluno inexistente
        System.out.println("\nBuscando aluno 'Ana':");
        gestao.buscarAluno("Ana");
    }
}
