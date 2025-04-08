
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

    public class Exercicio07 {
        static List<Produto> estoque = new ArrayList<>();

        static class Produto {
            private String nome;
            private String codigo;
            private double preco;
            private int quantidadeEstoque;

            public Produto(String nome, String codigo, double preco, int quantidadeEstoque) {
                this.nome = nome;
                this.codigo = codigo;
                this.preco = preco;
                this.quantidadeEstoque = quantidadeEstoque;
            }

            public String getNome() {
                return nome;
            }

            public String getCodigo() {
                return codigo;
            }

            public double getPreco() {
                return preco;
            }

            public int getQuantidadeEstoque() {
                return quantidadeEstoque;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public void setPreco(double preco) {
                this.preco = preco;
            }

            public void setQuantidadeEstoque(int quantidadeEstoque) {
                this.quantidadeEstoque = quantidadeEstoque;
            }

            public String toString() {
                return "Nome: " + nome + ", Código: " + codigo + ", Preço: R$" + String.format("%.2f", preco) + ", Estoque: " + quantidadeEstoque;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n--- Sistema do Mercado Feliz ---");
                System.out.println("1. Adicionar Produto");
                System.out.println("2. Atualizar Produto");
                System.out.println("3. Remover Produto");
                System.out.println("4. Listar Estoque");
                System.out.println("5. Gerar Relatório de Estoque");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarProduto(scanner);
                        break;
                    case 2:
                        atualizarProduto(scanner);
                        break;
                    case 3:
                        removerProduto(scanner);
                        break;
                    case 4:
                        listarEstoque();
                        break;
                    case 5:
                        gerarRelatorioEstoque();
                        break;
                    case 0:
                        System.out.println("Saindo do sistema! Volto logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Se atente!");
                }
            } while (opcao != 0);

            scanner.close();
        }

        private static void adicionarProduto(Scanner scanner) {
            System.out.println("\n--- Adicionar Produto ---");
            System.out.print("Nome do produto: ");
            String nome = scanner.nextLine();
            System.out.print("Código do produto: ");
            String codigo = scanner.nextLine();
            if (buscarProdutoPorCodigo(codigo) != null) {
                System.out.println("Erro: Já existe um produto com este código.");
                return;
            }
            System.out.print("Preço do produto: ");
            double preco = scanner.nextDouble();
            System.out.print("Quantidade em estoque: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Produto novoProduto = new Produto(nome, codigo, preco, quantidade);
            estoque.add(novoProduto);
            System.out.println("Produto adicionado com sucesso!");
        }

        private static void atualizarProduto(Scanner scanner) {
            System.out.println("\n--- Atualizar Produto ---");
            System.out.print("Digite o código do produto que deseja atualizar: ");
            String codigo = scanner.nextLine();

            Produto produtoEncontrado = buscarProdutoPorCodigo(codigo);

            if (produtoEncontrado != null) {
                System.out.println("Produto encontrado: " + produtoEncontrado);
                System.out.print("Novo nome (deixe em branco para manter): ");
                String novoNome = scanner.nextLine();
                if (!novoNome.isEmpty()) {
                    produtoEncontrado.setNome(novoNome);
                }
                System.out.print("Novo preço (digite -1 para manter): ");
                double novoPreco = scanner.nextDouble();
                if (novoPreco != -1) {
                    produtoEncontrado.setPreco(novoPreco);
                }
                System.out.print("Nova quantidade em estoque (digite -1 para manter): ");
                int novaQuantidade = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha
                if (novaQuantidade != -1) {
                    produtoEncontrado.setQuantidadeEstoque(novaQuantidade);
                }
                System.out.println("Produto atualizado com sucesso!");
            } else {
                System.out.println("Erro: Produto com o código '" + codigo + "' não encontrado.");
            }
        }

        private static void removerProduto(Scanner scanner) {
            System.out.println("\n--- Remover Produto ---");
            System.out.print("Digite o código do produto que deseja remover: ");
            String codigo = scanner.nextLine();

            Produto produtoParaRemover = buscarProdutoPorCodigo(codigo);

            if (produtoParaRemover != null) {
                estoque.remove(produtoParaRemover);
                System.out.println("Produto com o código '" + codigo + "' removido com sucesso!");
            } else {
                System.out.println("Erro: Produto com o código '" + codigo + "' não encontrado.");
            }
        }

        private static void listarEstoque() {
            System.out.println("\n--- Listagem de Estoque ---");
            if (estoque.isEmpty()) {
                System.out.println("O estoque está vazio.");
            } else {
                for (Produto produto : estoque) {
                    System.out.println(produto);
                }
            }
        }

        private static void gerarRelatorioEstoque() {
            System.out.println("\n--- Relatório de Estoque ---");
            if (estoque.isEmpty()) {
                System.out.println("O estoque está vazio.");
                return;
            }

            System.out.println("Produtos Disponíveis:");
            double valorTotalEstoque = 0;
            for (Produto produto : estoque) {
                System.out.println(produto);
                valorTotalEstoque += produto.getPreco() * produto.getQuantidadeEstoque();
            }

            System.out.println("\nValor Total do Estoque: R$" + String.format("%.2f", valorTotalEstoque));
        }

        private static Produto buscarProdutoPorCodigo(String codigo) {
            for (Produto produto : estoque) {
                if (produto.getCodigo().equals(codigo)) {
                    return produto;
                }
            }
            return null;
        }
    }