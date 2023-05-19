public class Main {
    public static void main(String[] args) {
        // ImpressoraJatoTinta
        ImpressoraJatoTinta jatoTinta = new ImpressoraJatoTinta();
        jatoTinta.imprimir();
        jatoTinta.escanear();
        System.out.println();

        // ImpressoraLaser
        ImpressoraLaser laser = new ImpressoraLaser();
        laser.imprimir();
        laser.escanear();
        System.out.println();

        // ImpressoraMatricial
        ImpressoraMatricial matricial = new ImpressoraMatricial();
        matricial.imprimir();
        matricial.escanear();
        System.out.println();
    }
}