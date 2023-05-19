class CartaoDeCredito extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Recibo do pagamento com cartão de crédito emitido");
    }
}