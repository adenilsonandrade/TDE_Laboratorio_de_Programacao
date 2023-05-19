public class Main {
    public static void main(String[] args) {
        // DiscoRigido
        DiscoRigido discoRigido = new DiscoRigido();
        discoRigido.lerDados();
        discoRigido.gravarDados();
        System.out.println();

        // PenDrive
        PenDrive penDrive = new PenDrive();
        penDrive.lerDados();
        penDrive.gravarDados();
        System.out.println();

        // CartaoSD
        CartaoSD cartaoSD = new CartaoSD();
        cartaoSD.lerDados();
        cartaoSD.gravarDados();
        System.out.println();
    }
}