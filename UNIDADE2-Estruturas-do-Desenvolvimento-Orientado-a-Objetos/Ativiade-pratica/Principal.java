public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Lapis", 3.50);
        Produto p2 = new Produto("Caneta Azul");
        Produto p3 = new Produto("Caneta Vermelha");
        
        p1.exibirDetalhes();
        p2.exibirDetalhes();
        p3.exibirDetalhes();
        System.out.println("Quantidade total de produtos: " + Produto.quantidadeProdutos);
    }
}
