public class Quadrado implements Forma{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado*lado;
       return area;
    }
}
