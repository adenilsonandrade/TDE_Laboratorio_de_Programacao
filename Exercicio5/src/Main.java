public class Main {
    public static void main(String[] args) {
        // Livro
        Livro livro = new Livro("Livro", "Autor", 29.90);
        livro.exibirDetalhes();
        System.out.println("Preço Total: R$" + livro.calcularPreco());
        System.out.println();

        // Roupa
        Roupa roupa = new Roupa("Camiseta", "M", 59.90);
        roupa.exibirDetalhes();
        System.out.println("Preço Total: R$" + roupa.calcularPreco());
        System.out.println();

        // Eletronico
        Eletronico eletronico = new Eletronico("Samsung", "Smart TV", 1999.90);
        eletronico.exibirDetalhes();
        System.out.println("Preço Total: R$" + eletronico.calcularPreco());
        System.out.println();
    }
}