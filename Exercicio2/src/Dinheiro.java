class Dinheiro extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado em dinheiro");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Recibo do pagamento em dinheiro emitido");
    }
}