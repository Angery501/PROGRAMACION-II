package Coloreado;
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo | Radio: " + radio + 
               " | Área: " + area() + 
               " | Perímetro: " + perimetro();
    }
}
