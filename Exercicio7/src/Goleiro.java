class Goleiro extends Jogador {
    @Override
    public void atacar() {
        System.out.println("O goleiro não ataca.");
    }

    @Override
    public void defender() {
        System.out.println("O goleiro está defendendo o gol.");
    }
}