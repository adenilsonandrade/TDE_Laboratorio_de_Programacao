class Peixe extends Animal {
    @Override
    public void comer() {
        System.out.println("O peixe está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O peixe está dormindo.");
    }

    @Override
    public void mover() {
        System.out.println("O peixe está nadando.");
    }
}