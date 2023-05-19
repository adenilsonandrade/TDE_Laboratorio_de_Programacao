public class Main {
    public static void main(String[] args) {
        // Gerente
        Gerente gerente = new Gerente();
        System.out.println("Salário do gerente: R$" + gerente.calcularSalario());
        gerente.realizarTarefa();
        System.out.println();

        // Vendedor
        Vendedor vendedor = new Vendedor();
        System.out.println("Salário do vendedor: R$" + vendedor.calcularSalario());
        vendedor.realizarTarefa();
        System.out.println();

        // Estagiario
        Estagiario estagiario = new Estagiario();
        System.out.println("Bolsa do estagiário: R$" + estagiario.calcularSalario());
        estagiario.realizarTarefa();
        System.out.println();
    }
}