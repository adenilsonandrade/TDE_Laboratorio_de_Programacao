class CartaoDeDebito extends Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de débito");
    }

    @Override
    public void emitirRecibo() {
        System.out.println("Recibo do pagamento com cartão de débito emitido");
    }
}