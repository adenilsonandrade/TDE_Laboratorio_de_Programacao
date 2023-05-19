class CartaoSD extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados do cartão SD.");
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no cartão SD.");
    }
}