class Gerente extends Funcionario {
    @Override
    public double calcularSalario() {
        // Lógica para calcular o salário de um gerente
        return 5000.0;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("O gerente está coordenando a equipe.");
    }
}