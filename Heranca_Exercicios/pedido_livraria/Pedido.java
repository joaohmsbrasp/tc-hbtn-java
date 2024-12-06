public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return this.percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return this.itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido i : this.itens) {
            total += i.getQuantidade() * i.getProduto().obterPrecoLiquido();
        }

        if (this.percentualDesconto != 0) {
            total -= (total * percentualDesconto / 100);
        }

        return total;
    }
}
