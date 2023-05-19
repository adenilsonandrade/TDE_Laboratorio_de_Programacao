class Estagiario extends Funcionario {
    @Override
    public double calcularSalario() {
        // Lógica para calcular a bolsa de um estagiário
        return 1000.0;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("O estagiário auxiliando.");
    }
}