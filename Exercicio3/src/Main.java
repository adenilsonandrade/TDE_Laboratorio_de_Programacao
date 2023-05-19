public class Main {
    public static void main(String[] args) {
        // Cachorro
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();
        cachorro.mover();
        System.out.println();

        // Gato
        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        gato.mover();
        System.out.println();

        // Peixe
        Peixe peixe = new Peixe();
        peixe.comer();
        peixe.dormir();
        peixe.mover();
        System.out.println();
    }
}