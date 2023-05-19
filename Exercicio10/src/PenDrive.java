class PenDrive extends DispositivoArmazenamento {
    @Override
    public void lerDados() {
        System.out.println("Lendo dados do pen drive.");
    }

    @Override
    public void gravarDados() {
        System.out.println("Gravando dados no pen drive.");
    }
}