import java.util.*;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos()
                     .stream()
                     .filter(p -> p.getCategoria() == CategoriaProduto.LIVRO)
                     .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                       .sorted(Comparator.comparing(Produto::getPreco).reversed())
                       .collect(Collectors.toList())
                       .get(0);
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos,
        double precoMinimo) {
        return produtos.stream()
                       .filter(p -> p.getPreco() >= precoMinimo)
                       .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                      .filter(p -> p.getProdutos().stream()
                                                  .anyMatch(e -> e.getCategoria() == CategoriaProduto.ELETRONICO))
                      .collect(Collectors.toList());
    }
}