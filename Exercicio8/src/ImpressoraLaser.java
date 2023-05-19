class ImpressoraLaser extends Impressora {
    @Override
    public void imprimir() {
        System.out.println("A impressora a laser está imprimindo um documento.");
    }

    @Override
    public void escanear() {
        System.out.println("A impressora a laser está escaneando um documento.");
    }
}