public class Main {
    public static void main(String[] args) {
        // ArquivoTexto
        ArquivoTexto arquivoTexto = new ArquivoTexto();
        arquivoTexto.abrir();
        arquivoTexto.fechar();
        System.out.println();

        // ArquivoImagem
        ArquivoImagem arquivoImagem = new ArquivoImagem();
        arquivoImagem.abrir();
        arquivoImagem.fechar();
        System.out.println();

        // ArquivoAudio
        ArquivoAudio arquivoAudio = new ArquivoAudio();
        arquivoAudio.abrir();
        arquivoAudio.fechar();
        System.out.println();
    }
}