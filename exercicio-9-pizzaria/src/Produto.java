public class Produto {
    String sabor;
    String tamanho;
    double preco;

    public Produto(String sabor, String tamanho, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    public String toString() {
        return tamanho + " - " + sabor + " | R$ " + preco;
    }
}
