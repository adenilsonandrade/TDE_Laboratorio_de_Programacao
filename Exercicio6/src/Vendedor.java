class Vendedor extends Funcionario {
    @Override
    public double calcularSalario() {
        // Lógica para calcular o salário de um vendedor
        return 3000.0;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("O vendedor está fazendo uma venda.");
    }
}