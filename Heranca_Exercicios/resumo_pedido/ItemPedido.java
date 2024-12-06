import produtos.*;

public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("%s  Quant: %d  Total: %.2f", produto.toString(), quantidade,
                quantidade * produto.obterPrecoLiquido());
    }
}