class ImpressoraJatoTinta extends Impressora {
    @Override
    public void imprimir() {
        System.out.println("A impressora a jato de tinta está imprimindo um documento.");
    }

    @Override
    public void escanear() {
        System.out.println("A impressora a jato de tinta está escaneando um documento.");
    }
}