class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("O gato está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo.");
    }

    @Override
    public void mover() {
        System.out.println("O gato está se movendo.");
    }
}