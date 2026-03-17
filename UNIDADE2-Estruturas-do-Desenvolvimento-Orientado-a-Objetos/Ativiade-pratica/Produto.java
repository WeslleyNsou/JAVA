public class Produto {
    public String nome;
    public double preco;
    static int quantidadeProdutos = 0;
  
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        quantidadeProdutos++;
    }
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 2.50;
        quantidadeProdutos++;
    }

    public void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço: " + preco);
    }
}
