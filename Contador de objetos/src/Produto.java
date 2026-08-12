public class Produto {

    static int totalProdutos = 0;
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        String Nome = nome;
        double Preco = preco;
        totalProdutos++;
    }
    public static int getTotalProdutos(){
        return totalProdutos;
    }

}
