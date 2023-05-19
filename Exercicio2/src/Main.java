public class Main {
    public static void main(String[] args) {
        // Cartao Credito
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        cartaoDeCredito.realizarPagamento();
        cartaoDeCredito.emitirRecibo();
        System.out.println();

        // Cartao Debito
        CartaoDeDebito cartaoDeDebito = new CartaoDeDebito();
        cartaoDeDebito.realizarPagamento();
        cartaoDeDebito.emitirRecibo();
        System.out.println();

        // Dinheiro
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.realizarPagamento();
        dinheiro.emitirRecibo();
        System.out.println();
    }
}