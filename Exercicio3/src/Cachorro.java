class Cachorro extends Animal {
    @Override
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro está se movendo.");
    }
}