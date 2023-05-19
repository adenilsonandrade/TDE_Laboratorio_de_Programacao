public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4.0);
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        System.out.println("Círculo:");
        System.out.println("Área: " + areaCirculo);
        System.out.println("Perímetro: " + perimetroCirculo);
        System.out.println();

        Retangulo retangulo = new Retangulo(3.0, 8.0);
        double areaRetangulo = retangulo.calcularArea();
        double perimetroRetangulo = retangulo.calcularPerimetro();
        System.out.println("Retângulo:");
        System.out.println("Área: " + areaRetangulo);
        System.out.println("Perímetro: " + perimetroRetangulo);
        System.out.println();

        Triangulo triangulo = new Triangulo(2.0, 3.0, 4.0);
        double areaTriangulo = triangulo.calcularArea();
        double perimetroTriangulo = triangulo.calcularPerimetro();
        System.out.println("Triângulo:");
        System.out.println("Área: " + areaTriangulo);
        System.out.println("Perímetro: " + perimetroTriangulo);
        System.out.println();
    }
}