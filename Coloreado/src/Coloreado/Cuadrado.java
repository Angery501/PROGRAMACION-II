package Coloreado;

class Cuadrado extends Figura implements Coloreado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    @Override
    public String toString() {
        return "Cuadrado | Lado: " + lado + 
               " | Área: " + area() + 
               " | Perímetro: " + perimetro();
    }
}
