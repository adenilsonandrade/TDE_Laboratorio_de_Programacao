class ImpressoraMatricial extends Impressora {
    @Override
    public void imprimir() {
        System.out.println("A impressora matricial está imprimindo um documento.");
    }

    @Override
    public void escanear() {
        System.out.println("A impressora matricial não possui a função de scanner.");
    }
}