class Eletronico extends Produto {
    private String marca;
    private String modelo;
    private double preco;

    public Eletronico(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    @Override
    public double calcularPreco() {
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Eletrônico: " + marca + " " + modelo);
        System.out.println("Preço: R$" + preco);
    }
}