class Livro extends Produto {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$" + preco);
    }
}