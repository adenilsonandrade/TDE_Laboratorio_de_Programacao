class Caminhao extends Transporte {
    @Override
    public void carregar() {
        System.out.println("O caminhão está sendo carregado com mercadorias.");
    }

    @Override
    public void descarregar() {
        System.out.println("O caminhão está descarregando as mercadorias.");
    }
}