public class Main {
    public static void main(String[] args) {
        // Caminhao
        Caminhao caminhao = new Caminhao();
        caminhao.carregar();
        caminhao.descarregar();
        System.out.println();

        // Trem
        Trem trem = new Trem();
        trem.carregar();
        trem.descarregar();
        System.out.println();

        // Navio
        Navio navio = new Navio();
        navio.carregar();
        navio.descarregar();
        System.out.println();
    }
}