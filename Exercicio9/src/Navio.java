class Navio extends Transporte {
    @Override
    public void carregar() {
        System.out.println("O navio está sendo carregado com contêineres.");
    }

    @Override
    public void descarregar() {
        System.out.println("O navio está descarregando os contêineres.");
    }
}