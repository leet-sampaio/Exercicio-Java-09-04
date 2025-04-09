import java.util.ArrayList;
import java.util.List;

public class Pedido {
    String cliente;
    String endereco;
    int idPedido;
    List<Produto> produtos = new ArrayList<>();

    public Pedido(String cliente, String endereco, int idPedido) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.idPedido = idPedido;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto p : produtos) {
            total += p.preco;
        }
        return total;
    }
    public String toString() {
        String resultado = "Pedido #" + idPedido + "\nCliente: " + cliente + "\nEndereço: " + endereco + "\nProdutos:\n";
        for (Produto p : produtos) {
            resultado += "- " + p.sabor + " (" + p.tamanho + ") - R$ " + p.preco + "\n";
        }

        resultado += "Total: R$ " + calcularTotal();
        return resultado;
    }

}
