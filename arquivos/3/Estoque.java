import java.io.*;
import java.util.*;

public class Estoque {
    private List<Produto> produtos;
    private String arquivoCsv;

    public Estoque(String arquivoCsv) {
        this.produtos = new ArrayList<>();
        this.arquivoCsv = arquivoCsv;
        carregarProdutos();
    }

    // Carrega os produtos do arquivo CSV
    private void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCsv))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                
                for (int i=0; i < dados.length; i++) {
                	System.out.println(dados[i]);
                }
                
                
                
                
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                int quantidade = Integer.parseInt(dados[2]);
                double preco = Double.parseDouble(dados[3]);
                produtos.add(new Produto(id, nome, quantidade, preco));
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar o arquivo: " + e.getMessage());
        }
    }

    // Salva todos os produtos de volta ao arquivo CSV
    private void salvarProdutos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCsv))) {
            for (Produto produto : produtos) {
                writer.write(produto.toCsv());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }

    // Adiciona um novo produto ao estoque
    public void adicionarProduto(String nome, int quantidade, double preco) {
        int id = produtos.size() + 1; // Gera um ID simples baseado na quantidade de produtos
        Produto novoProduto = new Produto(id, nome, quantidade, preco);
        produtos.add(novoProduto);
        salvarProdutos();
        System.out.println("Produto adicionado com sucesso!");
    }

    // Exclui um produto pelo ID
    public void excluirProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        salvarProdutos();
        System.out.println("Produto excluído com sucesso!");
    }

    // Atualiza a quantidade de um produto pelo ID
    public void atualizarQuantidade(int id, int novaQuantidade) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setQuantidade(novaQuantidade);
                salvarProdutos();
                System.out.println("Quantidade do produto atualizada!");
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    // Exibe todos os produtos no estoque
    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio!");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}
