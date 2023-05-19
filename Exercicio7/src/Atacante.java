class Atacante extends Jogador {
    @Override
    public void atacar() {
        System.out.println("O atacante está atacando.");
    }

    @Override
    public void defender() {
        System.out.println("O atacante não defende.");
    }
}