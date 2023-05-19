class MeioCampo extends Jogador {
    @Override
    public void atacar() {
        System.out.println("O meio-campo está apoiando o ataque.");
    }

    @Override
    public void defender() {
        System.out.println("O meio-campo não defende.");
    }
}