public class Circulo implements Forma{
    private double raio;

    public Circulo( int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        double area = Math.PI*Math.pow(raio, 2);
        return area;
    }
}
