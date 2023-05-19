class ArquivoAudio extends Arquivo {
    @Override
    public void abrir() {
        System.out.println("Arquivo de áudio aberto.");
    }

    @Override
    public void fechar() {
        System.out.println("Arquivo de áudio fechado.");
    }
}