class Trem extends Transporte {
    @Override
    public void carregar() {
        System.out.println("O trem está sendo carregado com vagões de carga.");
    }

    @Override
    public void descarregar() {
        System.out.println("O trem está descarregando os vagões de carga.");
    }
}